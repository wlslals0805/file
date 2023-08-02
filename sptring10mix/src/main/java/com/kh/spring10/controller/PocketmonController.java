package com.kh.spring10.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.kh.spring10.dao.PocketmonDao;
import com.kh.spring10.dto.PocketmonDto;



@Controller
@RequestMapping("/pocketmon")
public class PocketmonController {
	
	@Autowired
	private PocketmonDao dao; 
	
	
	//상세조회
	//-번호(no)를 받아서 포켓몬스터 정보(pocketmonDto)를 조회
	//-화면(JSP에 전달하도록 모델(Model)에 첨부
	@RequestMapping("/detail")
	public String detail(Model model,@RequestParam int no) {
		
		PocketmonDto dto = dao.detailList(no);
		
	
		
		model.addAttribute("dto", dto);
		
		
		
		return "/WEB-INF/views/pocketmon/detail.jsp";
		
//		JSP 표준 태그 라이브러리(Jsp Standard Tag Library).
//		JSP 페이지에서 필요한 프로그래밍 처리를 수행하는 태그.
//
//		변수 생성 - <c:set>
//		조건 - <c:if>, <c:choose>
//		반복 - <c:forEach>
//
//		사용하려면 JSP 페이지에 다음과 같은 설정을 해야 한다
//
//		<%@ taglib prefix="c" 
//		uri="http://java.sun.com/jsp/jstl/core" %>
		
//		조건이 한 개일 때는 <c:if>를 사용한다
//
//		<c:if test="조건식">
//
//		</c:if>
		
		//목록
		
	}
	@RequestMapping("/list")
	public String list(Model model) {
		List<PocketmonDto> list = dao.list();
		
		model.addAttribute("list", list);
		
		return "/WEB-INF/views/pocketmon/list.jsp";
		
		
	}

}
