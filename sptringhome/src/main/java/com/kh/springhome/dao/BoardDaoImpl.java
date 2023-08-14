package com.kh.springhome.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.kh.springhome.dto.BoardDto;
import com.kh.springhome.mapper.BoardDetailMapper;
import com.kh.springhome.mapper.BoardListMapper;


@Repository
public class BoardDaoImpl implements BoardDao{
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	@Autowired 
	private BoardDetailMapper detailMapper;
	
	
	@Autowired 
	private BoardListMapper listMapper;
	
	@Override
	public int sequence() {
		
		String sql = "select board_seq.nextval from dual";
		
		return jdbcTemplate.queryForObject(sql, int.class);
		
	}
	

	@Override
	public void insert(BoardDto boardDto) {
		
//		String sql = "insert into board(board_no,boardWriter,boardTitle,boardContent,"
//				+ "boardReadcount,boardLikecount,boardReplycount,"
//				+ "boardCtime,boardUtime) "
//				+ "values(?,?,?,?,?,?,?,?)";
		
		String sql = "insert into board(board_no,board_writer,board_title,board_content)"
				+ "values(?,?,?,?)";
		
//		Object[]data = {boardDto.getBoardNo(),boardDto.getBoardWriter(),
//				boardDto.getBoardTitle(),boardDto.getBoardContent(),boardDto.getBoardReadcount(),boardDto.getBoardLikecount()
//				,boardDto.getBoardReplycount(),boardDto.getBoardCtime(),boardDto.getBoardUtime()};
		
		Object[]data = {boardDto.getBoardNo(),boardDto.getBoardWriter(),
				boardDto.getBoardTitle(),boardDto.getBoardContent()};
		
		
		jdbcTemplate.update(sql, data);
	}


	@Override
	public List<BoardDto> detailList() {
		
		String sql = "SELECT board.BOARD_NO,member.MEMBER_NICKNAME,board.BOARD_TITLE,board.BOARD_READCOUNT,board.BOARD_LIKECOUNT,"
				+ "board.BOARD_REPLYCOUNT,board.BOARD_CTIME,board.BOARD_UTIME  FROM board INNER JOIN MEMBER ON"
				+ " MEMBER.member_id=board.board_writer ORDER BY board_no desc";
	
		return jdbcTemplate.query(sql, detailMapper);
	}


	@Override
	public BoardDto seletOne(int boardNo) {
		
		String sql = "select * from board where board_no=?";
		
		Object[] data =  {boardNo};
		
		List<BoardDto> list = jdbcTemplate.query(sql, listMapper, data);
		
		
		return list.get(0);
	}
	
	@Override
	public List<BoardDto> seletTitle(String boardTitle) {
		
		String sql = "select * from board where board_title like ? order by board_no desc";
		
		Object[] data =  {boardTitle};
		
		
		
		return jdbcTemplate.query(sql, listMapper, data);
	}
	
	public List<BoardDto> seletWriter(String boardWriter) {
		
		String sql = "select * from board where board_writer like ? order by board_no desc";
		
		Object[] data =  {boardWriter};
		
		
		
		return jdbcTemplate.query(sql, listMapper, data);
	}


	@Override
	public void update(BoardDto boardDto) {
		
		String sql = "update board set board_title=?,board_content=?,board_utime=sysdate "
				+ "where board_no=?";
		
		Object[] data= {boardDto.getBoardTitle(),boardDto.getBoardContent(),boardDto.getBoardNo()};
		
		
		jdbcTemplate.update(sql, data);
	}
	
	@Override
	public void updateView(BoardDto boardDto) {
		
		String sql = "update board set board_readcount=?"
				+ "where board_no=?";
		
		Object[] data= {boardDto.getBoardReadcount(),boardDto.getBoardNo()};
		
		
		jdbcTemplate.update(sql, data);
	}


	@Override
	public boolean delete(int boardNo) {
		
		String sql = "delete board where board_no=?";
		
		Object[]data= {boardNo};
		
		
		jdbcTemplate.update(sql, data);
		
		return jdbcTemplate.update(sql, data)>0;

	}





	
	
	
	
	
	
	

}
