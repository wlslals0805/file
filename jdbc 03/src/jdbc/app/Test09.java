package jdbc.app;

import jdbc.dao.BookDao;
import jdbc.dto.BookDto;

public class Test09 {

	public static void main(String[] args) {
		BookDto dto = new BookDto();
		BookDao dao = new BookDao();
		
		dto.setBookTitle("바뀐도서명");
		dto.setBookAuthor("바뀐저자");
		dto.setBookPublisher("바뀐출판사");
		dto.setBookId(2);
		
		boolean result2 = dao.updateBookinfo(dto);
		
		if(result2) {
			
			System.out.println("책정보 변경 완료");
		}
		else {System.out.println("없는 번호입니다.");}
		
		
		
		
		
		
		
	}

}
