package api.collection3;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Test02 {

	public static void main(String[] args) {
//		로그인 프로그램
//
//		제시된 아이디와 비밀번호를 Map에 저장해두고 사용자에게 아이디와 비밀번호를 입력받아 다음과 같이 처리
//
//		아이디	비밀번호
//		admin	admin1234
//		teacher	teacher1234
//		student	student1234
//		manager	manager1234
		
//		아이디와 비밀번호가 모두 일치할 경우 로그인 성공 출력
//		그 외의 경우는 모두 로그인 실패 출력
		
		Scanner sc=new Scanner(System.in);
		Map<String,String>map=new HashMap<>();
		
		map.put("admin","admin1234");
		map.put("teacher","teacher1234");
		map.put("student","student1234");
		map.put("manager","manager1234");
		
		System.out.println("아이디를 입력하세요");
		String id=sc.next();
		
		System.out.println("비밀번호를 입력하세요");
		String pw=sc.next();
		
		
		if(pw.equals(map.get(id))) {			
			System.out.println("로그인 성공");		
		}
		else {
			System.out.println("로그인 실패");		
		}
		
	}

}
