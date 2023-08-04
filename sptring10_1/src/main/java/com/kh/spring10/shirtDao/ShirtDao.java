package com.kh.spring10.shirtDao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import com.kh.spring10.shirtDto.ShirtDto;

@Component
public class ShirtDao {
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	public void insert(ShirtDto dto) {
		
		String sql="insert into shirt(shirt_no,shirt_name,shirt_color,"
				+ "shirt_price,shirt_kind,shirt_type,shirt_material,shirt_stock)"
				+ "vaules(?,?,?,?,?,?,?,?)";
		
		
		Object[] data = {
				
				dto.getShirtNo(),dto.getShirtName(),dto.getShirtColor(),dto.getShirtPrice()
				,dto.getShirtKind(),dto.getShirtType(),dto.getShirtMaterial(),dto.getShirtStock()
				
		};
		
		
		jdbcTemplate.update(sql, data);
		
		
		
	}
	
	
	
	
	

}
