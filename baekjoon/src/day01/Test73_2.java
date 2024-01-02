package day01;

import java.util.Scanner;

public class Test73_2 {
	
//	설명
//
//	알파벳 대문자로 이루어진 문자열을 입력받아 같은 문자가 연속으로 반복되는 경우 반복되는
//
//	문자 바로 오른쪽에 반복 횟수를 표기하는 방법으로 문자열을 압축하는 프로그램을 작성하시오.
//
//	단 반복횟수가 1인 경우 생략합니다.
//
//
//	입력
//	첫 줄에 문자열이 주어진다. 문자열의 길이는 100을 넘지 않는다.
//
//
//	출력
//	첫 줄에 압축된 문자열을 출력한다.
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println(solution(sc.next()));
		
	}
	
	static String solution(String input) {

		input+=" ";
		String result="";
		int cnt=1;
		
		for(int i=0;i<input.length()-1;i++) {
			
			if(input.charAt(i)==input.charAt(i+1)) {
				cnt++;
			}
			else {
				result+=input.charAt(i);
				if(cnt!=1) {
				result+=cnt;
				}
				cnt=1;
			}
			
		}
		return result;
	}

}
