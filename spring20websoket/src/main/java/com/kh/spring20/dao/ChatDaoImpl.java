package com.kh.spring20.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.kh.spring20.dto.BoardDto;
import com.kh.spring20.dto.ChatDto;
import com.kh.spring20.dto.ReplyDto;
@Repository
public class ChatDaoImpl implements ChatDao{

	@Autowired
	private SqlSession sqlSession;
	
	@Override
	public void insert(ChatDto dto) {
		
		sqlSession.insert("chat.add",dto);
		
		
	}

	@Override
	public List<ChatDto> list() {
		
		
		return sqlSession.selectList("chat.list");
	}

	@Override
	public void replyInsert(ReplyDto replyDto) {
		
		sqlSession.insert("reply.add", replyDto);
		
	}

	@Override
	public void boardInsert(BoardDto boardDto) {
		
		sqlSession.insert("board.boardAdd", boardDto);
		
	}
	
	

}
