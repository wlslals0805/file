package day01;

import java.util.Scanner;

public class Test67_2 {

//	영어 알파벳과 특수문자로 구성된 문자열이 주어지면 영어 알파벳만 뒤집고,
// 특수문자는 자기 자리에 그대로 있는 문자열을 만들어 출력하는 프로그램을 작성하세요.
//	입력
//	첫 줄에 길이가 100을 넘지 않는 문자열이 주어집니다.
//	출력
//	첫 줄에 알파벳만 뒤집힌 문자열을 출력합니다.
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String input = sc.nextLine();
		
		System.out.println(solution(input));
		
	}
	
	static String solution(String input) {

		String result = "";
		
		char[] c = input.toCharArray();
		
		int begin = 0;
		int end = c.length-1;
	
		while(begin<end) {
			
			char left = c[begin];
			char right = c[end];
			
			if(!Character.isAlphabetic(left)) {
			
				begin++;
				
			}
			else if(!Character.isAlphabetic(right)) {
			
				end--;
			}
			else {
				char save = c[begin];
				c[begin] = c[end];
				c[end] = save;
				
				begin++;
				end--;
			}

		}
		
		result = String.valueOf(c);
		
		return result;
		
	}
	
	
	

}
