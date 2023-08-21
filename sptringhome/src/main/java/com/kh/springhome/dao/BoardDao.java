package com.kh.springhome.dao;

import java.util.List;

import com.kh.springhome.dto.BoardDto;
import com.kh.springhome.dto.BoardListDto;
import com.kh.springhome.dto.MemberDto;
import com.kh.springhome.vo.PaginationVO;

public interface BoardDao {
	
	void insert(BoardDto boardDto); 
	int sequence();
	List<BoardListDto> detailList();
	boolean update(BoardDto boardDto);
	boolean delete(int boardNo);
	void updateView(BoardListDto boardDto);
	BoardListDto selectOne(int boardNo);
//	List<BoardDto> selectTitle(String boardTitle);
//	List<BoardDto> selectWriter(String boardWriter);
	Integer selectMax(String boardWriter);
	void updateView(BoardDto boardDto);
	List<BoardListDto> searchList(String type, String keyword);
	
	List<BoardListDto> selectListByPage(int page);
	List<BoardListDto> selectListByPage(String type, String keyword, int page);
	List<BoardListDto> selectListByPage(PaginationVO vo);
	
	int countList();
	int countList(String type, String keyword);
	int countList(PaginationVO vo);

	
	
	
	
}
