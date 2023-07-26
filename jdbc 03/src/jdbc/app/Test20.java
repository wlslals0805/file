package jdbc.app;

import jdbc.dao.BookDao;
import jdbc.dto.BookDto;

public class Test20 {

	public static void main(String[] args) {
		//데이터
		int bookId = 5;
		
		//처리
		BookDao dao = new BookDao();
		BookDto dto = dao.selectOne(bookId);
		
		//출력
		if(dto ==null) {
			System.out.println("찾으시는 번호의 도서가 없습니다.");
		}
		else {
		System.out.println(dto.getBookId());
		System.out.println(dto.getBookTitle());
		System.out.println(dto.getBookAuthor());
		}

		
		
		
		
	}

}
