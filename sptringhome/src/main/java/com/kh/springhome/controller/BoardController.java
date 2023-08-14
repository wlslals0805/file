package com.kh.springhome.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.kh.springhome.dao.BoardDao;
import com.kh.springhome.dao.MemberDao;
import com.kh.springhome.dao.SaveDao;
import com.kh.springhome.dto.BoardDto;
import com.kh.springhome.dto.MemberDto;
import com.kh.springhome.dto.SaveDto;

//게시판 관련 기능을 처리하는 컨트롤러 
@Component
@RequestMapping("/board")
public class BoardController {
	
	
	@Autowired
	private BoardDao boardDao;
	
	@Autowired 
	private MemberDao memberDao;
	
	@Autowired
	private SaveDao dao;
	
	@GetMapping("/write")
	public String write() {
		
		return "/WEB-INF/views/board/write.jsp";
		
	}
	
	@PostMapping("/write")
	public String write(BoardDto boardDto,HttpSession session) throws InterruptedException {
		
		String memberId=(String) session.getAttribute("name");
		
		int boardNo=boardDao.sequence();
		
		boardDto.setBoardWriter(memberId);
		boardDto.setBoardNo(boardNo);
		boardDao.insert(boardDto);
		memberDao.updatePoint(memberId);
		
		return "redirect:/board/detail?boardNo="+boardNo;
		
	}

	@GetMapping("/list")
	public String list(Model model,HttpSession session) {
		
		List<BoardDto> list = boardDao.detailList();

		model.addAttribute("list", list);
		
		
		return "/WEB-INF/views/board/list.jsp";
		
	}
	
	@PostMapping("/list")
	public String list(Model model,HttpSession session,String search,String type) {
		
		List<BoardDto> list = boardDao.detailList();
		int result=0;
	
		if(type.equals("제목")) {
		
		for(BoardDto a:list) {
			
			if(a.getBoardTitle().startsWith(search)) {
				result++;	
			}	
		}

		if(result>=1) {
			
			List<BoardDto> tList = boardDao.seletTitle(search+"%");
			
			model.addAttribute("tList", tList);
			
			
			return "/WEB-INF/views/board/searchList.jsp";
		}
		
		else {
			return "redirect:/board/list?error";
			
		}
		
		}
		
		else if(type.equals("작성자")) {
			
			for(BoardDto a:list) {
				
				if(a.getBoardWriter().startsWith(search)) {
					
					result++;
					
				}	
			}
			if(result>=1) {
				
				List<BoardDto> tList = boardDao.seletWriter(search+"%");
				
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
		BoardDto boardDto = boardDao.seletOne(boardNo);
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
	
		BoardDto boardDto = boardDao.seletOne(boardNo);
		
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
	public String edit(BoardDto boardDto,HttpSession session) {

			boardDao.update(boardDto);
			
			return "redirect:/board/detail?boardNo="+boardDto.getBoardNo();
	
	}
	
	
	@RequestMapping("/delete")
	public String delete(int boardNo,HttpSession session) {
		
		BoardDto boardDto = boardDao.seletOne(boardNo);
		
		
		
		String memberId= (String) session.getAttribute("name");

		if(memberId.equals(boardDto.getBoardWriter())) {
		
			boardDao.delete(boardNo);
			
			return "redirect:/board/list";
		}
		else {
			return "redirect:detail?boardNo="+(boardNo)+"&error";
		}
		
		
		
	}
	
	

}
