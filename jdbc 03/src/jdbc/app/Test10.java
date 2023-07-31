package jdbc.app;

import jdbc.dao.MemberDao;
import jdbc.dto.MemberDto;

public class Test10 {

	public static void main(String[] args) {
		
		MemberDto dto = new MemberDto();
		MemberDao dao =new MemberDao();
		
		
		dto.setMemberId("fdsfg333");
		dto.setMemberPw("gdfsgR4456!");
		
		boolean result = dao.updateMemberPassword(dto);
		
		if(result) {
			System.out.println("비밀번호 변경완료");
		}
		else {System.out.println("없는 아이디 입니다.");}
		
		
		
		
		
	}

}
