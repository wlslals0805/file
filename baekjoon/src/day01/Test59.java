package day01;

import java.util.Scanner;

public class Test59 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String[][] array2 = new String[5][15];
		String[] array1 = new String[5];
		StringBuilder bd = new StringBuilder();
		
		String input = "";
		
		for(int i = 0; i<5;i++) {
			
				input = sc.next();
				array1[i] = input;
		}
		
		for(int i=0;i<5;i++) {
			
			for(int a = 0;a<array1[i].length();a++) {
				
				array2[i][a] = String.valueOf(array1[i].charAt(a));
	
			}
		}
		
//					bd.append(array2[0][1]);
//					bd.append(array2[1][1]);
//					bd.append(array2[2][1]);
//					bd.append(array2[3][1]);
//					bd.append(array2[4][1]);
					
			for(int i = 0;i<15;i++) {
				
				for(int a = 0;a<5;a++) {
					
					if(array2[a][i]==null) {
						bd.append("");
						
					}
					else{
					bd.append(array2[a][i]);
					}
				}
				
			
		
			
		}
		
			System.out.println(bd);
		
		
		
		
		
		
		
		
	}

}
