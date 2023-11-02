package com.kh.spring20.dao;

import java.util.List;

import com.kh.spring20.dto.BoardDto;
import com.kh.spring20.dto.ChatDto;
import com.kh.spring20.dto.ReplyDto;

public interface ChatDao {
	
	void insert(ChatDto dto);
	List<ChatDto> list();
	void replyInsert(ReplyDto replyDto);
	void boardInsert(BoardDto boardDto);
	

}
