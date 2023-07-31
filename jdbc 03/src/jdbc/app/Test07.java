package jdbc.app;

import jdbc.dao.BoardDao;
import jdbc.dto.BoardDto;

public class Test07 {

	public static void main(String[] args) {
		
		BoardDto dto =  new BoardDto();
		
		dto.setBoardNo(1);
		dto.setBoardTitle("변경된 제목");
		dto.setBoardContent("변경된 내용");
		
		BoardDao dao= new BoardDao();
		
		boolean result = dao.update(dto);
		
		if(result) {
			
			System.out.println("변경완료");
			
		}
		else {System.out.println("없는 게시글 번호");}
		
		
		
		
		
		
	}

}
