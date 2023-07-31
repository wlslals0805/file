package day01;

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

		
	}

}
