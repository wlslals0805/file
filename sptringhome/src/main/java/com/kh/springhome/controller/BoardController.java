package com.kh.springhome.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.kh.springhome.dao.BoardDao;
import com.kh.springhome.dto.BoardDto;

//게시판 관련 기능을 처리하는 컨트롤러 
@Component
@RequestMapping("/board")
public class BoardController {
	
	
	@Autowired
	private BoardDao boardDao;
	
	@GetMapping("/write")
	public String write() {
		
		return "/WEB-INF/views/board/write.jsp";
		
	}
	
	@PostMapping("/write")
	public String write(BoardDto boardDto,HttpSession session) {
		
		String memberId=(String) session.getAttribute("name");
		
		int seq=boardDao.sequence();
		
		boardDto.setBoardWriter(memberId);

		boardDto.setBoardNo(seq);
		boardDao.insert(boardDto);
		
		return "redirect:/board/list";
	
	}
	
	@RequestMapping("/list")
	public String list(Model model) {
		
		List<BoardDto> list = boardDao.detailList();

		model.addAttribute("list", list);
		
		
		return "/WEB-INF/views/board/list.jsp";
		
	}
	
	
	
	

}
