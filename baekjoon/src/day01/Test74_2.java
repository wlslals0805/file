package day01;

import java.util.Scanner;

public class Test74_2 {

	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int num = Integer.parseInt(sc.next());
		String input = sc.next();
		String[] str = new String[num];
		int a = 0;
		
		for(int i=0;i<num;i++) {
			
			str[i] = input.substring(a, a+7);
			a+=7;
			str[i] = str[i].replaceAll("[#]", "1");
			str[i] = str[i].replaceAll("[*]", "0");
		}
		
			
	System.out.println(solution(str));
		
	}
	
	static String solution(String[] str) {

		int[] codeList = new int[str.length];
		String result = "";
		
		for(int i=0;i<str.length;i++) {
			
			codeList[i] = Integer.parseInt(str[i], 2);
				
				
			result = result + (char) codeList[i];
		}
		return result;
	}
	
	
	
	
}
