package com.kh.spring10.dao;

import java.util.List;

import com.kh.spring10.dto.BasketDto;

public interface BasketDao {
	
	void insert(BasketDto basketDto);
	List<BasketDto> list();
	BasketDto selectOne(int basketNo);
	boolean update(BasketDto basketDto);
	boolean delete(int basketNo);
}
