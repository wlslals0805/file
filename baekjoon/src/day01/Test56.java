package day01;

import java.util.Scanner;

public class Test56 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double total = 0;
		double total2 = 0;
		double x= 0;

		
		
//		System.out.println(a);
//		System.out.println(b);
//		System.out.println(input.substring(a+1, a+(b-a)));
//		System.out.println(input.substring(b+1, input.length()));
//		System.out.println(score);
//		System.out.println(grade);
		
		for(int i=0;i<20;i++) {
			
		String input = sc.nextLine();
		
		
		
		int a = input.indexOf(" ");
		int b=input.lastIndexOf(" ");
		
		
		double score = Double.valueOf(input.substring(a+1, a+(b-a)));
		String grade = input.substring(b+1, input.length());
			
				
				if(grade.equals("A+")) {
					
					x = score*4.5;
					
				}
				else if(grade.equals("A0")) {
					
					x = score*4.0;
					
				}
				else if(grade.equals("B+")) {
					
					x= score*3.5;
					
				}
				
				else if(grade.equals("B0")) {
					
					x= score*3.0;
				}
				else if(grade.equals("C+")) {
					
					x= score*2.5;
				}
				
				else if(grade.equals("C0")) {
					
					x= score*2.0;
					
				}
				else if(grade.equals("D+")) {
					
					x= score*1.5;
					
				}
				else if(grade.equals("D0")) {
					x= score*1.0;
				}
				else if(grade.equals("P")) {
					score=0;
					x=0;
				
				}

				else { x= score*0.0;
			}
			

				
				
			total+=x;

			
			total2+=score;

			
		

	}
		
		double result = total/total2;
		
		System.out.println(result);
		

}}
