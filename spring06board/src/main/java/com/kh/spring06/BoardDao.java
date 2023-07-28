package com.kh.spring06;

import java.util.List;

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
		
		@Autowired
		private BoardDetailMapper detailMapper;
		
		@Autowired
		private BoardListMapper listMapper;
		
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
		
		
		//전체출력 되는 메소드
		public List<BoardDto> list(){
			String sql = "select * from board order by board_no asc";
			return jdbcTemplate.query(sql, detailMapper);
			
		}
		
		//이름,제목,내용,글쓴이 중에 내용 빼고 출력되는 메소드
		public List<BoardDto> selectList() {
			//String sql = "select * from board order by board_no desc";
			String sql = "select "
								+ "board_no, board_title, "
								+ "board_writer, board_readcount "
							+ "from "
							+ "board order by board_no desc";
			return jdbcTemplate.query(sql, listMapper);
		}
		
		
		
		
		
		
		
		
		public BoardDto selectOne(int boardNo){
			String sql = "select * from board where board_no=?";
			
			Object[]data= {boardNo};
					
			List<BoardDto> list = jdbcTemplate.query(sql, detailMapper ,data);
			
				if(list.isEmpty()) {
				return null;
			}
		
			else {
				return list.get(0);		
				//상세조회 (번호 하나 선택 = 리스트에 들어온 목록이 하나 = get(0)만 존재)
			}
		}
		
		
		
}
