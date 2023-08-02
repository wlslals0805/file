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
//			BookDto dto = dao.listAll(); //안되는 이유: dao.listAll()의 반환값은 list로서 여러 개의 객체 정보를 담고있다.  따라서 한 개의 객체에 여러 개의 객체의 정보를 담을 수 없는 게 당연하다.

		return list.toString();	//list는 객체 정보를 담고있지만 dto를 출력하면 하나의 객체의 정보가 문자열로 나오는 것처럼 객체 정보를 담은 list도 똑같다.
		}
		
		
		
		
		
		
		//전체 중 번호 하나만 골라서
		@RequestMapping("/detail")
		public String detail(@RequestParam int bookId) {
			BookDto dto = dao.selectOne(bookId); 	//1. dao.selectOne(bookId)를 호출함으로써 bookId에 해당하는 객체 한 개를 뽑아낸다. 그 객체의 정보가 BookDto dto에 들어간다. 객체의 setter메소드가 실행되며 값이 설정된다.
		
			if(dto == null) {
				return "도서가 존재하지 않습니다";
			}
			else {
			
				return dto.toString();	//2. 위에서 설정된 dto의 값이 반환된다. dto.멤버필드로 각각 불러낼 수도 있다.
				
				//어쨌든 dao.selectOne(bookId);의 반환값도 list.get(0)으로서 리스트니까 그냥 전체출력 메소드처럼 그냥 바로 list로 넘길 수도 있지만 if의 상황을 위해 나누었다. 
				//그럼 굳이 dto라는 객체를 생성하지 않아도 if(dto == null) 여기서 dto 부분에 dao.selectOne(bookId)를 넣어도 되는 거 아닌가?
				//마찬가지로 return dto.toString(); 에 dao.selectOne(bookId);를 넣고. 아마 깔끔하게 만들려고 변수를 생성한 것 같다. 굳이 그러지 않아도 되는 건지 나중에 내가 직접 해보자.
			}
		}
		
}

