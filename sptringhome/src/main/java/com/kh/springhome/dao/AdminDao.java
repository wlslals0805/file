package com.kh.springhome.dao;

import java.util.List;

import com.kh.springhome.dto.MemberDto;
import com.kh.springhome.vo.PaginationVO;

public interface AdminDao {
	
	public List<MemberDto> detailList();
	List<MemberDto> selectListByPage(PaginationVO vo);
	int countList(PaginationVO vo);


}
