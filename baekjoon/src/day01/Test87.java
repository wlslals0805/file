package day01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Test87 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
	
		int n = sc.nextInt();
		
		int[] list1 = new int[n];
		
		for(int i=0;i<n;i++) {
			list1[i] = sc.nextInt();
			
			
		}
		
		int m = sc.nextInt();
		
		int[] list2 = new int[m];
		
		for(int i=0;i<m;i++) {
			
			list2[i] = sc.nextInt();
			
		}
		
		System.out.println(solution(list1,list2));
		
		
	}
	
	static String solution(int[] input1,int[] input2) {

		String result="";
		
		List<Integer> list = new ArrayList<>();
	
		
		for(int x : input1) {
			
			list.add(x);
			
		}
		for(int x : input2) {
			
			list.add(x);
		}
		
		int[] answer = new int[list.size()];
		
		for(int i=0;i<answer.length;i++) {
			answer[i] = list.get(i);
		}
		
	 	Arrays.sort(answer);
		
		
		for(int x : answer) {
			
			result+=x+" ";
			
		}
		
		
		return result;
	}

}
