package jdbc.select;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;

import jdbc.dto.BoardDto;
import jdbc.dto.BookDto;
import jdbc.mapper.BookMapper;
import jdbc.util.JdbcUtils;

public class Test04 {

	public static void main(String[] args) {
		
		//도서 테이블(Book) 정보 조회 후 출력
		//(준비물) BookDto ,BookMapper
		
		
		String keyword = "1984";
		
//		String sql ="select * from book order by book_id asc";
		String sql ="select * from book where instr(book_title,?)>0 order by book_id asc";
		
		Object[] date = {keyword};
		
		BookMapper mapper = new BookMapper();
		
		JdbcTemplate jdbcTemplate = JdbcUtils.getJdbcTemplate();
		
		List<BookDto> list = jdbcTemplate.query(sql, mapper,date);
		
		
		if(list.isEmpty()) {
			
			System.out.println("존재하지 않는 도서");
		}
		
		else {
		System.out.println("조회 결과 수 :"+list.size());
		for(BookDto dto : list) {
			System.out.println(dto);	//dto.toString()
		}
		
		}
		
		
	}

}
