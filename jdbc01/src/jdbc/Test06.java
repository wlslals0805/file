package jdbc;

import java.util.Scanner;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

public class Test06 {

	public static void main(String[] args) {
//		Book 테이블에 사용자가 입력한 도서정보가 등록될 수 있도록 프로그래밍하세요
		
		Scanner sc = new Scanner(System.in);
		
//		String book_title =sc.next();
//		String book_author =sc.next();
//		String book_publication_date =sc.next();
//		int book_price= sc.nextInt();
//		String book_publisher = sc.next();
//		int book_page_count = sc.nextInt();
//		String book_genre =sc.next();
	
//		int book_id =1;
		String book_title ="해리포터";
		String book_author ="조앤롤링";
		String book_publication_date ="2011-06-26";
		int book_price= 19;
		String book_publisher = "스콜라스틱";
		int book_page_count = 320;
		String book_genre ="판타지";
	
String sql = "insert into Book(book_id,book_title,book_author,book_publication_date,book_price,book_publisher,book_page_count,book_genre) values(book_seq.nextval,?, ?,?,?,?,?,?)";
		
		Object[] data = {book_title,book_author,book_publication_date,book_price,book_publisher,book_page_count,book_genre};
		
		DriverManagerDataSource dataSource = new DriverManagerDataSource();
		dataSource.setDriverClassName("oracle.jdbc.OracleDriver");//DB종류
		dataSource.setUrl("jdbc:oracle:thin:@localhost:1521:xe");//DB위치+연결방식
		dataSource.setUsername("C##dummy");
		dataSource.setPassword("kh");
		
		JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
		
		jdbcTemplate.update(sql, data);
		
		System.out.println("책 정보 목록 등록 완료");
		
		
		
		
		
	}

}
