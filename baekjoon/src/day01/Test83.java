package day01;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Test83 {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		
		int[][] list = new int[num][num];
		
		
		for(int i=0;i<num;i++) {
			for(int a=0;a<num;a++) {
				
				list[i][a] = sc.nextInt();
				
			}
		}
		
		System.out.println(solution(list));
		
	}
	
	static int solution(int[][] input) {

		int max = 0;
		
		List<Integer> list = new ArrayList<>();
		
		for(int i=0; i<input.length;i++) {
			
			int total = 0;
			
			for(int a=0;a<input.length;a++) {
				total+=input[i][a];
			}
			
			if(max<total) {
				max = total;
			}
			
		}
		list.add(max);
		max=0;
		
		for(int i=0;i<input.length;i++) {
			int total = 0;
			for(int a=0;a<input.length;a++) {
				
				total+=input[a][i];
				
			}
			
			if(max<total) {
				max = total;
			}
		}
		
		list.add(max);
		max=0;
		int total = 0;
		for(int i=0;i<input.length;i++) {
			
			total+=input[i][i];
			
			
		}
		max = total;
		list.add(max);
		
		total = 0;
		
		int c=input.length-1;
		for(int i=0;i<input.length;i++) {
			
			
			total+=input[i][c];
			c--;
			
		}
		max = total;
		list.add(max);
		
		max = 0;
		for(int x : list) {
			
			if(x>max) {
				max = x;
			}
			
		}
		
		return max;
	}
}
