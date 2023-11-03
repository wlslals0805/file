package com.kh.spring22.dao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.kh.spring22.dto.BookDto;

@Repository
public class BookDaoImpl implements BookDao{

	@Autowired
	private SqlSession sqlSession;
	
	@Override
	public List<BookDto> selectList() {
		
		
		return sqlSession.selectList("book.selectList");
	}

	@Override
	public void insert(BookDto bookDto) {
		
		sqlSession.insert("book.add",bookDto);
		
	}

	@Override
	public boolean edit(int bookId, BookDto bookDto) {
		
		Map<String,Object> params = new HashMap<>();
		
		params.put("bookId", bookId);
		params.put("dto", bookDto);
		
		
		
		
		return sqlSession.update("book.edit",params)>0;
	}

	@Override
	public boolean selectOne(int bookId) {
		
//		BookDto dto =  sqlSession.selectOne("book.find", bookId);
//		
//		if(dto!=null) {
//			
//			return dto;
//			
//		}
//		else {
//			
//			
//		}
		
		return false;
	}
	
	

}
