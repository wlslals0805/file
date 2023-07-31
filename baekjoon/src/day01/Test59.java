package day01;

<<<<<<< HEAD
import java.util.ArrayList;
import java.util.Scanner;

public class Test59 {

	public static void main(String[] args) {
//		주어진 수 N개 중에서 소수가 몇 개인지 찾아서 출력하는 프로그램을 작성하시오.
//
//		입력
//		첫 줄에 수의 개수 N이 주어진다. N은 100이하이다. 다음으로 N개의 수가 주어지는데 수는 1,000 이하의 자연수이다.
//
//		출력
//		주어진 수들 중 소수의 개수를 출력한다.
		
		Scanner sc = new Scanner(System.in);
		
		int n=sc.nextInt();
		int total=0;
		
		for(int i=0;i<n;i++) {
			ArrayList<Integer> list= new ArrayList<>();
			int a = 1;
			 int input= sc.nextInt();
			 
			 while(true) {
				 
				 if(input%a==0) {
					 list.add(a); 
					 
					 if(input==a) {
						 break;
					 }
				 }
				 a++;	 
			 }
			 
			 if(list.size()==2) {
				 total++;
			 }	
		}
		System.out.println(total);
=======
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
		
		
		
		
>>>>>>> branch 'main' of https://github.com/wlslals0805/file.git
		
		
		
		
	}

}
