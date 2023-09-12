package com.kh.spring11ajax.dao;

import com.kh.spring11ajax.dto.MemberDto;

//메소드 명세만 작성(책으로 치면 목차)
public interface MemberDao {

	void insert(MemberDto memberDto);
	MemberDto selectOne(String memberId);
	boolean updateMemberLogin(String memberId);
	boolean delete(String memberId);
	boolean updateMemberPw(String memberId, String changePw);
	boolean updateMemberInfo(MemberDto memberDto);
	boolean info(MemberDto dto);
	boolean delete2(String memberId);
	
	boolean increaseMemberPoint(String memberId, int point);
	boolean decreaseMemberPoint(String memberId, int point);
	MemberDto selectNicknameOne(String memberNickname);
	
	
	
}
