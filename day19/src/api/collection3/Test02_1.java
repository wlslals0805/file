package api.collection3;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Test02_1 {

	public static void main(String[] args) {
		//저장소 생성
				Map<String, String> db = new HashMap<>();
				
				//데이터를 미리 추가
				db.put("admin", "admin1234");
				db.put("teacher", "teacher1234");
				db.put("student", "student1234");
				db.put("manager", "manager1234");
				
				//아이디 비밀번호를 입력
				Scanner sc = new Scanner(System.in);
				System.out.print("아이디 : ");
				String userId = sc.nextLine();
				System.out.print("비밀번호 : ");
				String userPw = sc.nextLine();
				sc.close();
				
				//검사
				if(db.containsKey(userId) && userPw.equals(db.get(userId))) {//올바른 표현
					System.out.println("로그인 성공");
				}
				else {
					System.out.println("로그인 실패");
				}
	}

}
