package jdbc.dao;

import org.springframework.jdbc.core.JdbcTemplate;

import jdbc.dto.BoardDto;
import jdbc.util.JdbcUtils;

//게시글을 CRUD 처리하는 도구
public class BoardDao {

	
	//등록 기능
//	public void insert(String boardTitle, String boardContent,String boardWriter,int boardReadcount) {
// 		String sql ="insert into board(board_no,board_title,board_content,board_writer,board_readcount) values(board_seq.nextval,?,?,?,?)";
// 		
// 		Object[] data = {boardTitle,boardContent,boardWriter,boardReadcount};
// 		
// 		JdbcTemplate jdbcTemplate = JdbcUtils.getJdbcTemplate();
// 		jdbcTemplate.update(sql, data);
//
// 		
// 		
// 		
//	}


	
	public void insert(BoardDto dto) {
		
String sql ="insert into board(board_no,board_title,board_content,board_writer,board_readcount) values(board_seq.nextval,?,?,?,?)";
 		
 		Object[] data = {dto.getBoardTitle(),dto.getBoardContent(),dto.getBoardWriter(),dto.getBoardReadcount()};
 		
 		JdbcTemplate jdbcTemplate = JdbcUtils.getJdbcTemplate();
 		jdbcTemplate.update(sql, data);

		
		
		
		
	}





}
