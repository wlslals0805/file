package day01;

import java.util.Scanner;

public class Test75 {
	
//	설명
//
//	N개의 정수를 입력받아, 자신의 바로 앞 수보다 큰 수만 출력하는 프로그램을 작성하세요.
//
//	(첫 번째 수는 무조건 출력한다)
//
//	입력
//	첫 줄에 자연수 N(1<=N<=100)이 주어지고, 그 다음 줄에 N개의 정수가 입력된다.
//
//	출력
//	자신의 바로 앞 수보다 큰 수만 한 줄로 출력한다.
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		
		int[] list = new int[num];
		
		for(int i=0;i<num;i++) {
			
			list[i] = sc.nextInt();
		}
		
		System.out.println(solution(list));
		
	}
	
	static String solution(int[] list) {
		
		String result = String.valueOf(list[0])+" ";
		
		for(int i=1;i<list.length;i++) {
			
			if(list[i]>list[i-1]) {

				result+=list[i]+" ";
				
			}
			
		}
		
		
		return result;

	}

}
