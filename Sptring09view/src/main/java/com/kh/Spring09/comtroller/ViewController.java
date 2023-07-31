package com.kh.Spring09.comtroller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

//화면을 보여주기 위한 컨트롤러
//@RestController //데이터를 보내주는 컨트롤러


@Controller //화면을 보내주는 컨트롤러

public class ViewController {
	
	@RequestMapping("/hello")
	public String hello() {
//		return "화면 파일의 위치";
		
		return "/WEB-INF/views/hello.jsp";}
		
		
	@RequestMapping("/heading")
	public String heading() {
	return "/WEB-INF/views/heading.jsp";
			
		}
	@RequestMapping("/link")
	public String link() {
		return "/WEB-INF/views/link.jsp";
	}
	
	@RequestMapping("/image")
	public String image() {
		return "/WEB-INF/views/image.jsp";
	}
	
	@RequestMapping("/sns")
	public String sns() {
		return "/WEB-INF/views/sns.jsp";
	}
	
	@RequestMapping("/dummy")
	public String dummy() {
		return "/WEB-INF/views/dummy.jsp";
	}
	
	@RequestMapping("/alt")
	public String alt() {
		return "/WEB-INF/views/alt.jsp";
	}
	
	
	

}
