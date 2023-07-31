package jdbc.app;

import java.util.List;

import jdbc.dao.BoardDao;
import jdbc.dto.BoardDto;

public class Test16 {
	public static void main(String[] args) {
		//데이터 없음
		
		BoardDao dao = new BoardDao();
		List<BoardDto> list = dao.selectList();
		
		System.out.println("총 "+list.size()+"개의 글이 있습니다");
		for(BoardDto dto : list) {
			System.out.print("["+dto.getBoardNo()+"] ");
			System.out.println(dto.getBoardTitle());
		}
	}
}







