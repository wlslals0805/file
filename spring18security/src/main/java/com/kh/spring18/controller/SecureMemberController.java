package com.kh.spring18.controller;

import javax.mail.MessagingException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.kh.spring18.dao.SecureMemberDao;
import com.kh.spring18.dto.SecureMemberDto;
import com.kh.spring18.service.EmailService;

@Controller
@RequestMapping("/secure")
public class SecureMemberController {
	
	@Autowired
	private SecureMemberDao dao;
	
	@Autowired
	private EmailService emailService;
	
	
	
	
	@GetMapping("/join")
	public String join() {
		//return "/WEB-INF/views/secure/join.jsp";
		return "secure/join";
		
	}
	
	@PostMapping("/join")
	public String join(@ModelAttribute SecureMemberDto dto) throws MessagingException, Exception {
		dao.insert(dto);
//		service.sendEmail(???);
		
		emailService.sendCelebration(dto.getMemberId());
		
//		return "/WEB-INF/views/secure/joinFinish.jsp";
		return "redirect:joinFinish";
		
	}
	
	@GetMapping("joinFinish")
	public String joinFinish() {
		
		return "secure/joinFinish";
	}
	
	
	@GetMapping("/login")
	public String login() {
		
		return "secure/login";
	}

	@PostMapping("/login")
	public String login(@ModelAttribute SecureMemberDto dto) {
		
		SecureMemberDto target = dao.login(dto);
		if(target==null) {
			
			return "redirect:login?error";
		}
		else {
			//세션 정보 설정...후 메인페이지 혹은 기존페이지로 이동
		return "redirect:login?success";}
	}
}
