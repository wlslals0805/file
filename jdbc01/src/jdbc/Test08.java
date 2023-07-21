package jdbc;

import java.util.Scanner;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

public class Test08 {

	public static void main(String[] args) {
//		Member 테이블에 데이터 등록을 위한 프로그램 구현
		
		Scanner sc =new Scanner(System.in);
		
		
		
		
		
//		String member_id =sc.next();
//		String member_pw  =sc.next();
//		String member_nickname = sc.next();
//		String member_birth  =sc.next();
//		String member_email =sc.next();
//		String member_contact = sc.next();
//		String member_level =sc.next();
//		int member_point =sc.nextInt();
//		String member_join =sc.next();
		
		
		String member_id ="testuser0805";
		String member_pw  ="gdsgA!3ds";
		String member_nickname ="gfd완성한글kk1";
		String member_birth  ="2023-07-21";
		String member_email ="lll@naver.";
		String member_contact = "01012345678";
		String member_level ="일반";
		int member_point =6;
		String member_join ="2023-07-21";

		
String sql = "insert into Member"
		+ "(member_id,member_pw,member_nickname,member_birth,member_email,member_contact, member_level,member_point,member_join) values(?,?,?,?,?,?,?,?,?)";
		
		Object[] data = {member_id,member_pw,member_nickname,member_birth,member_email,member_contact, member_level,member_point,member_join};
		
		DriverManagerDataSource dataSource = new DriverManagerDataSource();
		dataSource.setDriverClassName("oracle.jdbc.OracleDriver");//DB종류
		dataSource.setUrl("jdbc:oracle:thin:@localhost:1521:xe");//DB위치+연결방식
		dataSource.setUsername("C##dummy");
		dataSource.setPassword("kh");
		
		JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
		
		jdbcTemplate.update(sql, data);
		
		System.out.println("회원 정보 등록 완료");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
