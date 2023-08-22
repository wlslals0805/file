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

/*
 * 관리자 외의 접근을 차단하는 인터셉터
 * 
 */


@Component
public class AdminInterceptor implements HandlerInterceptor{
	
	@Autowired
	MemberDao memberDao;
	
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		//HttpSession에 있는 level 항목이 관리자인지 확인하여 통과 또는 차단
	
		HttpSession session = request.getSession();
//		String memberId = (String) session.getAttribute("name");
//		MemberDto memberDto = memberDao.selectOne(memberId);
		
		String level = (String) session.getAttribute("level");
		
		//(주의) 자바는 null을 반드시 먼저 검사해야 한다
		boolean isAdmin=level!=null&&level.equals("관리자");
		
		if(isAdmin) {//관리자라면 통과
			return true;
		}
		
	
		else {//관리자가 아니라면 
			
			throw new AuthorityException("해당기능에 대한 권한이 없습니다.");
		}
		
		
		
		
	}
	
	
	
	

}
