package api.lang.String2;

import java.util.Scanner;

public class Test07 {

	public static void main(String[] args) {
//		회원 가입 프로그램
//
//		Member라는 클래스를 만들고 다음 정보를 보관할 수 있도록 구현합니다.
//
//		회원아이디(memberId) - 8~20자 알파벳+숫자 로 구성
//		회원비밀번호(memberPw) - 8~15자 알파벳+숫자+특수문자 반드시 포함하여 구성
//		회원이름(memberName) - 한국인 이름
//		회원등급(memberLevel) - 관리자 / 우수회원 / 일반회원 중 하나로 설정, 기본값은 일반회원
//		회원포인트(memberPoint) - 최초 100점을 부여, 0 이상만 가능
//		Scanner를 통해서 가입에 필요한 정보를 입력받아 객체를 생성하고 출력
//		단, 비밀번호는 첫 글자를 제외한 나머지 마스킹 처리하여 출력
		Scanner sc=new Scanner(System.in);
		System.out.println("아이디: ");
		
		String a = sc.next();
		String b = sc.next();
		String c = sc.next();
		String d = sc.next();
		String e = sc.next();
		Member m = new Member(a, b, c, d, e);
		
		
		boolean q=a.matches(m.memberId);
				if(q) {
					System.out.println("통과");
				}
				
		

		
		
		
		
		
		
		
		
	}

}
