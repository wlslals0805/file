package com.kh.spring08.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.kh.spring08.dto.MemberDto;
import com.kh.spring08.mapper.MemberMapper;

@Repository
public class MemberDao {
	@Autowired
	private MemberMapper mapper;
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	//C
	public void insert(MemberDto dto) {
//		String sql = "insert into member("
//							+ "member_id, member_pw, member_nickname,"
//							+ "member_birth, member_email, member_contact,"
//							+ "member_level, member_point, member_join"
//						+ ") "
//						+ "values("
//							+ "?, ?, ?, ?, ?, ?, '일반', 0, sysdate"
//						+ ")";
		String sql = "insert into member("
				+ "member_id, member_pw, member_nickname,"
				+ "member_birth, member_email, member_contact,"
				+ "member_level, member_point, member_join"
			+ ") "
			+ "values("
				+ "?, ?, ?, ?, ?, ?, ?, ?, sysdate"
			+ ")";
//		Object[] data = {
//			dto.getMemberId(), dto.getMemberPw(),
//			dto.getMemberNickname(), dto.getMemberBirth(),
//			dto.getMemberEmail(), dto.getMemberContact()
//		};
		Object[] data = {
				dto.getMemberId(), dto.getMemberPw(),
				dto.getMemberNickname(), dto.getMemberBirth(),
				dto.getMemberEmail(), dto.getMemberContact(),dto.getMemberLevel(),dto.getMemberPoint()
			};
		jdbcTemplate.update(sql, data);
	}

	//R
	public List<MemberDto> selectList() {
		String sql = "select * from member order by member_id asc";
		return jdbcTemplate.query(sql, mapper);
	}
	
	//R
	public MemberDto selectOne(String memberId) {
		String sql = "select * from member where member_id = ?";
		Object[] data = {memberId};
		List<MemberDto> list = jdbcTemplate.query(sql, mapper, data);
		return list.isEmpty() ? null : list.get(0);
	}
	
	//U
	//public boolean updateMemberPw(String memberId, String memberPw) {
	public boolean updateMemberPw(MemberDto dto) {
		String sql = "update member "
						+ "set member_pw = ? "
						+ "where member_id = ?";
		Object[] data = {dto.getMemberPw(),dto.getMemberId()};
		return jdbcTemplate.update(sql, data) > 0;
	}
	
	//U
	public boolean updateInfo(MemberDto dto) {
		String sql = "update member "
						+ "set "
							+ "member_nickname=?, "
							+ "member_birth=?,"
							+ "member_contact=?,"
							+ "member_email=? "
						+ "where member_id = ?";
		Object[] data = {
			dto.getMemberNickname(), dto.getMemberBirth(),
			dto.getMemberContact(), dto.getMemberEmail(),
			dto.getMemberId()
		};
		return jdbcTemplate.update(sql, data) > 0;
	}
	
	//D
	public boolean delete(String memberId) {
		String sql = "delete member where member_id = ?";
		Object[] data = {memberId};
		return jdbcTemplate.update(sql, data) > 0;
	 }
}















