package com.kh.springhome.dao;

import java.util.List;

import com.kh.spring10.dto.ClientDto;

public interface ClientDao {
	
	void insert(ClientDto clientDto);
	List<ClientDto> list();
	ClientDto selectOne(String clientId);
	boolean update(ClientDto clientDto);
	boolean delete(String clientId);

}
