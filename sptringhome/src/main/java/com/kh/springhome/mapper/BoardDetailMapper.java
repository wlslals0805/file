package com.kh.springhome.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import com.kh.springhome.dto.BoardDto;

@Component


public class BoardDetailMapper implements RowMapper<BoardDto>{
	

	@Override
	public BoardDto mapRow(ResultSet rs, int rowNum) throws SQLException {
		BoardDto boardDto = new BoardDto(); 	//객체 생성 및 초기화
		
		boardDto.setBoardNo(rs.getInt("board_no"));
		boardDto.setBoardTitle(rs.getString("board_title"));
		boardDto.setBoardWriter(rs.getString("member_nickname"));
		boardDto.setBoardReadcount(rs.getInt("board_readcount"));
		boardDto.setBoardReplycount(rs.getInt("board_replycount"));
		boardDto.setBoardCtime(rs.getDate("board_ctime"));
		boardDto.setBoardUtime(rs.getDate("board_utime"));

		return boardDto;
	}
	
	
	

}
