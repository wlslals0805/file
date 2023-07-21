package day01;

import java.util.ArrayList;
import java.util.Scanner;

public class Test42 {

	public static void main(String[] args) {
//		문자열을 입력으로 주면 문자열의 첫 글자와 마지막 글자를 출력하는 프로그램을 작성하시오.
//
//		입력
//		입력의 첫 줄에는 테스트 케이스의 개수 T(1 ≤ T ≤ 10)가 주어진다. 각 테스트 케이스는 한 줄에 하나의 문자열이 주어진다. 
//		문자열은 알파벳 A~Z 대문자로 이루어지며 알파벳 사이에 공백은 없으며 문자열의 길이는 1000보다 작다.
//
//		출력
//		각 테스트 케이스에 대해서 주어진 문자열의 첫 글자와 마지막 글자를 연속하여 출력한다.
		
		
		Scanner sc = new Scanner(System.in);
		
		ArrayList<String> s = new ArrayList<>();
		
		int t =sc.nextInt();
		
		for(int i = 0;i<t;i++) {
		s.add(sc.next());
		}
		
		for(int i = 0;i<t; i++) {
			
			int last = s.get(i).length()-1;
			
			char a1= (s.get(i).charAt(0));
			char a2= (s.get(i).charAt(last));
			
			String a3= String.valueOf(a1);
			String a4 = String.valueOf(a2);
			
//			System.out.println((s.get(i).charAt(0))+(s.get(i).charAt(last)));
			System.out.println(a3+a4);
			
			
		}
		
//		3
//		ACDKJFOWIEGHE
//		O
//		AB
		
	}

}
