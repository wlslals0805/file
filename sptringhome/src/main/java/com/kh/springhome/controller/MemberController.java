package com.kh.springhome.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.kh.springhome.dao.AdminDao;
import com.kh.springhome.dao.BoardLikeDao;
import com.kh.springhome.dao.MemberDao;
import com.kh.springhome.dto.MemberBlockDto;
import com.kh.springhome.dto.MemberDto;
import com.kh.springhome.error.AuthorityException;

//회원 관련 기능을 처리하는 컨트롤러
@Controller
@RequestMapping("/member")
public class MemberController {
 
	//Autowired는 지정한 클래스 및 
//	자식 클래스 중에서 등록된 것을 찾아 주입한다
	
	@Autowired
	private MemberDao memberDao;
	
	@Autowired
	private AdminDao adminDao;

	
	@GetMapping("/join")
	public String join() {
		
		return "/WEB-INF/views/member/join.jsp";
		
	}
	
	@PostMapping("/join")
	public String join(@ModelAttribute MemberDto memberDto) {
		memberDao.insert(memberDto);
		
//		return "redirect:joinFinish"; 	//상대경로
		return "redirect:/member/joinFinish";	//절대경로
		
	}
	
	@RequestMapping("/joinFinish")
	public String joinFinish() {
	return "/WEB-INF/views/member/joinFinish.jsp";
	
	}
	
	
	@GetMapping("/login")
	public String login() {
		
		return "/WEB-INF/views/member/login.jsp";
		
	}
	
	/*
	 로그인과 같이 사용자별로 관리되어야 하는 상태정보들이 있다.
	 이 때 사용할 수 있는 저장소로 HttpSession이 있다.
	 이 저장소는 사용자별로 정보가 따로 저장되며, 외부에서 접근이 불가능하다
	 컨트롤러에 선언만 하면 사용할 수 있으며, key=value 형태로 저장된다
	 
	 [1] 추가 - session.setAttribute("key",value);
	 [2] 확인 - session.getAttribute("key");
	 [3] 삭제 - ession.removeAttribute("key");
	 
	 현재 session을 선언하고 사용하는 이유 : 로그인 후 아이디를 저장해서 회원과 비회원의 header창을 다르게 보이게 하기 위해.
	 */
	
	@PostMapping("/login")
	public String login(@ModelAttribute MemberDto inputDto, 
			HttpSession session) {
		//[1]사용자가 입력한 아이디로 데이터베이스에서 정보를 조회
		MemberDto findDto=memberDao.selectOne(inputDto.getMemberId());
		
		//[2] 1번에서 정보가 있다면 비밀번호를 검사

		if(findDto==null) {
			
			return "redirect:login?error"; 	//redirect는 무조건 GetMapping으로 간다
			
		}
		
		boolean isCorrectPw= inputDto.getMemberPw().equals(findDto.getMemberPw());
		
		//[3] 비밀번호가 일치하면 메인페이지로 이동
		if(isCorrectPw) {
			
			MemberBlockDto blockDto = adminDao.selectBlockOne(findDto.getMemberId());
			
			//(주의) 만약 차단된 회원이라면 추가 작업을 중지하고 오류 발생
			if(blockDto != null) {
				
//				return "redirect:오류페이지";
				throw new AuthorityException("차단된 회원");
				
			}
			
			//세션에 아이디+등급 저장
		session.setAttribute("name",findDto.getMemberId());
		session.setAttribute("level", findDto.getMemberLevel());
		//아이디와 비밀번호가 모두 일치했을 때야 비로소 session에 데이터 저장. 이 저장이 remove(로그아웃)되기 전까지 회원용 header가 뜬다
		
		
		
		
		//로그인 시간 갱신
		memberDao.updateMemberLogin(inputDto.getMemberId());
		
		//메인페이지로 이동
		return "redirect:/";
			
		}
		
		//[4] 비밀번호가 일치하지 않으면 로그인페이지로 이동
		
		else {
			
		
		return "redirect:login?error2";
		}
	}
	
	//------회원 전용 메뉴---------
	@RequestMapping("/logout")
	public String logout(HttpSession session) {
		session.removeAttribute("name");
		session.removeAttribute("level");
		return "redirect:/";
	}
	
	@Autowired
	private BoardLikeDao boardLikeDao;
	
	@RequestMapping("/mypage")
	public String mypage(HttpSession session,Model model) {
		
		//[1] 세션에서 사용자의 아이디를 꺼낸다
		//-세션은 값을 Object로 저장한다(아무거나 넣어야 하니까)
		String memberId = (String) session.getAttribute("name");
		//[2]가져온 아이디로 회원정보를 조회한다
		MemberDto memberDto = memberDao.selectOne(memberId);
		//[3]조회한 정보를 모델에 첨부한다
		model.addAttribute("memberDto", memberDto);
		//[4]좋아요 누른 게시글 내역을 모델에 첨부한다
		model.addAttribute("boardLikeList",boardLikeDao.findByMemberId(memberId));
		
		
		return "/WEB-INF/views/member/mypage.jsp";
		
	}
	
	@GetMapping("/withdrawal")
	public String withdrawal() {
		
		return "/WEB-INF/views/member/withdrawal.jsp";
		
	}
	
	
	
	@RequestMapping("/withdrawalDelete")
	public String withdrawalDelete(HttpSession session) {
		
		String a = (String) session.getAttribute("name");
		
		memberDao.delete(a);
		
		session.removeAttribute("name");
		
		return "/WEB-INF/views/member/after.jsp";
		
	}
	
	
	//비밀번호 변경
	@GetMapping("/password")
	public String password() {
		
		return "/WEB-INF/views/member/password.jsp";
		
	}

	@PostMapping("/password")
	public String password(HttpSession session,@RequestParam String originPw,
			@RequestParam String changePw) {
		
		String memberId = (String) session.getAttribute("name");
		MemberDto memberDto = memberDao.selectOne(memberId);
		
		//[1] 기존 비밀번호가 일치하는지 판정
		if(memberDto.getMemberPw().equals(originPw)) {//비밀번호가 일치한다면
		//[2] 1번이 성공일 때만 비밀번호를 변경하도록 처리(+개인정보 변경시각 수정)
			
		memberDao.updateMemberPw(memberId,changePw);
			
		return "redirect:passwordFinish";
			
			
		}
		else {
			
			return "redirect:password?error";
			
			
		}
	
	}

	@RequestMapping("/passwordFinish")
	public String passwordFinish() {
		
		return "/WEB-INF/views/member/passwordFinish.jsp";
	}
	
	@GetMapping("/change")
	public String change(HttpSession session, Model model) {
		
		String memberId = (String) session.getAttribute("name");
		MemberDto memberDto = memberDao.selectOne(memberId);
		
		model.addAttribute("memberDto", memberDto);
		
		return "/WEB-INF/views/member/change.jsp";
		
	}
	
	@PostMapping("/change")
	public String change(HttpSession session, @ModelAttribute MemberDto inputDto) 
	{
		
		String memberId = (String) session.getAttribute("name");
		
		//비밀번호 검사 후 변경 처리 요청
		MemberDto findDto = memberDao.selectOne(memberId);
		
		if(inputDto.getMemberPw().equals(findDto.getMemberPw())) {
			//비밀번호가 일치한다면
			
			inputDto.setMemberId(memberId); //아이디를 설정하고
			memberDao.updateMemberInfo(inputDto); //정보 변경 처리
			return "redirect:mypage";
			
		}
		else {
			//비밀번호가 일치하지 않는다면 -> 다시 입력하도록 되돌려보냄
			return "redirect:change?error";
			
			
		}	
	}
	
	
	
	
	@GetMapping("/change2")
	public String change2(HttpSession session, Model model) {
		
		
		String memberId= (String) session.getAttribute("name");
		
		MemberDto dto=memberDao.selectOne(memberId);
		
		model.addAttribute("dto", dto);
		
		return "/WEB-INF/views/member/change2.jsp";
		
		
		
	}
	
	@PostMapping("/change2")
	public String change2(HttpSession session, @ModelAttribute MemberDto input) {
		
		String memberId= (String) session.getAttribute("name");
		
		MemberDto origin = memberDao.selectOne(memberId);
		
		
		
		if(input.getMemberPw().equals(origin.getMemberPw())) {
			
			input.setMemberId(memberId);
			memberDao.info(input);
		
		return "redirect:mypage";
		
		}
		
		else {
			
			return "redirect:change2?error";
		}	
		
	}
	@GetMapping("/exit")
	public String exit() {
		return "/WEB-INF/views/member/exit.jsp";
	}
	
	@PostMapping("/exit")
	public String exit(HttpSession session, @RequestParam String memberPw) {
		String memberId = (String)session.getAttribute("name");
		MemberDto memberDto = memberDao.selectOne(memberId);
		if(memberDto.getMemberPw().equals(memberPw)) {//비밀번호 일치
			//삭제
			memberDao.delete(memberId);
			//로그아웃
			session.removeAttribute("name");//세션에서 name의 값을 삭제
			//session.invalidate();//세션 소멸(비추천)
			return "redirect:exitFinish";
		}
		else {//비밀번호 불일치
			return "redirect:exit?error";
		}
	}
	
	@RequestMapping("/exitFinish")
	public String exitFinish() {
		return "/WEB-INF/views/member/exitFinish.jsp";
	}
	
	
	
	@GetMapping("/exit2")
	public String delete2() {
		
		return "/WEB-INF/views/member/exit2.jsp";
		
	}
	
	@PostMapping("/exit2")
	public String delete2(String memberPw, HttpSession session) {
		
	String memberId=(String) session.getAttribute("name");
	
	MemberDto dto = memberDao.selectOne(memberId);
	
	if(memberPw.equals(dto.getMemberPw())) {
		
		memberDao.delete2(memberPw);
		session.removeAttribute("name");
		
		return "/WEB-INF/views/member/exitFinish2.jsp";
		
		
	}
	
	else {
		
		return "redirect:exit2?error";
		
	}
	
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
