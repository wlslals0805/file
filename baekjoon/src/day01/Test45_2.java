package day01;

import java.util.Scanner;

public class Test45_2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String input = sc.next();
		
		for(char c = 'a';c<='z';c++) {
			
			int ansewr = input.indexOf(c);
			
			if(ansewr == 0) {
				
				System.out.println(-1);
			}
			else {System.out.println(ansewr);}
			
			
		}
		
		
		
		
		
		
	}

}
