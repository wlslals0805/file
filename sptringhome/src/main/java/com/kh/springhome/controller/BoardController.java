package com.kh.springhome.controller;

import java.sql.Timestamp;
import java.time.Duration;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.kh.springhome.dao.BoardDao;
import com.kh.springhome.dao.MemberDao;
import com.kh.springhome.dao.SaveDao;
import com.kh.springhome.dto.BoardDto;
import com.kh.springhome.dto.BoardListDto;
import com.kh.springhome.dto.MemberDto;
import com.kh.springhome.dto.SaveDto;
import com.kh.springhome.error.NoTargetException;

import lombok.extern.slf4j.Slf4j;



//게시판 관련 기능을 처리하는 컨트롤러 
@Slf4j
@Component
@Controller
@RequestMapping("/board")
public class BoardController {
	
	
	@Autowired
	private BoardDao boardDao;
	
	@Autowired 
	private MemberDao memberDao;
	
	@Autowired
	private SaveDao dao;
	
	
	
	//등록(새글 or 답글)
	//- boardParent라는 항목의 유무에 따라 새글과 답글을 구분하여 처리
	
	@GetMapping("/write")
	public String write(Model model, @RequestParam(required = false) Integer boardParent) {
		
		if(/*답글이라면*/boardParent!=null) {
			//답글이라면 원본글 정보를 화면에 전달
			
			BoardDto originDto = boardDao.selectOne(boardParent);
			model.addAttribute("originDto",originDto);
			model.addAttribute("isReply",true);
			
		}
		
		else {//새글=boardParent가 없으면
			
			model.addAttribute("isReply", false);
			
		}
		return "/WEB-INF/views/board/write.jsp";
	}
	
	@PostMapping("/write")
	public String write(@ModelAttribute BoardDto boardDto,HttpSession session) throws InterruptedException {
		
		String memberId=(String) session.getAttribute("name");
		
		int boardNo=boardDao.sequence();
		
		boardDto.setBoardNo(boardNo);
		boardDto.setBoardWriter(memberId);
		
		//글 등록 전에 새글/답글에 따른 그룹, 상위글, 차수를 계산
		if(boardDto.getBoardParent()==null) {//새글일 경우
			boardDto.setBoardGroup(boardNo);
//			boardDto.setBoardParent(null);
//			boardDto.setBoardDepth(0);
		}
		
		else { //답글일 경우
			BoardDto originDto = boardDao.selectOne(boardDto.getBoardParent());
			log.debug("originDto = {}", originDto);
			boardDto.setBoardGroup(originDto.getBoardGroup());	//그룹번호는 원본글 번호와 같다
			boardDto.setBoardParent(originDto.getBoardNo());//상위글 번호는 원본글 번호
			boardDto.setBoardDepth(originDto.getBoardDepth()+1);//차수는 원본글 차수 +1 
		}
		
		log.debug("boardDto = {}", boardDto);
		
		
		//이 사용자의 마지막 글번호를 조회
		Integer lastNo = boardDao.selectMax(memberId);
		
		//글을 등록하고
		boardDao.insert(boardDto);
		
		//포인트 계산 작업
		//-lastNo가 null이라는 것은 처음 글을 작성했다는 의미
		//-lastNo가 null이 아니면 조회한 다음 시간차를 비교
		
		if(lastNo == null) {//처음이라면
			
			memberDao.increaseMemberPoint(memberId, 10);
			
		}
		else {//처음이 아니라면 시간 차이를 계산
			BoardDto lastDto = boardDao.selectOne(lastNo);
			Timestamp stamp = new Timestamp(lastDto.getBoardCtime().getTime());
			LocalDateTime lastTime = stamp.toLocalDateTime();
			LocalDateTime currentTime = LocalDateTime.now();
			
			Duration duration = Duration.between(lastTime,currentTime);
			long seconds = duration.getSeconds();
			if(seconds>300) {//시간차가 300초보다 크다면(5분 초과)
				
				memberDao.increaseMemberPoint(memberId, 10); //10점 부여
				
			}
			
		}
		
		
		
		return "redirect:/board/detail?boardNo="+boardNo;
		
	}

	@GetMapping("/list")
	public String list(Model model,HttpSession session, @RequestParam(required = false) String type, @RequestParam(required = false) String keyword) {
		
		List<BoardListDto> list;
		
		if(type==null&&keyword==null) {
		
		list = boardDao.detailList();
		
		}
		
//		List<BoardListDto> list = boardDao.selectListByPage(page);
		
		else {
			
			list = boardDao.searchList(type, keyword);
			
		}

		model.addAttribute("list", list);
		
		
		return "/WEB-INF/views/board/list.jsp";
		
	}
	
	//조회수 중복 방지를 위한 마스터플랜
//	1.세션에 history라는 이름의 저장소가 있는지 확인
//	2.없으면 생성, 있으면 추출
//	3.지금 읽는 글 번호가 history에 존재하는지 확인
//	4.없으면 추가하고 다시 세션에 저장
	
//	1.

	
	
	
	
	//목록 + 검색
	//-검색일 경우에는 type과 keyword라는 파라미터가 존재
	//-목록일 경우에는 type과 keyword라는 파라미터가 없음
	//-만약 불완전한 상태(type이나 keyword만 있는 경우)라면 목록으로 처리
	@PostMapping("/list")
	public String list(Model model,HttpSession session,String search,String type,int page) {
		
		List<BoardListDto> list = boardDao.detailList();
		int result=0;
	
		if(type.equals("제목")) {
		
		for(BoardListDto a:list) {
			
			if(a.getBoardTitle().startsWith(search)) {
				result++;	
			}	
		}

		if(result>=1) {
			
//			List<BoardDto> tList = boardDao.selectTitle(search+"%");
			List<BoardListDto> tList = boardDao.selectListByPage((search+"%"),page);
			
			model.addAttribute("tList", tList);
			
			
			return "/WEB-INF/views/board/searchList.jsp";
		}
		
		else {
			return "redirect:/board/list?error";
			
		}
		
		}
		
		else if(type.equals("작성자")) {
			
			for(BoardListDto a:list) {
				
				if(a.getBoardWriter()==null) {
					
					continue;
					
				}
				if(a.getBoardWriter().startsWith(search)) {
					
					result++;
					
				}	}
			
			if(result>=1) {
				
				List<BoardDto> tList = boardDao.selectWriter(search+"%");
				
				model.addAttribute("tList", tList);
				
				
				return "/WEB-INF/views/board/searchList.jsp";
			}
			
			else {
				return "redirect:/board/list?error2";
				
			}
			}
		else {
			
			return "redirect:/board/list";
		}
		
		}

//	@RequestMapping("/detail")
//	public String detail(@RequestParam int boardNo,Model model,HttpSession session,HttpSession session2) {
//		String memberId=(String) session.getAttribute("name");
//		BoardDto boardDto = boardDao.seletOne(boardNo);
//		
//		
//		
//		if(memberId!=null&&memberId.equals(boardDto.getBoardWriter())) {
//			
//			boardDto.setBoardReadcount(boardDto.getBoardReadcount());}
//	
//		else {
//			
//			boardDto.setBoardReadcount(boardDto.getBoardReadcount()+1);
//		}
//
//		model.addAttribute("boardDto",boardDto);
//
//		boardDao.updateView(boardDto);
//
//		return "/WEB-INF/views/board/detail.jsp";
//		
//	}
	
	@RequestMapping("/detail")
	public String detail(@RequestParam int boardNo,Model model,HttpSession session,HttpSession session2,SaveDto dto) {
		String memberId=(String) session.getAttribute("name");
		BoardDto boardDto = boardDao.selectOne(boardNo);
		MemberDto memberDto = memberDao.selectOne(boardDto.getBoardWriter());
		
		
		List<SaveDto> list = dao.selectList(memberId);
		
		List<Integer> l = new ArrayList<>();
		
		for(SaveDto numList:list) {
			
			l.add(numList.getSaveNo());
			
			
		}
		
		if(memberId!=null&&memberId.equals(boardDto.getBoardWriter())) {
		
		boardDto.setBoardReadcount(boardDto.getBoardReadcount());}
		
		else if(l.contains(boardNo)) {
			
		boardDto.setBoardReadcount(boardDto.getBoardReadcount());
			
		}
		
		else {
			dto.setSaveId(memberId);
			dto.setSaveNo(boardNo);

			dao.listInsert(dto);
			boardDto.setBoardReadcount(boardDto.getBoardReadcount()+1);
		}
		
		
		
//		if(memberId!=null&&memberId.equals(boardDto.getBoardWriter())) {
//			
//			boardDto.setBoardReadcount(boardDto.getBoardReadcount());}
//	
//		else {
//			
//			boardDto.setBoardReadcount(boardDto.getBoardReadcount()+1);
//		}

		
		model.addAttribute("boardDto",boardDto);
		model.addAttribute("memberDto",memberDto);

		boardDao.updateView(boardDto);

		return "/WEB-INF/views/board/detail.jsp";
		
	}
	
	

	@GetMapping("/edit")
	public String edit(@RequestParam int boardNo,Model model,HttpSession session) {
	
		BoardDto boardDto = boardDao.selectOne(boardNo);
		
		model.addAttribute("boardDto", boardDto);
		
	String memberId = (String) session.getAttribute("name");
		
		
		if(memberId.equals(boardDto.getBoardWriter())) {
			
			
			return "/WEB-INF/views/board/edit.jsp";
		}
		else {
			return "redirect:detail?boardNo="+(boardNo)+"&error2";
		}
		

		
	
	}

	@PostMapping("/edit")
	public String edit(@ModelAttribute BoardDto boardDto,HttpSession session) {

			boolean result = boardDao.update(boardDto);
			
			if(result) {
				
				return "redirect:/board/detail?boardNo="+boardDto.getBoardNo();
				
			}
			else {
				
				throw new NoTargetException("존재하지 않는 글번호"); 
				//실행은 됐지만 결과가 없는(바뀐 게 없는) 예외. (따로 설정해주어야 하는 예외이다.)
				

				
			}
			
	
	}
	
	
	@RequestMapping("/delete")
	public String delete(@RequestParam int boardNo,HttpSession session) {
		
		BoardDto boardDto = boardDao.selectOne(boardNo);
		
		
		
		String memberId= (String) session.getAttribute("name");

		if(memberId.equals(boardDto.getBoardWriter())) {
		
			boardDao.delete(boardNo);
			
			return "redirect:/board/list";
		}
		else {
			return "redirect:detail?boardNo="+(boardNo)+"&error";
//			throw new AuthorityException("글 작성자가 아닙니다");
		}
		
		
		
	}
	
	

}
