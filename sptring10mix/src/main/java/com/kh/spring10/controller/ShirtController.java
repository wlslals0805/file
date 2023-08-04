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

import com.kh.spring10.dao.ShirtDao;
import com.kh.spring10.dto.PocketmonDto;
import com.kh.spring10.dto.ShirtDto;



@Controller
@RequestMapping("/shirt")
public class ShirtController {

	@Autowired
	private ShirtDao dao; 


	@RequestMapping("/detail")
	public String detail(Model model,@RequestParam int shirtNo) {
		
		ShirtDto dto = dao.detailList(shirtNo);

		model.addAttribute("dto", dto);

		return "/WEB-INF/views/shirt/detail.jsp";
		
	}
	@RequestMapping("/list")
	public String list(Model model) {
		List<ShirtDto> list = dao.list();
		
		model.addAttribute("list", list);
		
		return "/WEB-INF/views/shirt/list.jsp";
		
		
	}
	
	//등록
		//- 등록은 주소를 둘로 나눠서 쓴다
		//- GET(입력) , POST(처리)
		//- @GetMapping, @PostMapping 이라는 애노테이션 사용
		
		//@RequestMapping("/insert")
		//@RequestMapping(value = "/insert", method = RequestMethod.GET)
		@GetMapping("/add")
		public String insert() {
			return "/WEB-INF/views/shirt/add.jsp";
		}
	
	
	//@RequestMapping(value = "/insert", method = RequestMethod.POST)
		@PostMapping("/add")
		public String insert(@ModelAttribute ShirtDto dto) {

			int shirtNo = dao.sequence();
			
			
			dto.setShirtNo(shirtNo);
			
			
			dao.insert(dto);
			//더이상 할 일이 없으므로 다른 페이지로 강제 이동(리다이렉트, redirect)
			//반환하는 문자열이 redirect: 로 시작하면 스프링이 리다이렉트 처리한다
			return "redirect:detail?shirtNo="+shirtNo;//상대경로
			//return "redirect:list";//상대경로
//			return "redirect:/shirt/list";//절대경로
	}
		
		//수정
		//-수정 역시 등록처럼 두 개의 매핑이 필요(작성, 처리)
		//-전송방식으로 구분하여 구현
		//-화면에 원래 정보를 표시할 수 있도록 조회하여 전달
		
		@GetMapping("/edit")
		public String edit(@RequestParam int shirtNo,Model model) {
			ShirtDto dto = dao.detailList(shirtNo);
			model.addAttribute("dto", dto);
			return "/WEB-INF/views/shirt/edit.jsp";
		}

		@PostMapping("/edit")
		public String edit(@ModelAttribute ShirtDto dto) {
			
			boolean result = dao.update(dto);
			
			if(result) {//성공시 상세 페이지로 리다이렉트
				
				return "redirect:detail?shirtNo="+dto.getShirtNo();
				
			}
			
			else {
				
				return "redirect:error";
			}
		}
		
		//삭제
		
		@RequestMapping("/delete")
		public String delete(@RequestParam int shirtNo) {
			
			boolean result = dao.delete(shirtNo);
			if(result) {
				
				return "redirect:list";
				
				
			}
			else {
				
				return "redirect : 에러페이지";
				
				
			}
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
}
		
		
		
		


