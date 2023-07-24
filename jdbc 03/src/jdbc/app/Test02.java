package jdbc.app;

import jdbc.dao.BoardDao;
import jdbc.dto.BoardDto;

public class Test02 {

	public static void main(String[] args) {
//		게시글 등록을 위한 코드를 DAO로 구현
		
		BoardDto dto = new BoardDto();
		
		
		//데이터
//		String boardTitle ="게시판제목";
//		 String boardContent ="게시판내용";
//		String boardWriter = "gsdgds5555";
//		int boardReadcount = 5;
		
		dto.setBoardTitle("게시판제목");
		dto.setBoardContent("게시판내용");
		dto.setBoardWriter("gdsgsg777");
		dto.setBoardReadcount(6);
				
				//처리
				BoardDao dao = new BoardDao();
				dao.insert(dto);
				
				System.out.println("등록 완료!");
		
		
		
		
		
		
	}

}
