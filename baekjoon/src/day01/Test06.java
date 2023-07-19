package day01;

import java.util.Scanner;

public class Test06 {

	public static void main(String[] args) {
//		두 자연수 A와 B가 주어진다. 이때, A+B, A-B, A*B, A/B(몫), A%B(나머지)를 출력하는 프로그램을 작성하시오. 
		
		Scanner sc = new Scanner(System.in);
		
		int a=sc.nextInt();
		int b=sc.nextInt();
		
		int c = a+b;
		int d = a-b;
		int e = a*b;
		int f= a/b;
		int g= a%b;
		
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
		System.out.println(f);
		System.out.println(g);
		
	}

}
