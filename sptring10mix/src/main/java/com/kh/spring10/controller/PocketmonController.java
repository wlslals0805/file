package com.kh.spring10.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.kh.spring10.dao.PocketmonDao;
import com.kh.spring10.dto.PocketmonDto;



@Controller
@RequestMapping("/pocketmon")
public class PocketmonController {
	
	@Autowired
	private PocketmonDao dao; 
	
	
	//상세조회
	//-번호(no)를 받아서 포켓몬스터 정보(pocketmonDto)를 조회
	//-화면(JSP에 전달하도록 모델(Model)에 첨부
	@RequestMapping("/detail")
	public String detail(Model model,@RequestParam int no) {
		
		PocketmonDto dto = dao.detailList(no);
		
	
		
		model.addAttribute("dto", dto);
		
		
		
		return "/WEB-INF/views/pocketmon/detail.jsp";
		
//		JSP 표준 태그 라이브러리(Jsp Standard Tag Library).
//		JSP 페이지에서 필요한 프로그래밍 처리를 수행하는 태그.
//
//		변수 생성 - <c:set>
//		조건 - <c:if>, <c:choose>
//		반복 - <c:forEach>
//
//		사용하려면 JSP 페이지에 다음과 같은 설정을 해야 한다
//
//		<%@ taglib prefix="c" 
//		uri="http://java.sun.com/jsp/jstl/core" %>
		
//		조건이 한 개일 때는 <c:if>를 사용한다
//
//		<c:if test="조건식">
//
//		</c:if>
		
		//목록
		
	}
	@RequestMapping("/list")
	public String list(Model model) {
		List<PocketmonDto> list = dao.list();
		
		model.addAttribute("list", list);
		
		return "/WEB-INF/views/pocketmon/list.jsp";
		
		
	}
	
	//등록
		//- 등록은 주소를 둘로 나눠서 쓴다
		//- GET(입력) , POST(처리)
		//- @GetMapping, @PostMapping 이라는 애노테이션 사용
		
		//@RequestMapping("/insert")
		//@RequestMapping(value = "/insert", method = RequestMethod.GET)
		@GetMapping("/insert")
		public String insert() {
			return "/WEB-INF/views/pocketmon/insert.jsp";
		}
	
	
	//@RequestMapping(value = "/insert", method = RequestMethod.POST)
		@PostMapping("/insert")
		public String insert(@ModelAttribute PocketmonDto dto) {
			dao.insert(dto);
			//더이상 할 일이 없으므로 다른 페이지로 강제 이동(리다이렉트, redirect)
			//반환하는 문자열이 redirect: 로 시작하면 스프링이 리다이렉트 처리한다
			//return "redirect:list";//상대경로
			return "redirect:/pocketmon/list";//절대경로
	}
		
		//수정
		//-수정 역시 등록처럼 두 개의 매핑이 필요(작성, 처리)
		//-전송방식으로 구분하여 구현
		//-화면에 원래 정보를 표시할 수 있도록 조회하여 전달
		
		@GetMapping("/edit")
		public String edit(@RequestParam int no,Model model) {
			PocketmonDto dto = dao.detailList(no);
			model.addAttribute("dto", dto);
			return "/WEB-INF/views/pocketmon/edit.jsp";
		}

		@PostMapping("/edit")
		public String edit(@ModelAttribute PocketmonDto dto) {
			
			boolean result = dao.update(dto);
			
			if(result) {//성공시 상세 페이지로 리다이렉트
				
				return "redirect:detail?no="+dto.getNo();
				
			}
			
			else {
				
				return "redirect:에러페이지주소";
			}
		}
		
		//삭제
		
		@RequestMapping("/delete")
		public String delete(@RequestParam int no) {
			
			boolean result = dao.delete(no);
			if(result) {
				
				//return "redirect:/pocketmon/list";
				return "redirect:list";
				
				
			}
			else {
				
				return "redirect : 에러페이지";
				
				
			}
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

}
