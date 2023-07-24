package jdbc.app;

import jdbc.dao.BookDao;
import jdbc.dto.BookDto;

public class Test03 {

	public static void main(String[] args) {
		
		BookDto dto = new BookDto();
		
		
		
		dto.setBookTitle("해리포터와아즈카반의죄수");
		dto.setBookAuthor("조앤롤링");
		dto.setBookPublicationDate("2002-02-01");
		dto.setBookPrice(14.55f);
		dto.setBookPublisher("블라블라");
		dto.setBookPageCount(450);
		dto.setBookGenre("판타지");
		
		BookDao dao = new BookDao();
		
		dao.insert(dto);
		
		System.out.println("등록완료!");
		
		
		
	}

}
