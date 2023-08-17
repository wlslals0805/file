
	package com.kh.springhome.interceptor;

	import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;

import com.kh.springhome.dao.BoardDao;
import com.kh.springhome.dto.BoardDto;
import com.kh.springhome.error.NoTargetException;

	//회원인지 아닌지 검사하여 비회원을 차단하는 인터셉터 구현
	//- 세션에 name이라는 이름의 값이 있으면 회원, 없으면 비회원

	
	
	@Component
	public class BoardInterceptor implements HandlerInterceptor{
		
		@Autowired
		BoardDao boardDao;
		
		
		@Override
		public boolean preHandle(HttpServletRequest request, 
								HttpServletResponse response, Object handler)
				throws Exception {
			
			try { 
				int boardNo = Integer.parseInt(request.getParameter("boardNo"));
				BoardDto boardDto = boardDao.selectOne(boardNo);
		            
		            if(boardDto != null) {
		            	
		            	return true;
		            }
		            
		         else {
		            throw new NoTargetException("대상이 없습니다.");
		         }
			}
			catch(Exception e) {
				throw new NoTargetException("대상이 없습니다.");
			}
		}
	}
	





