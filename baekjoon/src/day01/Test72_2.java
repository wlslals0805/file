package day01;

import java.util.ArrayList;
import java.util.Scanner;

public class Test72_2 {
	
//	설명
//
//	한 개의 문자열 s와 문자 t가 주어지면 문자열 s의 각 문자가 문자 t와 떨어진 최소거리를 출력하는 프로그램을 작성하세요.
//
//
//	입력
//	첫 번째 줄에 문자열 s와 문자 t가 주어진다. 문자열과 문자는 소문자로만 주어집니다.
//
//	문자열의 길이는 100을 넘지 않는다.
//
//
//	출력
//	첫 번째 줄에 각 문자열 s의 각 문자가 문자 t와 떨어진 거리를 순서대로 출력한다.
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println(solution(sc.next(),sc.next()));
		
	}
	
	static String solution(String str,String ch) {
		
		int a = 1000; 
		int[] result = new int[str.length()];
		
		for(int i =0;i<str.length();i++) {
			
			
			if(String.valueOf(str.charAt(i)).equals(ch)) {
				
				a=0;
				
			}
			result[i] = a;
			
			a++;
			
		}
		
		a=1000;
		
		for(int i=str.length()-1;i>=0;i--) {
			
			if(String.valueOf(str.charAt(i)).equals(ch)) {
				
				a=0;
				
			}
			result[i] = Math.min(result[i], a);
			a++;
		}
		
		String result2 = "";
		for(int x : result) {
			
			result2+=x+" ";
			
		}
		
		return result2;
		
		
	}
	

}
