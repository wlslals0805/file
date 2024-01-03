package day01;

import java.util.Scanner;

public class Test78 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println(solution(sc.nextInt()));
		
		
	}
	
	static String solution(int input) {

		
		int[] list = new int[input];
		
		list[0] = 1;
		list[1] = 1;
		String result=list[0]+" "+list[1]+" ";
		
		for(int i=2;i<input;i++) {
			
			list[i] = list[i-1]+list[i-2]; 
			
			result+=list[i]+" ";
		}
		
		
		return result;
	}

}
