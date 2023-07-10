package api.lang.String2;

import java.util.Scanner;

public class Test07 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("아이디: ");
		
		String a = sc.next();
		
		System.out.println("비밀번호: ");
		String b = sc.next();
		
		System.out.println("이름: ");
		String c = sc.next();
		
		System.out.println("회원 등급: ");
		String d = sc.next();
		
		System.out.println("포인트: ");
		int e = sc.nextInt();
		
		sc.close();
		
		Member m = new Member(a,b,c,d,e);
		
		
	m.show();
		
		

		
		

		
		
		
		
		
		
		
	}

}
