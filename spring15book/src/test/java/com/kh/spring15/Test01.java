package com.kh.spring15;

import org.apache.ibatis.session.SqlSession;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.kh.spring15.dto.BookDto;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@SpringBootTest
public class Test01 {
	
	@Autowired
	private SqlSession sqlSession;
	
	@Test
	public void test() {
		
//		BookDto bookDto = new BookDto();
//		bookDto.setBookTitle("제목3");
//		bookDto.setBookAutor("작가3");
//		bookDto.setBookPrice(1000);
//		bookDto.setBookPublisher("출판사3");
//		bookDto.setBookPageCount(100);
//		bookDto.setBookGenre("판타지3");
//		bookDto.setBookPublicationDate("2023-10-12");
		
		BookDto dto = BookDto.builder()
				.bookTitle("테스트서적")
				.bookAuthor("작가텟읏트")
				.bookPrice(1000)
				.bookPublisher("테스트출판사")
				.bookPageCount(100)
				.bookGenre("판타지")
				.bookPublicationDate("2023-10-12")
				.build();
		
		sqlSession.insert("book.add", dto);
		
		
	}

}
