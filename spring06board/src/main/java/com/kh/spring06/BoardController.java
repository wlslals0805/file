package com.kh.spring06;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;




@RestController
public class BoardController {

		
		@Autowired
			private BoardDao dao; 
		
			
		@RequestMapping("/insert")
		public String insert(@ModelAttribute BoardDto dto) {
			dao.insert(dto);
			return "게시판 등록 완료!";

		}
		
		@RequestMapping("/update")
		
		public String update(@ModelAttribute BoardDto dto) {
		boolean result = dao.update(dto);
		
		if(result) return "게시판 정보 변경 완료";
		
		else return "해당 게시판 번호는 존재하지 않습니다.";
			
			
		}
		
		@RequestMapping("/delete")
		public String delete(@RequestParam int boardNo) {
			boolean result = dao.delete(boardNo);
			
			if(result) return "게시글 삭제 완료";
			
			else return "존재하지 않는 게시글 번호";
	
		}
		
		@RequestMapping("/list")
		public String list(){
			List<BoardDto> list = dao.selectList();
			StringBuffer buffer = new StringBuffer();
			
			for(BoardDto dto:list) {
				
				buffer.append(dto);
				buffer.append("<br>");

			}
		return buffer.toString();	
	
	
	
		}
}
