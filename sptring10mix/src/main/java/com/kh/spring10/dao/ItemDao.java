package com.kh.spring10.dao;

import java.util.List;

import com.kh.spring10.dto.ItemDto;

public interface ItemDao {
	
	void insert(ItemDto itemDto);
	List<ItemDto> list();
	ItemDto selectOne(int itemNo);
	boolean update(ItemDto itemDto);
	boolean delete(int itemNo);

}
