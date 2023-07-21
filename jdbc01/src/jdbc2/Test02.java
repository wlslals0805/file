package jdbc2;

import java.util.Scanner;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

public class Test02 {

	public static void main(String[] args) {
//		사용자에게 정보를 입력받아 Book 테이블의 항목을 수정하는 프로그램을 구현
//
//		성공/실패로 결과를 구분하여 출력
//		제목이랑 가격을 변경하도록 구현
		
		Scanner sc = new Scanner(System.in);

		int bookId=sc.nextInt();
		String bookTitle = sc.next();		//띄어쓰기 불가
		float bookPrice= sc.nextFloat();
		
		String sql = "update Book set book_title = ?, book_price = ? where book_id = ?";
		Object[] data = {bookTitle, bookPrice,bookId};
		
		//실행 명령도 INSERT와 동일하다
		DriverManagerDataSource dataSource = new DriverManagerDataSource();
		dataSource.setDriverClassName("oracle.jdbc.OracleDriver");//DB종류
		dataSource.setUrl("jdbc:oracle:thin:@localhost:1521:xe");//DB위치+연결방식
		dataSource.setUsername("C##dummy");
		dataSource.setPassword("kh");
		
		JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
		
		int result = jdbcTemplate.update(sql, data);
		System.out.println("result="+result);
		
		if(result>0) {
		System.out.println("임무 완료!");}
		
		else {System.out.println("없는 번호");}
		
		
		
	}

}
