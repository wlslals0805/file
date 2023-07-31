package jdbc.select;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;

import jdbc.dto.BoardDto;
import jdbc.dto.BoardDto;
import jdbc.mapper.BoardMapper;
import jdbc.mapper.BoardMapper;
import jdbc.util.JdbcUtils;

public class Test03_1 {

	public static void main(String[] args) {
		//Board 조회
		//-준비물 : BoardDto , BoardMapper
		
		String sql ="select * from board order by board_no desc";
		
		BoardMapper mapper = new BoardMapper();
		
		JdbcTemplate jdbcTemplate = JdbcUtils.getJdbcTemplate();
		
		List<BoardDto> list = jdbcTemplate.query(sql, mapper);
		
		
//		if(list.size()==0) {
		if(list.isEmpty()) {
			System.out.println("게시글이 존재하지 않습니다.");
		}
		else {
		for(BoardDto dto : list) {
//			System.out.println(dto);	//dto.toString()
			System.out.println(dto.getBoardTitle());
		}
		
		}
	}

}
