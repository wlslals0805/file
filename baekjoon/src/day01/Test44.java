package day01;

import java.util.ArrayList;
import java.util.Scanner;

public class Test44 {

	public static void main(String[] args) {
		
		
		
//		N개의 숫자가 공백 없이 쓰여있다. 이 숫자를 모두 합해서 출력하는 프로그램을 작성하시오.
//
//		입력
//		첫째 줄에 숫자의 개수 N (1 ≤ N ≤ 100)이 주어진다. 둘째 줄에 숫자 N개가 공백없이 주어진다.
//
//		출력
//		입력으로 주어진 숫자 N개의 합을 출력한다.
		
		
		Scanner sc= new Scanner(System.in);
		
		
		int n =sc.nextInt();
		
		String number =sc.next();
		
		
		
		
		ArrayList<Integer> a = new ArrayList<>();
		
		for(int i = 0;i<n;i++) {
			
			a.add(Integer.parseInt(String.valueOf(number.charAt(i))));
			
		}
		
		int total = 0;
		
		for(int i = 0;i<n ; i++) {
			
			total+=a.get(i);
			
			
		}
		
		System.out.println(total);
		
		
		
		
		
		
	}

}
