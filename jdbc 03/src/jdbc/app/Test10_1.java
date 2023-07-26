package jdbc.app;

import jdbc.dao.MemberDao;
import jdbc.dto.MemberDto;

public class Test10_1 {
	public static void main(String[] args) {
		//비밀번호 변경 프로그램
		
		//데이터 준비
		String memberId = "testuser1";
		String memberPw = "Testuser2@";
		String memberPwRe = "Testuser2@";
		
		//검사
		if(memberPw.equals(memberPwRe)) {//비밀번호와 확인이 일치한다면
			MemberDto dto = new MemberDto();
			dto.setMemberId(memberId);
			dto.setMemberPw(memberPw);
			
			MemberDao dao = new MemberDao();
			boolean result = dao.updateMemberPassword(dto);
			
			if(result) {
				System.out.println("비밀번호가 변경되었습니다");
			}
			else {
				System.out.println("존재하지 않는 아이디입니다");
			}
		}
		else {
			System.out.println("비밀번호가 확인과 일치하지 않습니다");
		}
	}
}




