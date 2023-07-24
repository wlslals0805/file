package jdbc.dao;

import org.springframework.jdbc.core.JdbcTemplate;

import jdbc.dto.ProductDto;
import jdbc.util.JdbcUtils;

public class ProductDao {
	
	public void insert(ProductDto dto) {
		
		
//		no number primary key,
//		name varchar2(30) not null,
//		type varchar2(15) check(type in ('과자','아이스크림','주류','사탕')),
//		price number,
//		made date,
//		expire date
		
		
		
//		String sql ="insert into(no,name,type,price,made,expire) values(product_seq.nextval,?,?,?,to_date(?,'yyyy-mm-dd'),?)";	//Dto가 문자열인 경우
		String sql ="insert into Product(no,name,type,price,made,expire) values(product_seq.nextval,?,?,?,?,?)";
		
		Object[] data = {dto.getName(),dto.getType(),dto.getPrice(),dto.getMade(),dto.getExpire()};
		
		
		JdbcTemplate jdbcTemplate = JdbcUtils.getJdbcTemplate();
 		jdbcTemplate.update(sql, data);
		
		
	}

}
