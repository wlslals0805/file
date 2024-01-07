package day01;

import java.util.Scanner;

public class Test82 {
	
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		
		int[] list = new int[num];
		
		for(int i=0;i<num;i++) {
			
			list[i]=sc.nextInt();
			
		}
		System.out.println(solution(list));
		
	}
	
	static String solution(int[] list) {

		int[] result = new int[list.length];
		
		for(int a=0; a<list.length;a++) {
			int rank = 1;
			for(int i=0;i<list.length;i++) {
				
				if(list[i]>list[a]) {
					rank++;
				}
			}
			result[a] = rank;
		}
		String answer = "";
		for(int x : result) {
			answer+=x+" ";
		}
		return answer;
	}

}
