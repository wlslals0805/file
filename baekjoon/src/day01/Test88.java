package day01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Test88 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		sc.nextLine();
		String input1 = sc.nextLine();
		String[] list1 = input1.split(" ");
		
		
		int m = sc.nextInt();
		sc.nextLine();
		String input2 = sc.nextLine();
		String[] list2 = input2.split(" ");
	
		
		System.out.println(solution(list1,list2));
		
	}
	
	static String solution(String[] input1,String[] input2) {

		String result = "";
		
		List<Integer> list = new ArrayList<>();
		List<Integer> answer = new ArrayList<>();
		
		for(int i=0;i<input1.length;i++) {
			
			list.add(Integer.parseInt(input1[i]));
			
		}
		
		for(int i=0;i<input2.length;i++) {
			if(list.contains(Integer.parseInt(input2[i]))) {
				answer.add(Integer.parseInt(input2[i]));
			}
		}
		
		int[] c = new int[answer.size()];

		for(int i=0;i<c.length;i++) {
			
			c[i]= answer.get(i);
		}
		
		Arrays.sort(c);
		
		for(int x : c) {
			
			result+=x+" ";
			
		}
		
		return result;
	}
}
