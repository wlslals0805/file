package day01;

import java.util.Scanner;

public class Test68_2 {

//	설명
//
//	소문자로 된 한개의 문자열이 입력되면 중복된 문자를 제거하고 출력하는 프로그램을 작성하세요.
//
//	중복이 제거된 문자열의 각 문자는 원래 문자열의 순서를 유지합니다.
//
//	입력
//	첫 줄에 문자열이 입력됩니다. 문자열의 길이는 100을 넘지 않는다.
//
//	출력
//	첫 줄에 중복문자가 제거된 문자열을 출력합니다.
	
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String input = sc.nextLine();
		
		System.out.println(solution(input));
		
		
}
	
	static String solution(String input) {
		
		String result ="";
		int start = 0;
		
		for(char x : input.toCharArray()) {
			
			 int index = input.indexOf(x); 
			 
			
			 if(start == index) {
				 
				 result+=x;
				 
			 }
			 start ++;
			
			
		}
		
//		for(int i = 0; i<input.length(); i++) {
//			
//			char currentCh = input.charAt(i);
//			//순회 중인 문자열 안에서 현재 문자
//			
//			int index = input.indexOf(currentCh);
//			//그 현재 문자의 맨 앞자리
//			
//			if(i==index) {
//				//맨 앞자리와 현재 문자의 자리(i)가 같으면 처음 나온 문자. 
//				//같지 않으면 앞서 나왔던 (중복)문자
//				
//				
//				result+=currentCh;
//				//처음 나온 문자면 추가
//				
//			}
//			
//			
//		}
		
		
		
		
		
		return result;

	}
	
	
}
