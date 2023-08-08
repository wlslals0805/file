package com.kh.springhome.dao;

import com.kh.springhome.dto.MemberDto;

//메소드 명세만 작성(책으로 치면 목차)
public interface MemberDao {

	void insert(MemberDto memberDto);
	MemberDto selectOne(String memberId);
	boolean delete(String memberId);
	
	
	
}
