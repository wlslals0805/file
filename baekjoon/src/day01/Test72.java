package day01;

import java.util.ArrayList;
import java.util.Scanner;

public class Test72 {
	
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
		
		System.out.println(solution(sc.nextLine()));
		
	}
	
	static String solution(String input) {

		String str= input.substring(0, input.indexOf(" "));
		String ch= input.substring(input.indexOf(" ")+1,input.length());
		
		ArrayList<Integer> list = new ArrayList<>();
		
		int[] list2 = new int[2];
		
		for(int i = 0;i<str.length();i++) {
			
			int num = 0;
			int num2 = 0;
			
			for(int a = i;a<str.length();a++) {
				if(String.valueOf(input.charAt(a)).equals(ch)) {
					
					
					list2[0] = num;
					a = str.length()-1;
					num = 0;
					
					
				}
				num++;
				
				
			}
			
			for(int b=i; b>=0;b--) {
				
				if(String.valueOf(input.charAt(b)).equals(ch)) {
					
					list2[1] = num2;
					b = 0;
					num2 = 0;
					
				}
				
				num2++;
			}
			
			if(list2[0]>list2[1]) {
				
				if(!String.valueOf(input.charAt(i)).equals(ch)&&list2[1]==0) {
					
					list.add(list2[0]);
					
				}
				else {
					list.add(list2[1]);
					
				}
				
				
			}
			
			else {
				
				if(!String.valueOf(input.charAt(i)).equals(ch)&&list2[0]==0) {
					
					list.add(list2[1]);
					
				}
				else {
					list.add(list2[0]);
					
				}
				
			}
			
			
			
		}
		
		String result ="";
		for(Integer x : list) {
			
			result+=x+" ";
			
		}
		
		
		return result;
		
		
		
	}
	

}
