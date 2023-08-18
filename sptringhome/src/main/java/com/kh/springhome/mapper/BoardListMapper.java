package com.kh.springhome.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import com.kh.springhome.dto.BoardDto;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Component
public class BoardListMapper implements RowMapper<BoardDto>{

	@Override
	public BoardDto mapRow(ResultSet rs, int rowNum) throws SQLException {
		
		BoardDto boardDto = new BoardDto();
		
		boardDto.setBoardNo(rs.getInt("board_no"));
		boardDto.setBoardContent(rs.getString("board_content"));
		boardDto.setBoardTitle(rs.getString("board_title"));
		boardDto.setBoardWriter(rs.getString("board_writer"));
		boardDto.setBoardReadcount(rs.getInt("board_readcount"));
		boardDto.setBoardReplycount(rs.getInt("board_replycount"));
		boardDto.setBoardCtime(rs.getDate("board_ctime"));
		boardDto.setBoardUtime(rs.getDate("board_utime"));
		
		boardDto.setBoardDepth(rs.getInt("board_depth"));
		boardDto.setBoardGroup(rs.getInt("board_group"));
		boardDto.setBoardParent(rs.getObject("board_parent",Integer.class));
		
		return boardDto;
	}
	
	
	
	
	

}
