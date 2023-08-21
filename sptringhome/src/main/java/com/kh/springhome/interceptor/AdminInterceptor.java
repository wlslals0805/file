package com.kh.springhome.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;

import com.kh.springhome.dao.MemberDao;
import com.kh.springhome.dto.MemberDto;
import com.kh.springhome.error.AuthorityException;

@Component
public class AdminInterceptor implements HandlerInterceptor{
	
	@Autowired
	MemberDao memberDao;
	
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		
		HttpSession session = request.getSession();
		
		String memberId = (String) session.getAttribute("name");
		
		
		MemberDto memberDto = memberDao.selectOne(memberId);
		
		if(memberId == null) {
			throw new AuthorityException("로그인 후 이용가능");			
		}
		
		boolean level = memberDto.getMemberLevel().equals("관리자");
		
		
		if(level) {
			
			return true;
		}
		else {
			
			throw new AuthorityException("로그인 후 이용가능");
		}
		
		
		
		
	}
	
	
	
	

}
