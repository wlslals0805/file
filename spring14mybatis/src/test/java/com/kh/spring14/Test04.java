package com.kh.spring14;

import org.apache.ibatis.session.SqlSession;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.kh.spring14.dto.PocketmonDto;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@SpringBootTest
public class Test04 {
	
	@Autowired
	private SqlSession sqlSession;
	
	@Test
	public void test() {
		PocketmonDto dto = new PocketmonDto();
		dto.setNo(86);
		dto.setName("변경");
		dto.setType("변경");
		
		
		int count = sqlSession.update("pocketmon.edit",dto);
		boolean result = count > 0;
		log.debug("result = {}",result);
		
		
	}

}
