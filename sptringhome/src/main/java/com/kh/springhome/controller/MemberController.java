package com.kh.springhome.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.kh.springhome.dao.MemberDao;
import com.kh.springhome.dto.MemberDto;

//회원 관련 기능을 처리하는 컨트롤러
@Controller
@RequestMapping("/member")
public class MemberController {
 
	//Autowired는 지정한 클래스 및 
//	자식 클래스 중에서 등록된 것을 찾아 주입한다
	
	@Autowired
	private MemberDao memberDao;
	

	
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
				session.setAttribute("name",inputDto.getMemberId());
				//아이디와 비밀번호가 모두 일치했을 때야 비로소 session에 데이터 저장. 이 저장이 remove(로그아웃)되기 전까지 회원용 header가 뜬다
			
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
		return "redirect:/";
	}
	
	@RequestMapping("/mypage")
	public String mypage(HttpSession session,Model model) {
		
		//[1] 세션에서 사용자의 아이디를 꺼낸다
		//-세션은 값을 Object로 저장한다(아무거나 넣어야 하니까)
		String memberId = (String) session.getAttribute("name");
		//[2]가져온 아이디로 회원정보를 조회한다
		MemberDto memberDto = memberDao.selectOne(memberId);
		//[3]조회한 정보를 모델에 첨부한다
		model.addAttribute("memberDto", memberDto);
		
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
	
	
	
}
