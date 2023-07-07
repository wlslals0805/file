package api.lang.String;

import java.util.Scanner;

public class Test06 {
//	쿵쿵따 게임 만들기
//
//	첫 번째 제시어를 바나나로 설정해두고 사용자에게 단어를 입력받아서 쿵쿵따 게임을 진행하세요
//
//	요구사항
//
//	입력한 단어는 제시어와 이어져야 합니다
//	입력한 단어는 3글자여야 합니다
//	위 조건을 만족하지 않을 경우 게임오버가 되며 프로그램을 종료합니다
//	단어를 정상적으로 입력한 경우 제시어가 입력한 단어로 바뀝니다
//	반복적으로 위 작업을 진행합니다
	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		

		System.out.println("제시어를 입력하세요");
		while(true) {
		
			String a= sc.next();
			System.out.println(a);
			
			boolean a1 = a.charAt(0) >= '가' && a.charAt(2) <= '힣';
			
			
			if(a1==false) {
				System.out.println("한국어만 입력하세요");
			}
			
			if(a.length()>3) {System.out.println("세글자 초과 게임 오버"); break;}
			else if(a.length()<3) {System.out.println("세글자 미만 게임 오버");break;}  
			
			String b=sc.next();
			System.out.println(b);
			
			boolean b1 = b.charAt(0) >= '가' && b.charAt(2) <= '힣';
			if(b1==false) {
				System.out.println("한국어만 입력하세요");
			}
			
			
			if(b.length()>3) {System.out.println("세글자 초과 게임 오버"); break;}
			else if(b.length()<3) {System.out.println("세글자 미만 게임 오버");break;}  
			
		
			if(a.charAt(2)!=b.charAt(0)) {
				System.out.println("게임오버");
				break;
			}
			
			
			
		
	
		
	}
	}
}
