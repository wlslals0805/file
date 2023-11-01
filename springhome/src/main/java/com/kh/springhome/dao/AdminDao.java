package com.kh.springhome.dao;

import java.util.List;

import com.kh.springhome.dto.MemberBlockDto;
import com.kh.springhome.dto.MemberDto;
import com.kh.springhome.dto.MemberListDto;
import com.kh.springhome.vo.PaginationVO;

public interface AdminDao {
	
	public List<MemberDto> detailList();
	List<MemberDto> selectListByPage(PaginationVO vo);
	int countList(PaginationVO vo);
	boolean updateMemberInfoByAdmin(MemberDto memberDto);
	
	//차단 + 해제 기능
	void insertBlock(String memberId);
	boolean deleteBlock(String memberId);
	List<MemberListDto> selectListByPage2(PaginationVO vo);

	List<MemberBlockDto> selectBlockList();
	MemberBlockDto selectBlockOne(String memberId);
}
