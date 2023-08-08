package com.kh.springhome.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.kh.springhome.dto.MemberDto;
import com.kh.springhome.mapper.MemberMapper;

@Repository
public class MemberDaoImpl implements MemberDao{
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	@Autowired
	private MemberMapper memberMapper;

	@Override
	public void insert(MemberDto memberDto) {
		String sql = "insert into member"
				+ "(member_id,member_pw,member_nickname,member_email,member_contact,member_birth,member_post,member_addr1,member_addr2)"
				+ "values(?,?,?,?,?,?,?,?,?)";
		
		Object[] data = {memberDto.getMemberId(),memberDto.getMemberPw(),memberDto.getMemberNickname(),memberDto.getMemberEmail(),memberDto.getMemberContact(),memberDto.getMemberBirth(),memberDto.getMemberPost(),memberDto.getMemberAddr1(),memberDto.getMemberAddr2()};
		
		jdbcTemplate.update(sql, data);
		
		
	}

	@Override
	public MemberDto selectOne(String memberId) {
		
		String sql = "select * from member where member_id=?";
		
		Object[]data= {memberId};
		List<MemberDto>list = jdbcTemplate.query(sql, memberMapper,data);
		
		
		return list.isEmpty() ? null : list.get(0);
	}

	@Override
	public boolean delete(String memberId) {
	
		String sql = "delete member where member_id=?";
		
		Object[] data = {memberId};
		
		boolean result = jdbcTemplate.update(sql, data)>0;
		
		return result;
		
	}

}
