package com.kh.springhome.dao;

import java.util.List;

import com.kh.springhome.dto.BoardDto;
import com.kh.springhome.dto.MemberDto;

public interface BoardDao {
	
	void insert(BoardDto boardDto); 
	int sequence();
	List<BoardDto> detailList();
	BoardDto seletOne(int boardNo);
	void update(BoardDto boardDto);
	boolean delete(int boardNo);
	void updateView(BoardDto boardDto);
	List<BoardDto> seletTitle(String boardTitle);
	List<BoardDto> seletWriter(String search);
}
