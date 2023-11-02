package com.kh.spring20.controller;

import java.util.Map;

import javax.servlet.http.HttpSession;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.kh.spring20.dao.ChatDao;
import com.kh.spring20.dto.BoardDto;
import com.kh.spring20.dto.MemberDto;
import com.kh.spring20.dto.ReplyDto;

import lombok.extern.slf4j.Slf4j;

@Controller
@Slf4j
public class WebSocketViewController {
	
	@Autowired
	private ChatDao chatDao;
	
	@RequestMapping("/")
	public String home() {
//		return "/WEB-INF/views/home.jsp";
		return "home";
	}
	
	@RequestMapping("/default")
	public String defaultServer() {
		
		//return "/WEB-INF/views/default.jsp";
		return "default";
	}
	
	@RequestMapping("/time")
	public String time() {
		
//		return "/WEB-INF/views/default.jsp";
		return "time";
	}
	
	@RequestMapping("/group")
	public String group() {
		
//		return "/WEB-INF/views/group.jsp";
		return "group";
	}
	
	//임시 로그인 처리
	@Autowired
	private SqlSession sqlSession;
	
	@PostMapping("/login")
	public String login(@ModelAttribute MemberDto memberDto, HttpSession session) {
		MemberDto findDto = sqlSession.selectOne("member.find",memberDto);
		
		if(findDto != null) {

			boolean pwMatch = findDto.getMemberPw().equals(memberDto.getMemberPw());
			
			if(pwMatch) {
				session.setAttribute("name", findDto.getMemberId());	//아이디
				session.setAttribute("level", findDto.getMemberLevel());	//등급
				
				log.debug(memberDto.getMemberLevel());
			
			}
		}
		
		
		return "redirect:/";
	}
	
	@RequestMapping("/logout")
	public String logout(HttpSession session) {
		
		session.removeAttribute("name");
		session.removeAttribute("level");
		return "redirect:/";
	}
	
	@RequestMapping("/member")
	public String member() {
		//return "/WEB-INF/views/member.jsp";
		return "member";
	}
	
	@RequestMapping("/json")
	public String json() {
			//return "/WEB-INF/views/json.jsp";
		return "json";
	}
	
	@RequestMapping("/sockjs")
	public String sockjs() {
		
		return "sockjs";
	}
	
	@GetMapping("/reply")
	public String reply() {
		
		return "reply";
	}
	
	@PostMapping("/reply")

	public String reply(@ModelAttribute ReplyDto replyDto,HttpSession session) {
		
		String memberId = (String) session.getAttribute("name");
		
		replyDto.setMemberId(memberId);
		chatDao.replyInsert(replyDto);
		
		return "redirect:reply";
	}
	
	@GetMapping("/board")
	public String board() {
		
		return "board";
	}
	
	@PostMapping("/board")
	public String board(@ModelAttribute BoardDto boardDto,HttpSession session) {
		
		String memberId = (String) session.getAttribute("name");
		
		boardDto.setMemberId(memberId);
		chatDao.boardInsert(boardDto);
		
		return "redirect:board";
	}
	
	
	
	
}