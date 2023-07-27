package com.kh.spring05.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.kh.spring05.dto.PocketmonDto;

//DAO 클래스
//= Spring에 등록해야됨
//= JdbcTemplate을 주세요 해야됨(DI, 의존성 주입)
//= @Repository로 등록 (영원히 변하지 않는것을 다루는 객체, 영속성 제어 객체)
@Repository
public class PocketmonDao {
	
	@Autowired//(주의) 등록을 하지 않으면 절대로 주지 않음
	private JdbcTemplate jdbcTemplate;
	
	public void insert(PocketmonDto dto) {
		String sql = "insert into pocketmon(no, name, type) "
							+ "values(?, ?, ?)";
		Object[] data = {
			dto.getNo(), dto.getName(), dto.getType()
		};
		jdbcTemplate.update(sql, data);
	}
	
	
	public boolean update(PocketmonDto dto) {
		String sql = "update pocketmon set name=?,"
				+ "type=? where no=?";
		
		Object[] data = {
				dto.getName(),dto.getType(),dto.getNo()
				};
		
		return jdbcTemplate.update(sql,data)>0;
		
	}


	public boolean delete(int no) {
		
		String sql ="delete pocketmon where no= ?";
		Object[] data = {no};
		return jdbcTemplate.update(sql, data) > 0;

	}
	
	
}
