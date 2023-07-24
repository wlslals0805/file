package day01;

import java.util.Scanner;

public class Test45_1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String input = sc.next();
		
		for(char c ='a';c<='z';c++) {
			
			String a =String.valueOf(c);
			
			if(input.contains(a)) {
				
				System.out.println(input.indexOf(c));
			}
			else { System.out.println(-1);}
				
			
			
			
		}
		
		
		
		
		
	}

}
