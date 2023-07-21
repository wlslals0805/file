package jdbc2;

import java.util.Scanner;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

public class Test03 {

	public static void main(String[] args) {
//		사용자에게 정보를 입력받아 Board 테이블의 항목을 수정하는 프로그램을 구현
//
//		성공/실패로 결과를 구분하여 출력
//		가능한 모든 정보를 변경하도록 처리
		
		Scanner sc = new Scanner(System.in);

		int boardNo = sc.nextInt();
		String boardTitle = sc.next();
		String boardContent =sc.next();
		String boardWriter =sc.next();
		int boardReadcount =sc.nextInt();
		
		String sql = "update Board set board_title=?,board_content=?,board_writer=?,board_readcount=? where board_no=?";
		Object[] data = {boardTitle,boardContent,boardWriter,boardReadcount,boardNo};
		
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
