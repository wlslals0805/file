package com.kh.springhome.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
public class HomeController {
	//http://localhost:8080/
	@RequestMapping("/")
	public String home() {
		log.warn("실행");
		return "/WEB-INF/views/home.jsp";
		
	}
	
	
	

}
