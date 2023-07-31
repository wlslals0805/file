package com.kh.spring07.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.kh.spring07.dao.BookDao;
import com.kh.spring07.dto.BookDto;





@RestController
public class BookController {

		
		@Autowired
			private BookDao dao; 
		
			
		@RequestMapping("/save")
		public String insert(@ModelAttribute BookDto dto) {
			dao.insert(dto);
			return "도서 정보 등록 완료!";

		}
		
		@RequestMapping("/edit")
		
		public String update(@ModelAttribute BookDto dto) {
		boolean result = dao.update(dto);
		
		if(result) return "도서 정보 변경 완료";
		
		else return "해당 도서번호는 존재하지 않습니다.";
			
			
		}
		
		@RequestMapping("/delete")
		public String delete(@RequestParam int bookId) {
			boolean result = dao.delete(bookId);
			
			if(result) return "도서 삭제 완료";
			
			else return "존재하지 않는 도서 번호";
	
		}
		
	
		
		//전체출력
		@RequestMapping("/list")
		public String list(){
			List<BookDto> list = dao.listAll();
		
		return list.toString();	
		}
		
		
		
		
		
		
		//전체 중 번호 하나만 골라서
		@RequestMapping("/detail")
		public String detail(@RequestParam int bookId) {
			BookDto dto = dao.selectOne(bookId);
			if(dto == null) {
				return "도서가 존재하지 않습니다";
			}
			else {
			
				return dto.toString();
			}
		}
		
}

