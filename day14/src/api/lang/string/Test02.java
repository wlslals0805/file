package api.lang.string;

import java.util.Scanner;

public class Test02 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);

		
	
//		사용자에게 아이디와 비밀번호를 입력받아서 로그인 판정하는 프로그램 구현
//
//		아이디는 khacademy여야 하며 비밀번호는 student1234여야 한다
//		아이디는 대소문자를 구분하지 않고, 비밀번호는 대소문자를 구분해야 한다
//		정보가 일치한다면 로그인 성공, 일치하지 않는다면 로그인 실패를 출력
		
		
		//입력
				String id = "khacademy";
				String pw = "student1234";
				
				//계산
				boolean isLogin = id == "khacademy" && pw == "student1234";
				
				//출력
				if(isLogin) {
					System.out.println("로그인 성공");
				}
				else {
					System.out.println("정보가 일치하지 않습니다");
				}
		
		
	}

	}

