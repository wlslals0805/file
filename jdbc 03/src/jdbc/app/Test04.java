package jdbc.app;

import jdbc.dao.MemberDao;
import jdbc.dto.MemberDto;

public class Test04 {

	public static void main(String[] args) {
		
		MemberDto dto = new MemberDto();
		
		
		dto.setMemberId("fdsfg333");
		dto.setMemberPw("fTdsg4214!");
		dto.setMemberNickname("닉네네네임7");
		dto.setMemberBirth("2020-02-01");
		dto.setMemberContact("01012345678");
		
		MemberDao dao = new MemberDao();
		
		dao.insert(dto);
		
		System.out.println("등록 완료");
		
	}

}
