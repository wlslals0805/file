package jdbc.app;

import jdbc.dao.MemberDao;
import jdbc.dto.MemberDto;

public class Test11 {

	public static void main(String[] args) {
		
		MemberDto dto =new MemberDto();
		MemberDao dao= new MemberDao();
		
		
		dto.setMemberId("fdsfg333");
		dto.setMemberNickname("바뀐닉네임");
		dto.setMemberContact("01012345678");
		dto.setMemberEmail("fdsgsg@hfdhds");
		dto.setMemberBirth("1998-08-05");
		
		boolean result = dao.updateMemberInfo(dto);
		
		if(result) {
			
			System.out.println("회원정보 변경 완료");
		}
		else {System.out.println("없는 아이디 입니다.");}
		
		
		
		
		
		
		
	}

}
