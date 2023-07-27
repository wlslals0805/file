package com.kh.spring06;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;



	
	
	//DAO 클래스
	//=Spring에 등록해야됨
	//=JdbcTemplate을 주세요 해야됨(DI, 의존성 주입)
	//=@Repository로 등록(영원히 변하지 않는 것을 다루는 객체, 영속성 제어 객체)

	@Repository
	public class BoardDao {
		
		@Autowired 	//(주의) 등록을 하지 않으면 절대로 주지 않음
		private JdbcTemplate jdbcTemplate;
		
		public void insert(BoardDto dto) {
			String sql = "insert into board(board_no,board_title,board_content,board_writer) "
					+ "values(board_seq.nextval,?,?,?)";
			
			Object[] data = {
					dto.getBoardTitle(),dto.getBoardContent(),dto.getBoardWriter()
			};
				jdbcTemplate.update(sql, data);	
			
		}
		
		public boolean update(BoardDto dto) {
			String sql = "update Board set board_title=?,"
					+ "board_content=? where board_no=?";
			
			Object[] data = {
					dto.getBoardTitle(),dto.getBoardContent(),dto.getBoardNo()
			
			};
			
			return jdbcTemplate.update(sql,data)>0;
			
		}
		
		
		public boolean delete(int boardNo) {
			
			String sql ="delete board where board_no= ?";
			Object[] data = {boardNo};
			return jdbcTemplate.update(sql, data) > 0;

		}
		
		
}
