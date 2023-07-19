package day01;

import java.util.Scanner;

public class Test14 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int x= sc.nextInt();
		int y = sc.nextInt();
		
		boolean one = x>0&&y>0;
		boolean two = x<0&&y>0;
		boolean three = x<0&&y<0;
		boolean four = x>0&&y<0;
		
		if(one) {
			System.out.println(1);
		}
		else if(two) {
			System.out.println(2);
		}
		else if(three) {
			System.out.println(3);
		}
		else if(four) {
			System.out.println(4);
		}
		
		
		
	}

}
