package com.kh.springhome.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import com.kh.springhome.dto.SaveDto;

@Component
public class SaveMapper implements RowMapper<SaveDto>{

	@Override
	public SaveDto mapRow(ResultSet rs, int rowNum) throws SQLException {
SaveDto saveDto = new SaveDto();
		
		saveDto.setSaveId(rs.getString("save_id"));
		saveDto.setSaveNo(rs.getInt("save_no"));
		
		return saveDto;
	}



}
