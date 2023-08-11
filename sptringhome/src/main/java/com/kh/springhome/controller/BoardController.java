package com.kh.springhome.controller;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

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
		
		int boardNo=boardDao.sequence();
		
		boardDto.setBoardWriter(memberId);
		boardDto.setBoardNo(boardNo);
		
		boardDao.insert(boardDto);
		
		return "redirect:/board/detail?boardNo="+boardNo;
		
	}
	
	@RequestMapping("/list")
	public String list(Model model,HttpSession session) {
		
		List<BoardDto> list = boardDao.detailList();

		model.addAttribute("list", list);
		
		
		return "/WEB-INF/views/board/list.jsp";
		
	}
	
//	@RequestMapping("/detail")
//	public String detail(@RequestParam int boardNo,Model model,HttpSession session) {
//		
//		
//		String memberId=(String) session.getAttribute("name");
//		BoardDto boardDto = boardDao.seletOne(boardNo);
//		
//		
//		
//		model.addAttribute("boardDto",boardDto);
//		
//		if(!memberId.equals(boardDto.getBoardWriter())) {
//		
//		boardDto.setBoardReadcount(boardDto.getBoardReadcount()+1);}
//		
//	
//
//		boardDao.updateView(boardDto);
//		
//		
//		
//		return "/WEB-INF/views/board/detail.jsp";
	
	@RequestMapping("/detail")
	public String detail(@RequestParam int boardNo, Model model, HttpSession session) {
	    String memberId = (String) session.getAttribute("name");
	    BoardDto boardDto = boardDao.seletOne(boardNo);
	    
	    // 사용자별로 읽은 글 번호를 저장하는 Map을 세션에서 가져옵니다.
	    Map<String, Set<Integer>> userReadArticles = (Map<String, Set<Integer>>) session.getAttribute("userReadArticles");
	    if (userReadArticles == null) {
	        userReadArticles = new HashMap<>();
	        session.setAttribute("userReadArticles", userReadArticles);
	    }
	    
	    // 현재 로그인한 사용자의 읽은 글 번호 목록을 가져옵니다.
	    Set<Integer> readArticleNumbers = userReadArticles.get(memberId);
	    if (readArticleNumbers == null) {
	        readArticleNumbers = new HashSet<>();
	        userReadArticles.put(memberId, readArticleNumbers);
	    }
	    
	    if (!readArticleNumbers.contains(boardNo)) {
	        readArticleNumbers.add(boardNo);
	        
	        // 조회수 증가 처리
	        if (!memberId.equals(boardDto.getBoardWriter())) {
	            boardDto.setBoardReadcount(boardDto.getBoardReadcount() + 1);
	            boardDao.updateView(boardDto);
	        }
	    }
	    
	    model.addAttribute("boardDto", boardDto);
	    
	    return "/WEB-INF/views/board/detail.jsp";
	}

		
		
		
		
	
	
	@GetMapping("/edit")
	public String edit(@RequestParam int boardNo,Model model) {
	
		BoardDto boardDto = boardDao.seletOne(boardNo);
		
		model.addAttribute("boardDto", boardDto);

		return "/WEB-INF/views/board/edit.jsp";
	
	}

	@PostMapping("/edit")
	public String edit(BoardDto boardDto) {
		
		boardDao.update(boardDto);
		
		
		
		
		return "redirect:/board/detail?boardNo="+boardDto.getBoardNo();
		
		
	}
	
	
	@RequestMapping("/delete")
	public String delete(int boardNo) {
		
		boardDao.delete(boardNo);
		
		
		
		return "redirect:/board/list";
		
		
	}
	
	

}
