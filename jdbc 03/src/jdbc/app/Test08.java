package jdbc.app;

import jdbc.dao.BookDao;
import jdbc.dto.BookDto;

public class Test08 {

	public static void main(String[] args) {
		
		BookDto dto = new BookDto();
		BookDao dao = new BookDao();
		
		dto.setBookPrice(55.55f);
		
		boolean result1 = dao.updateBookPrice(dto);
		
		if(result1) {
			System.out.println("가격변경 완료");
			
		}
		else {System.out.println("없는 번호입니다.");}
		
		
		
		
		
		
	}

}
