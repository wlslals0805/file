package com.kh.spring22.dao;

import java.util.List;

import com.kh.spring22.dto.BookDto;

public interface BookDao {

	List<BookDto> selectList();

	void insert(BookDto bookDto);

	boolean edit(int bookId, BookDto bookDto);

	boolean selectOne(int bookId);

	
	
	
}
