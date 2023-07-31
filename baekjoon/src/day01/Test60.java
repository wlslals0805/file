package day01;

import java.util.Scanner;

public class Test60 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int[][] array = new int[100][100];
		
		int num = sc.nextInt();
		
		int[][] array2 = new int[10][10];
		int[][] array3 = new int[num][2];
		
		int index = 0;
		
		
		for(int i = 0;i<num;i++) {
			
			for(int a=0;a<2;a++) {
				
				
				index = sc.nextInt();
				
				array3[num][a] = index;
				
			}
			
		}
		
		for(int x=0;x<num;x++) {
				
			for(int e=0;e<2;e++) {
				
				for(int a =array3[x][e]+1;a<=array3[x][e]+10;a++) {
					
					array[a][a]=1;
				
				
				
			
			for(int b=1;b<2;b++) {
				
				
				
				
			}
			}
		}
	}
		
		
		
		
		
	}

}
