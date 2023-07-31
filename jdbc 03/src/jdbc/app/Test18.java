package jdbc.app;

import java.util.List;

import jdbc.dao.MemberDao;
import jdbc.dto.BoardDto;
import jdbc.dto.MemberDto;

public class Test18 {

	public static void main(String[] args) {
		
		
		//데이터
		int page = 1;
		
		//DB처리
		MemberDao dao = new MemberDao();
		List<MemberDto> list = dao.selectListByPage(page);
		
		//System.out.println("총 "+list.size()+"개의 글이 있습니다");//의미없음
		for(MemberDto dto : list) {
			System.out.print("["+dto.getMemberId()+"] ");
			System.out.println(dto.getMemberNickname());
		}
		
		
		
		
	}

}
