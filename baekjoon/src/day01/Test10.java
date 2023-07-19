package day01;

import java.util.Scanner;

public class Test10 {

	public static void main(String[] args) {
//		(세 자리 수) × (세 자리 수)는 다음과 같은 과정을 통하여 이루어진다.

//		(1)과 (2)위치에 들어갈 세 자리 자연수가 주어질 때 (3), (4), (5), (6)위치에 들어갈 값을 구하는 프로그램을 작성하시오.
//
//		입력
//		첫째 줄에 (1)의 위치에 들어갈 세 자리 자연수가, 둘째 줄에 (2)의 위치에 들어갈 세자리 자연수가 주어진다.
//
//		출력
//		첫째 줄부터 넷째 줄까지 차례대로 (3), (4), (5), (6)에 들어갈 값을 출력한다.
		
		Scanner sc =new Scanner(System.in);
		
		int a = sc.nextInt();
		int b =sc.nextInt();
		
		sc.close();
		
		int three = b%10;
		int two = b%100/10;
		int one = b/100%100;
		
//		System.out.println(three);
//		System.out.println(two);
//		System.out.println(one);
		
		int a1 = three*a;
		int b1=two*a;
		int c1 = one*a;
		int d = a1+b1*10+c1*100;
		
		System.out.println(a1);
		System.out.println(b1);
		System.out.println(c1);
		System.out.println(d);
		
		
		
		
		
		
		
		
	}

}
