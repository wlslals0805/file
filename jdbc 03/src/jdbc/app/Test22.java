package jdbc.app;

import jdbc.dao.MemberDao;
import jdbc.dto.MemberDto;

public class Test22 {

	public static void main(String[] args) {
		//데이터
		String memberId = "testuser11";
		
		//처리
		MemberDao dao = new MemberDao();
		MemberDto dto = dao.selectOne(memberId);
		
		//출력
		if(dto ==null) {
			System.out.println("찾으시는 번호의 게시글이 없습니다.");
		}
		else {
		System.out.println(dto.getMemberId());
		System.out.println(dto.getMemberNickname());
		System.out.println(dto.getMemberLevel());
		}
	}

}
