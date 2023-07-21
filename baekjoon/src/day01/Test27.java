package day01;

import java.util.Scanner;

public class Test27 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		int t = sc.nextInt();
		
		String a = "";
		
		String b = " ";
		String c = "";
		
		for(int i = t; i>0;i--) {
			for(int f=i-1; f>0;f--) {
				c+=b;
			}
//			System.out.println(c);
			
			String star = "*";
			a+=star;
			System.out.println(c+a);
			c="";
			
			
		}
		
		
		
	}

}
