package day01;

import java.util.Scanner;

public class Test32 {

	public static void main(String[] args) {
//		N개의 정수가 주어진다. 이때, 최솟값과 최댓값을 구하는 프로그램을 작성하시오.
//
//		입력
//		첫째 줄에 정수의 개수 N (1 ≤ N ≤ 1,000,000)이 주어진다. 
//		둘째 줄에는 N개의 정수를 공백으로 구분해서 주어진다. 모든 정수는 -1,000,000보다 크거나 같고, 1,000,000보다 작거나 같은 정수이다.
//
//		출력
//		첫째 줄에 주어진 정수 N개의 최솟값과 최댓값을 공백으로 구분해 출력한다.
	
	Scanner sc = new Scanner(System.in);
	
	int n = sc.nextInt();
	
	int[] a = new int[n];
	
	
	for(int i = 0; i<a.length; i++) {
		
		a[i] = sc.nextInt();
		
		
	}
	
	int min = a[0];
	
	
	for(int i = 0; i<a.length; i++) {
		
		if(min>a[i]) {
			
			min = a[i];
		}
	}
	
	
	int max = a[0];
	
		for(int i = 0; i<a.length; i++) {
			
			if(max<a[i]) {
				
				max = a[i];
			}
			
	}
		
		System.out.print(min+" ");
		System.out.println(max);
		
		
		
	
	
	
	
	}

}
