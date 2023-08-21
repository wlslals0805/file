package com.kh.springhome.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.kh.springhome.dao.AdminDao;
import com.kh.springhome.dao.MemberDao;
import com.kh.springhome.dto.MemberDto;
import com.kh.springhome.vo.PaginationVO;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
@RequestMapping("/admin")
public class AdminController {
	
	@Autowired
	AdminDao adminDao;
	
	@Autowired
	MemberDao memberDao;
	
	
	@RequestMapping("/home")
	public String home() {
		
		return "/WEB-INF/views/admin/home.jsp";
	}
	
//	@GetMapping("/list")
//	public String list(Model model,@RequestParam(required=false) String type,
//									@RequestParam(required=false)String keyword) {
//		
//		if(type==null&&keyword==null) {
//		List<MemberDto> list = adminDao.detailList();
//		
//		model.addAttribute("list",list);
//		model.addAttribute("isSearch",false);
//		}
//		
//		else {
//			
//			List<MemberDto> list = adminDao.searchList(type, keyword);
//			
//			model.addAttribute("list",list);
//			model.addAttribute("isSearch",true);
//		}
//		
//		
//		return "/WEB-INF/views/admin/list.jsp";
//		
//		
//	}
	
	
	@RequestMapping("/list")
	public String memberList(@ModelAttribute PaginationVO vo, Model model) {
		int count = adminDao.countList(vo);
		vo.setCount(count);
		model.addAttribute("vo", vo);
		
		List<MemberDto> list = adminDao.selectListByPage(vo);
		model.addAttribute("list", list);
		
		return "/WEB-INF/views/admin/list.jsp";
	}
	
	
	
	@RequestMapping("/member/detail")
	public String mypage(HttpSession session,Model model,
						@RequestParam String memberId) {
		
		
		MemberDto memberDto = memberDao.selectOne(memberId);
		
		model.addAttribute("memberDto", memberDto);
		
		return "/WEB-INF/views/member/mypage.jsp";
		
	}
	
	@GetMapping("/member/change")
	public String change(HttpSession session, Model model,@RequestParam String memberId) {
		
		MemberDto memberDto = memberDao.selectOne(memberId);
		
		model.addAttribute("memberDto", memberDto);
		
		return "/WEB-INF/views/member/change.jsp";
		
	}
	
	@PostMapping("/change")
	public String change(HttpSession session, @ModelAttribute MemberDto inputDto) 
	{
		
		String memberId = (String) session.getAttribute("name");
		
		//비밀번호 검사 후 변경 처리 요청
		MemberDto findDto = memberDao.selectOne(memberId);
		
		if(inputDto.getMemberPw().equals(findDto.getMemberPw())) {
			//비밀번호가 일치한다면
			
			inputDto.setMemberId(memberId); //아이디를 설정하고
			memberDao.updateMemberInfo(inputDto); //정보 변경 처리
			return "redirect:mypage";
			
		}
		else {
			//비밀번호가 일치하지 않는다면 -> 다시 입력하도록 되돌려보냄
			return "redirect:change?error";
			
			
		}	
	}
	
	
	
	
	
	
	
	

	
	
	
	
	

}
