package api.lang.string;

import java.util.Scanner;

public class Test02_1 {

	public static void main(String[] args) {
		//입력
				Scanner sc = new Scanner(System.in);
				System.out.print("ID : ");
				String id = sc.next();
				System.out.print("Password : ");
				String pw = sc.next();
				sc.close();
				
				//계산
				//boolean isLogin = id == "khacademy" && pw == "student1234";
				//boolean isLogin = id.equals("khacademy") && pw.equals("student1234");
				boolean isLogin = id.equalsIgnoreCase("khacademy") && pw.equals("student1234");
				
				//출력
				if(isLogin) {
					System.out.println("로그인 성공");
				}
				else {
					System.out.println("정보가 일치하지 않습니다");
				}
	}

}
