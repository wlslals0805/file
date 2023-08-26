package com.kh.springhome.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.kh.springhome.dto.MemberBlockDto;
import com.kh.springhome.dto.MemberDto;
import com.kh.springhome.dto.MemberListDto;
import com.kh.springhome.mapper.MemberBlockMapper;
import com.kh.springhome.mapper.MemberListMapper;
import com.kh.springhome.mapper.MemberMapper;
import com.kh.springhome.vo.PaginationVO;


@Repository
public class AdminDaoImpl implements AdminDao{

	@Autowired
	MemberDao memberDao;
	
	@Autowired
	JdbcTemplate jdbcTemplate;
	
	@Autowired
	MemberMapper memberMapper;
	
	@Autowired
	MemberListMapper memberListMapper;
	
	@Autowired
	MemberBlockMapper blockMapper;
	
	@Override
	public List<MemberDto> detailList() {
		
		String sql = "select * from member order by member_id asc";
		
		
		
		return jdbcTemplate.query(sql,memberMapper);
	}

//	@Override
//	public List<MemberDto> searchList(String type,String keyword) {
//		
//		String sql = "select * from member where instr("+type+",?)>0";
//		
//		Object[] data= {
//				
//				keyword
//				
//		};
//		
//		
//		return jdbcTemplate.query(sql,memberMapper,data);
//	}
	



	@Override
	public int countList(PaginationVO vo) {
		if(vo.isSearch()) {
			String sql = "select count(*) from member "
					+ "where instr("+vo.getType()+", ?) > 0 and member_level!='관리자'";
			Object[] data = {vo.getKeyword()};
			return jdbcTemplate.queryForObject(sql, int.class, data);
			//검색에 따른 카운트 결과(개수)
		}
		else {
			String sql = "select count(*) from member where member_level!='관리자'";
			return jdbcTemplate.queryForObject(sql, int.class);
			//목록에 따른 카운트 결과(개수)
		}
		
		
	}
	
	@Override
	public List<MemberDto> selectListByPage(PaginationVO vo) {
		if(vo.isSearch()) {
			String sql = "select * from ("
								+ "select rownum rn, TMP.* from ("
									+ "select * from member "
									+ "where instr("+vo.getType()+", ?) > 0 "
											+ "and member_level!='관리자'"
//									+ "order by member_id asc";
									+ "order by "+vo.getType()+" asc"
								+ ")TMP"
							+ ") where rn between ? and ?";
			Object[] data = {vo.getKeyword(), vo.getStartRow(), vo.getFinishRow()};
			return jdbcTemplate.query(sql, memberMapper, data);
		}
		else {
			String sql = "select * from ("
								+ "select rownum rn, TMP.* from ("
									+ "select * from member "
									+ "where member_level!='관리자'"
									+ " order by member_id asc"
								+ ")TMP"
							+ ") where rn between ? and ?";
			Object[] data = {vo.getStartRow(), vo.getFinishRow()};
			return jdbcTemplate.query(sql, memberMapper, data);
		}
	}

	@Override
	public boolean updateMemberInfoByAdmin(MemberDto memberDto) {
		
		String sql = "update member set "
				+ "member_nickname = ?, "
				+ "member_contact = ?,"
				+ "member_email = ?, "
				+ "member_birth = ?, "
				+ "member_post = ?, "
				+ "member_addr1 = ?, "
				+ "member_addr2 = ?, "
				+ "member_level = ?, "
				+ "member_point = ? "
			+ "where member_id = ?";
Object[] data = {
memberDto.getMemberNickname(), memberDto.getMemberContact(), 
memberDto.getMemberEmail(), memberDto.getMemberBirth(),
memberDto.getMemberPost(), memberDto.getMemberAddr1(), 
memberDto.getMemberAddr2(), memberDto.getMemberLevel(), 
memberDto.getMemberPoint(), memberDto.getMemberId()
};
		
		return jdbcTemplate.update(sql,data)>0;
	}

	@Override
	public void insertBlock(String memberId) {
		
		String sql = "insert into member_block(member_id) values(?)";
		
		Object[] data = {memberId};
		
		jdbcTemplate.update(sql,data);
		
		
	}

	@Override
	public boolean deleteBlock(String memberId) {
		
		String sql = "delete member_block where member_id=?";
		Object[] data=  {memberId};
		
		return jdbcTemplate.update(sql,data)>0;
	}

	@Override
	public List<MemberListDto> selectListByPage2(PaginationVO vo) {
		if(vo.isSearch()) {
			String sql = "select * from ("
								+ "select rownum rn, TMP.* from ("
									+ "select * from member_list "
									+ "where instr("+vo.getType()+", ?) > 0 "
									+ "and member_level != '관리자' " 
//									+ "order by member_id asc";
									+ "order by "+vo.getType()+" asc"
								+ ")TMP"
							+ ") where rn between ? and ?";
			Object[] data = {vo.getKeyword(), vo.getStartRow(), vo.getFinishRow()};
			return jdbcTemplate.query(sql, memberListMapper, data);
		}
		else {
			String sql = "select * from ("
								+ "select rownum rn, TMP.* from ("
									+ "select * from member_list "
									+ "where member_level != '관리자' " 
									+ "order by member_id asc"
								+ ")TMP"
							+ ") where rn between ? and ?";
			Object[] data = {vo.getStartRow(), vo.getFinishRow()};
			return jdbcTemplate.query(sql, memberListMapper, data);
		}
		
		
	}

	@Override
	public List<MemberBlockDto> selectBlockList() {
		
		String sql = "select * from member_block order by block_time asc";
		
		
		
		return jdbcTemplate.query(sql, blockMapper);
	}

	@Override
	public MemberBlockDto selectBlockOne(String memberId) {
		
		String sql = "select * from member_block where member_id=?";
		
		Object[] data = {memberId};
		
		List<MemberBlockDto> list=jdbcTemplate.query(sql, blockMapper,data);
		
		
		return list.isEmpty()?null:list.get(0);
	}


	

}
