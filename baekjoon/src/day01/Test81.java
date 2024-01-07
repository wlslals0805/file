package day01;

import java.util.Scanner;

public class Test81 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		sc.nextLine();
		
		
		 String[] list = sc.nextLine().split(" ");
		
		int[] list2 = new int[num];
		
		for(int i=0;i<num;i++) {
			list2[i] = Integer.parseInt(list[i]);
		}
		
		System.out.println(solution(list2));
		
		
	}
	
	static int solution(int[] input) {

		int[] result = new int[input.length];
		int answer = 0;
		
		int a = 0;
		for(int i=0;i<result.length;i++) {
			
			if(input[i]==0) {
				result[i]=0;
				a=0;
			}
			else {
				a++;
				result[i]=a;
			}
			
			
		}
		
		for(int x : result) {
			answer+=x;
			
		}
		
		return answer;
		
	}
	

}
