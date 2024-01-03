package day01;

import java.util.Scanner;

public class Test77 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		
		int[] listA = new int[num];
		int[] listB = new int[num];
		
		for(int i=0;i<num;i++) {
			listA[i] = sc.nextInt();
		}
		for(int i=0;i<num;i++) {
			listB[i] = sc.nextInt();
		}
	
		for(String x : solution(listA, listB)) {
			System.out.println(x);
		}
		
	}
	
	static String[] solution(int[] listA,int[] listB) {
		
		String[] result = new String[listA.length]; 
		
		
		for(int i=0;i<result.length;i++) {
			
			if(listA[i]==1&&listB[i]==3||listA[i]==2&&listB[i]==1||listA[i]==3&&listB[i]==2) {
				
				result[i] = "A";
			}
			else if(listB[i]==listA[i]) {
				
				result[i] = "D";
			}
			else {
				result[i] = "B";
			}
			
		}
		
		
		return result;
	}
}
