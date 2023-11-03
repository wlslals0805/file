package com.kh.spring22.restcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kh.spring22.dao.BookDao;
import com.kh.spring22.dto.BookDto;

@CrossOrigin
@RestController
@RequestMapping("/book")
public class BookRestController {

	@Autowired
	private BookDao bookDao;
	
	
	@GetMapping("/")
	public List<BookDto> list(){
		
		return bookDao.selectList();
		
	}
	
	@PostMapping("/")
	public void insert(@RequestBody BookDto bookDto) {
		
		bookDao.insert(bookDto);
		
	}
	
	@PutMapping("/{bookId}")
	public ResponseEntity<String> change(@PathVariable int bookId,
			@RequestBody BookDto bookDto){
		
		boolean result = bookDao.edit(bookId,bookDto);
		
		if(result) {
			return ResponseEntity.ok().build();
			
		}
		else {
			
			return ResponseEntity.notFound().build();
		}
	
	}
	
	@GetMapping("/{bookId}")
	public ResponseEntity<BookDto> find(@PathVariable int bookId){
		
		boolean result = bookDao.selectOne(bookId);
		
		
	}
	
	
	
	
	
}
