package day01;

import java.util.Scanner;

public class Test79_4 {
	
//	설명
//
//	자연수 N이 입력되면 1부터 N까지의 소수의 개수를 출력하는 프로그램을 작성하세요.
//
//	만약 20이 입력되면 1부터 20까지의 소수는 2, 3, 5, 7, 11, 13, 17, 19로 총 8개입니다.
//
//
//	입력
//	첫 줄에 자연수의 개수 N(2<=N<=200,000)이 주어집니다.
//
//
//	출력
//	첫 줄에 소수의 개수를 출력합니다.
	
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int num  = sc.nextInt();
		
		int[] list = new int[num+1];
		
		
		System.out.println(solution(list));
		
	}
	
	static int solution(int[] input) {

		int result = 0;
		
		for(int i=2;i<input.length;i++) {
			
			if(input[i]!=1) {
			for(int a=i*2;a<input.length;a+=i) {
				
					input[a]=1;
				
			}
			}
		}
		
		for(int i=2;i<input.length;i++) {
			if(input[i]==0) {
				result++;
			}
			
		}
		
		
		return result;
	}

}


