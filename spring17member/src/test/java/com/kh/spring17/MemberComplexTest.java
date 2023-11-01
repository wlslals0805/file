package com.kh.spring17;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.kh.spring17.dto.MemberDto;
import com.kh.spring17.vo.MemberComplexSearchVO;

import lombok.extern.slf4j.Slf4j;
@Slf4j
@SpringBootTest
public class MemberComplexTest {
	
	@Autowired
	private SqlSession sqlSession;
	
	@Test
	public void test() {
		MemberComplexSearchVO vo = new MemberComplexSearchVO();
		List<MemberDto> list = sqlSession.selectList("member.complexSearch");
		
		log.debug("조회 결과 수 = {}", list.size());
		
		for(MemberDto dto : list) {
			
			log.debug("dto={}",dto);
		}
		
	}

}
