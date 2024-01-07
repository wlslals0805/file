package day01;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Test84 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int[][] list = new int[n+2][n+2];
		
		for(int i=1;i<n+1;i++) {
			
			for(int a=1;a<n+1;a++) {
				
				list [i][a] = sc.nextInt();
				
			}
			
		}
		
//		for(int i=0;i<n+2;i++) {
//			
//			for(int a=0;a<n+2;a++) {
//				
//				System.out.print(list[i][a]+" ");
//				
//			}
//			System.out.println(" ");
//			
//		}
		
		
		System.out.println(solution(list,n));
		
	}

	static int solution(int[][] input,int n) {

		List<Integer> list = new ArrayList<>();
		
		for(int i=0;i<n+1;i++) {
			
			for(int a=0;a<n+1;a++) {
				int num = input[i][a];
				
				if(num!=0) {
					
					if(num>input[i][a+1]&&num>input[i][a-1]&&num>input[i-1][a]&&num>input[i+1][a]) {
						list.add(num);
					}
					
					
				}
				
			}
			
		}
		
		
		
		return list.size();
		
	}
}
