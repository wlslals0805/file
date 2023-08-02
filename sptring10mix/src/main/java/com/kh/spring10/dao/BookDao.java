package com.kh.spring10.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.kh.spring10.dto.BookDto;
import com.kh.spring10.mapper.BookMapper;





	
	
	//DAO 클래스
	//=Spring에 등록해야됨
	//=JdbcTemplate을 주세요 해야됨(DI, 의존성 주입)
	//=@Repository로 등록(영원히 변하지 않는 것을 다루는 객체, 영속성 제어 객체)

	@Repository
	public class BookDao {
		
		@Autowired 	//(주의) 등록을 하지 않으면 절대로 주지 않음
		private JdbcTemplate jdbcTemplate;
		
		@Autowired
		private BookMapper mapper;
		
		
		public void insert(BookDto dto) {
			String sql = "insert into book(book_id,book_title,book_author,book_publication_date,book_price,book_publisher,book_page_count,book_genre) "
					+ "values(book_seq.nextval,?,?,?,?,?,?,?)";
			
			Object[] data = {
					dto.getBookTitle(),dto.getBookAuthor(),dto.getBookPublicationDate(),dto.getBookPrice(),dto.getBookPublisher(),dto.getBookPageCount(),dto.getBookGenre()
			};
				jdbcTemplate.update(sql, data);	
			
		}
		
		public boolean update(BookDto dto) {
			String sql = "update book set book_title=?,book_author=? where book_id=?";
			
			Object[] data = {
					
					dto.getBookTitle(),dto.getBookAuthor(),dto.getBookId()
					
			};
			
			return jdbcTemplate.update(sql,data)>0;
			
		}
		
		
		public boolean delete(int bookId) {
			
			String sql ="delete book where book_id=?";
			Object[] data = {bookId};
			return jdbcTemplate.update(sql, data) > 0;

		}
		
		
		//전체출력 되는 메소드
		public List<BookDto> listAll(){
			String sql = "select * from book order by book_id asc";
			return jdbcTemplate.query(sql, mapper);
			
		}
		
		//이름,제목,내용,글쓴이 중에 내용 빼고 출력되는 메소드
//		public List<BookDto> selectList() {
//			//String sql = "select * from board order by board_no desc";
//			String sql = "select "
//								+ "board_no, board_title, "
//								+ "board_writer, board_readcount "
//							+ "from "
//							+ "board order by board_no desc";
//			return jdbcTemplate.query(sql, mapper);
//		}
		
		
		
		
		
		
		
		
		public BookDto selectOne(int bookId){
			String sql = "select * from book where book_id=?";
			
			Object[]data= {bookId};
					
			List<BookDto> list = jdbcTemplate.query(sql, mapper ,data);
			
				if(list.isEmpty()) {
				return null;
			}
		
			else {
				return list.get(0);		
				//상세조회 (번호 하나 선택 = 리스트에 들어온 목록이 하나 = get(0)만 존재)
			}
		}
		
		
		
}
