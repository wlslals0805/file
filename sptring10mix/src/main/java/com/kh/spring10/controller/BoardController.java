package com.kh.spring10.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.kh.spring10.dao.BoardDao;
import com.kh.spring10.dto.BoardDto;
import com.kh.spring10.dto.PocketmonDto;


	
	
	@Controller
	@RequestMapping("/board")
	public class BoardController {
		
		@Autowired
		private BoardDao dao; 
		
		
		//상세조회
		//-번호(no)를 받아서 포켓몬스터 정보(pocketmonDto)를 조회
		//-화면(JSP에 전달하도록 모델(Model)에 첨부
		@RequestMapping("/detail")
		public String detail(Model model,@RequestParam int boardNo) {
			
			BoardDto dto = dao.selectOne(boardNo);
			
		
			
			model.addAttribute("dto", dto);
			
			
			
			return "/WEB-INF/views/board/detail.jsp";
			

		}
		
		
		@RequestMapping("/list")
		public String list(Model model) {
			List<BoardDto> list = dao.list();
			
			model.addAttribute("list", list);
			
			return "/WEB-INF/views/board/list.jsp";
			
			
		}
	

}
