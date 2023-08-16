package com.kh.springhome.dao;

import java.util.List;

import com.kh.springhome.dto.BoardDto;
import com.kh.springhome.dto.MemberDto;

public interface BoardDao {
	
	void insert(BoardDto boardDto); 
	int sequence();
	List<BoardDto> detailList();
	boolean update(BoardDto boardDto);
	boolean delete(int boardNo);
	void updateView(BoardDto boardDto);
	BoardDto selectOne(int boardNo);
	List<BoardDto> selectTitle(String boardTitle);
	List<BoardDto> selectWriter(String boardWriter);
	Integer selectMax(String boardWriter);
	
}
