package day01;

import java.util.Scanner;

public class Test09 {

	public static void main(String[] args) {
//		(A+B)%C는 ((A%C) + (B%C))%C 와 같을까?
//
//				(A×B)%C는 ((A%C) × (B%C))%C 와 같을까?
//
//				세 수 A, B, C가 주어졌을 때, 위의 네 가지 값을 구하는 프로그램을 작성하시오.
//
//				입력
//				첫째 줄에 A, B, C가 순서대로 주어진다. (2 ≤ A, B, C ≤ 10000)
//
//				출력
//				첫째 줄에 (A+B)%C, 둘째 줄에 ((A%C) + (B%C))%C, 셋째 줄에 (A×B)%C, 넷째 줄에 ((A%C) × (B%C))%C를 출력한다.
		
		Scanner sc = new Scanner(System.in);
		
		int a =sc.nextInt();
		int b =sc.nextInt();
		int c =sc.nextInt();
		
		int d = (a+b)%c;
		int e=((a%c) + (b%c))%c;
		int f=(a*b)%c;
		int g=((a%c) * (b%c))%c;
		
		
//		boolean d = (a+b)%c==((a%c) + (b%c))%c;
//		boolean e = (a×b)%c==((a%c) × (b%c))%c;
		
		System.out.println(d);
		System.out.println(e);
		System.out.println(f);
		System.out.println(g);
		
		
	}

}
