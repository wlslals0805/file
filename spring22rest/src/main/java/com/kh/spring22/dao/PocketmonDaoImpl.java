package com.kh.spring22.dao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import com.kh.spring22.dto.PocketmonDto;

@Repository
public class PocketmonDaoImpl implements PocketmonDao{
	
	@Autowired
	private SqlSession sqlSession;

	@Override
	public List<PocketmonDto> selectList() {
		return sqlSession.selectList("pocketmon.list");
	}

	@Override
	public void insert(PocketmonDto pocketmonDto) {
		sqlSession.insert("pocketmon.save",pocketmonDto);
		
	}

	@Override
	public boolean delete(int no) {
		
		
		return sqlSession.delete("pocketmon.remove",no)>0;
	}

	@Override
	public PocketmonDto selectOne(int no) {
		
		return sqlSession.selectOne("pocketmon.find",no);
	}

	@Override
	public boolean edit(int no, PocketmonDto pocketmonDto) {
		
		Map<String,Object> params = new HashMap<>();
		params.put("origin", no);
		params.put("dto", pocketmonDto);
		
		return sqlSession.update("pocketmon.edit",params)>0;
	}

	@Override
	public boolean editUnit(int no, PocketmonDto pocketmonDto) {
		
		Map<String,Object> params = new HashMap<>();
		
		params.put("no", no);
		params.put("dto", pocketmonDto);
		
		
		return sqlSession.update("pocketmon.editUnit",params)>0;
	}
	
	
		
	
	
	
	

}
