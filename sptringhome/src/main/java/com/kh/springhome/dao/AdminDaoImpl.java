package com.kh.springhome.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.kh.springhome.dto.MemberDto;
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
					+ "where instr("+vo.getType()+", ?) > 0";
			Object[] data = {vo.getKeyword()};
			return jdbcTemplate.queryForObject(sql, int.class, data);
			//검색에 따른 카운트 결과(개수)
		}
		else {
			String sql = "select count(*) from member";
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
									+ "select * from member order by member_id asc"
								+ ")TMP"
							+ ") where rn between ? and ?";
			Object[] data = {vo.getStartRow(), vo.getFinishRow()};
			return jdbcTemplate.query(sql, memberMapper, data);
		}
	}


	

}
