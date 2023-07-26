package jdbc.app;

import java.util.List;

import jdbc.dao.MemberDao;
import jdbc.dto.MemberDto;

public class Test17 {

	public static void main(String[] args) {
		MemberDao dao = new MemberDao();
		List<MemberDto> list = dao.selectList();
		
		if(list.isEmpty()) {
			System.out.println("등록된 회원 정보가 없습니다.");
		}
		else {
			System.out.println("총 "+list.size()+"개의 회원정보가 존재합니다");
			for(MemberDto dto : list) {
				System.out.println(dto);
			
			}
		}
		
		
	}

}
