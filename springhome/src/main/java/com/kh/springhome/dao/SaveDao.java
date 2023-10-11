package com.kh.springhome.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.kh.springhome.dto.SaveDto;
import com.kh.springhome.mapper.SaveMapper;

@Repository
public class SaveDao {
	
	
@Autowired SaveMapper mapper;

@Autowired JdbcTemplate jdbcTemplate;

	
	public List<SaveDto> selectList(String memberId){
		
		String sql = "select * from save where save_id=?";
		
		Object[]data = {memberId};
		
		jdbcTemplate.query(sql,mapper,data);
		
		return jdbcTemplate.query(sql,mapper,data);
		
	}
	
	
	public void listInsert(SaveDto dto) {
		
		String sql = "insert into save(save_id,save_no) values(?,?)";
		
		Object[]data= {dto.getSaveId(),dto.getSaveNo()};
		
		jdbcTemplate.update(sql,data);
		
	}
	
	
	}

