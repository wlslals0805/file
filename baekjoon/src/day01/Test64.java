package day01;


import java.util.Scanner;

public class Test64 {
//	설명
//
//	대문자와 소문자가 같이 존재하는 문자열을 입력받아 대문자는 소문자로 소문자는 대문자로 변환하여 출력하는 프로그램을 작성하세요.
//
//
//	입력
//	첫 줄에 문자열이 입력된다. 문자열의 길이는 100을 넘지 않습니다.
//
//	문자열은 영어 알파벳으로만 구성되어 있습니다.
//
//
//	출력
//	첫 줄에 대문자는 소문자로, 소문자는 대문자로 변환된 문자열을 출력합니다.
	
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String input1 = sc.nextLine();
		
		String result = solution(input1);
		
		
		
		System.out.println(result);
	}
	
	private static String solution(String input1) {
		
		StringBuilder sb = new StringBuilder();
		
		int length = input1.length();
		
		for(int i=0;i<length;i++) {
			
			String present = String.valueOf(input1.charAt(i));
			String presentUpper = present.toUpperCase();
			
			String change;
			
			if(presentUpper.equals(present)) {//대문자일시
				
				change = present.toLowerCase();
				sb.append(change);
				
			}
			else {
				
				change = present.toUpperCase();
				sb.append(change);
				
			}
			
		}
		
		String result = sb.toString();
		
		return result;

	}
	

	
}
