package com.kh.springhome.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import com.kh.springhome.dto.BoardListDto;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Component
public class BoardListMapper implements RowMapper<BoardListDto>{

	@Override
	public BoardListDto mapRow(ResultSet rs, int rowNum) throws SQLException {
		
		com.kh.springhome.dto.BoardListDto boardListDto = new BoardListDto();
		
		boardListDto.setMemberNickname(rs.getString("member_nickname"));
		boardListDto.setBoardNo(rs.getInt("board_no"));
		boardListDto.setBoardContent(rs.getString("board_content"));
		boardListDto.setBoardTitle(rs.getString("board_title"));
		boardListDto.setBoardWriter(rs.getString("board_writer"));
		boardListDto.setBoardReadcount(rs.getInt("board_readcount"));
		boardListDto.setBoardReplycount(rs.getInt("board_replycount"));
		boardListDto.setBoardCtime(rs.getDate("board_ctime"));
		boardListDto.setBoardUtime(rs.getDate("board_utime"));
		
		boardListDto.setBoardDepth(rs.getInt("board_depth"));
		boardListDto.setBoardGroup(rs.getInt("board_group"));
		boardListDto.setBoardParent(rs.getObject("board_parent",Integer.class));
		
		return boardListDto;
	}
	
	
	
	
	

}
