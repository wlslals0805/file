package com.kh.springhome.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;

import com.kh.springhome.error.AuthorityException;

//회원인지 아닌지 검사하여 비회원을 차단하는 인터셉터 구현
//- 세션에 name이라는 이름의 값이 있으면 회원, 없으면 비회원

@Component
public class MemberInterceptor implements HandlerInterceptor{
	@Override
	public boolean preHandle(HttpServletRequest request, 
							HttpServletResponse response, Object handler)
			throws Exception {
		
		//컨트롤러와 다르게 세션이 주어지지 않으므로, 요청정보에 들어있던 세션 객체를 추출하여 사용
		HttpSession session = request.getSession();
		
		String memberId = (String) session.getAttribute("name");
		boolean isLogin = memberId != null;
		
		if(isLogin) {//회원이면
			return true;
		}
		else {//비회원이면 
//			[1] 차단 + 로그인페이지로 리다이렉트
//			response.sendRedirect("/member/login?error3");
//			return false;
			
			//[2] 권한 없음 오류 발생
//			response.sendError(401);
			//return false;
			
			//[3] 내가 만든 예외로 처리
			throw new AuthorityException("로그인 후 이용가능");
		}
	}
}


