package jdbc;

import java.util.Scanner;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

public class Test07 {

	public static void main(String[] args) {
			//		Board 테이블에 데이터 등록을 위한 프로그램 구현
		
//		int board_no =1;
		String board_title = "타이틀";
		String board_content ="내용";
		String board_writer ="wrier123456";
		int board_readcount =2;
		
//		Scanner sc = new Scanner(System.in);
		
		
//		String board_title = sc.next();
//		String board_content =sc.next();
//		String board_writer =sc.next();
//		int board_readcount =sc.nextInt();
		
		
String sql = "insert into Board(board_no,board_title,board_content,board_writer,board_readcount ) values(board_seq.nextval,?,?,?,?)";
		
		Object[] data = {board_title,board_content,board_writer,board_readcount };
		
		DriverManagerDataSource dataSource = new DriverManagerDataSource();
		dataSource.setDriverClassName("oracle.jdbc.OracleDriver");//DB종류
		dataSource.setUrl("jdbc:oracle:thin:@localhost:1521:xe");//DB위치+연결방식
		dataSource.setUsername("C##dummy");
		dataSource.setPassword("kh");
		
		JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
		
		jdbcTemplate.update(sql, data);
		
		System.out.println("게시판 정보 등록 완료");
		
		
		
		
	}

}
