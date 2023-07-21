package jdbc;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

public class Test05 {

	public static void main(String[] args) {
//		Account 테이블에 사용자가 입력한 정보가 등록될 수 있도록 프로그래밍하세요
		
		
		String account_owner= "박진희";
		int account_period= 1;
		int account_count=2;
		int account_payment=3;
		int account_balance=4;
		
		
		String sql = "insert into Account(account_owner,account_period,account_count,account_payment,account_balance) values(?, ?, ?,?,?)";
		
		Object[] data = {account_owner,account_period,account_count,account_payment,account_balance};
		
		DriverManagerDataSource dataSource = new DriverManagerDataSource();
		dataSource.setDriverClassName("oracle.jdbc.OracleDriver");//DB종류
		dataSource.setUrl("jdbc:oracle:thin:@localhost:1521:xe");//DB위치+연결방식
		dataSource.setUsername("C##dummy");
		dataSource.setPassword("kh");
		
		JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
		
		jdbcTemplate.update(sql, data);
		
		System.out.println("계좌가 개설되었습니다.");
		
		
		
	}

}
