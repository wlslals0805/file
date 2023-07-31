package day01;

import java.util.ArrayList;
import java.util.Scanner;

public class Test61 {

	public static void main(String[] args) {
//		정수 N이 주어졌을 때, 소인수분해하는 프로그램을 작성하시오.
//
//		입력
//		첫째 줄에 정수 N (1 ≤ N ≤ 10,000,000)이 주어진다.
//
//		출력
//		N의 소인수분해 결과를 한 줄에 하나씩 오름차순으로 출력한다. N이 1인 경우 아무것도 출력하지 않는다.
		
		
		Scanner sc = new Scanner(System.in);
		
		int n =sc.nextInt();
		ArrayList<Integer> list= new ArrayList<>();
		
			int i = n-1;
			int a = 0;
			
		while(true) {
			
			if(n/i==1&&n%i==0) {
				list.add(i);
				i--;
				if(i==1) {
					break;
				}
			}
			
			
			else  {
				i--;
				if(i==1) {
				break;}
			}
			
		
			}
			

		
		System.out.println(list);

	}}
	
					
				
				
					
				
			
			
			
			
		
		
		
		
	


