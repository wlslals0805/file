package com.kh.spring06;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

	
	
	
	@Component //컨트롤러도 아니고 리파지토리도 아닌 애매한 놈들
	public class BoardMapper implements RowMapper<BoardDto>{

		@Override
		public BoardDto mapRow(ResultSet rs, int rowNum) throws SQLException {
			BoardDto dto = new BoardDto();
			
			dto.setBoardNo(rs.getInt("board_no"));
			dto.setBoardTitle(rs.getString("board_title"));
			dto.setBoardContent(rs.getString("board_content"));
			dto.setBoardWriter(rs.getString("board_writer"));
			dto.setBoardReadcount(rs.getInt("board_readcount"));
			
			return dto;
			

}
	}
