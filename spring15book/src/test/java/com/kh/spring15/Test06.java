package com.kh.spring15;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.kh.spring15.dto.BookDto;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@SpringBootTest
public class Test06 {
	@Autowired
	private SqlSession sqlSession;
	
	@Test
	public void test() {
	
		//(주의) 구문을 부를 때는 값을 1개만 전달할 수 있다.
//		String type="book_title",keyword = "제목";
//		List<BookDto> list = sqlSession.selectList("book.search",type,keyword);
			
		Map<String,Object> param = new HashMap<>();
		param.put("type", "book_title");
		param.put("keyword", "제목");
		
		List<BookDto> list = sqlSession.selectList("book.search",param);
		
			for(BookDto bookDto : list) {
			log.debug("bookDto={}",bookDto);
		
			}
		
	}
	

}
