package day01;

import java.util.Scanner;

public class Test58 {

	public static void main(String[] args) {


		
		
		
		Scanner sc = new Scanner(System.in);
		
		int[][] a = new int[9][9];
		
		for(int i = 0; i<9 ; i++) {
			for(int b = 0; b<9;b++) {
				
				a[i][b] = sc.nextInt();
				
			}	
		}
		
		int maxIndex1 = 0;
		int maxIndex2 = 0;
		
		
		for(int i = 0; i<9 ; i++) {
			for(int b = 0; b<9;b++) {
				
				if(a[maxIndex1][maxIndex2]<a[i][b]) {
					maxIndex1 = i;
					maxIndex2 = b;
				}

			}	
	
		}
		
		System.out.println(a[maxIndex1][maxIndex2]);
		System.out.println((maxIndex1+1)+" "+(maxIndex2+1));


	}

}
