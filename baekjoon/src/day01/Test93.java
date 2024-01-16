package day01;

import java.util.Arrays;

public class Test93 {
	
	static int returnInt(String input) {
		
		int answer =0;
		for(char x : input.toCharArray()) {
			
			answer = answer * 10 + Integer.parseInt(String.valueOf(x));
		}
	
		StringBuilder sb = new StringBuilder();
		
	
		return answer;
	}
	
	
	
	public static void main(String[] args) {
		
		String s = "1234";
		int answer = 0;
		
		if(s.charAt(0)=='-'||s.charAt(0)=='+') {
	
			if(s.charAt(0)=='-') {
				
				for(int i=1;i<s.length();i++) {
					
			                answer = answer*10-Integer.parseInt(String.valueOf(s.charAt(i)));
			                
				}
				
				
			}
			else {
				s = s.substring(1,s.length());
				answer = returnInt(s);
			}
			
			
		}
		else {
		
		answer = returnInt(s);
		
		
	}
		System.out.println(answer);
	}
}
