package oop.poly1;

import java.util.Scanner;

public class Test02 {

	public static void main(String[] args) {
		
	
		Scanner sc=new Scanner(System.in);
		
		
			
			System.out.println("노트북을 선택하세요: 1. 맥북 2.갤럭시북");
			int a=sc.nextInt();
			System.out.println("테스트할 기능을 선택하세요");
			int b=sc.nextInt();

			Notebook d= new GalaxyBook();
			Notebook e=new MacBook();
			Test c=new Test();
			

			if(a==1) {
			
			if(b==1) {c.power(d); }
			else if(b==2) {c.power(e);}
			
			if(a==2) {
				
				if(b==1) { c.power(d);}
				else if(b==2) {c.power(e);}

			}
			
		
			
	}
	}
}


