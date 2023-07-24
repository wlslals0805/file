package jdbc.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import jdbc.dto.BookDto;

public class BookMapper implements RowMapper<BookDto>{
//	private int book_id ;
//	private String book_title;
//	private String book_author ;
//	private Date book_publication_date ;
//	private int book_price ;
//	private String book_publisher ;
//	private int book_page_count ;
//	private String book_genre ;
	@Override
	public BookDto mapRow(ResultSet rs, int idx) throws SQLException {
		BookDto dto = new BookDto();
		
		dto.setBookId(rs.getInt("book_id"));
		dto.setBookTitle(rs.getString("book_title"));
		dto.setBookAuthor(rs.getString("book_author"));
		dto.setBookPublicationDate(rs.getDate("book_publication_date"));
		dto.setBookPrice(rs.getFloat("book_price"));
		dto.setBookPublisher(rs.getString("book_publisher"));
		dto.setBookPageCount(rs.getInt("book_page_count"));
		dto.setBookGenre(rs.getString("book_genre"));
		return dto;
	}

}
