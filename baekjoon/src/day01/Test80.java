package day01;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Test80 {
//	N개의 자연수가 입력되면 각 자연수를 뒤집은 후 그 뒤집은 수가 소수이면 그 소수를 출력하는 프로그램을 작성하세요.
//
//	예를 들어 32를 뒤집으면 23이고, 23은 소수이다. 그러면 23을 출력한다. 단 910를 뒤집으면 19로 숫자화 해야 한다.
//
//	첫 자리부터의 연속된 0은 무시한다.
//
//
//	입력
//	첫 줄에 자연수의 개수 N(3<=N<=100)이 주어지고, 그 다음 줄에 N개의 자연수가 주어진다.
//
//	각 자연수의 크기는 100,000를 넘지 않는다.
//
//
//	출력
//	첫 줄에 뒤집은 소수를 출력합니다. 출력순서는 입력된 순서대로 출력합니다.
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		
		int[] list = new int[num];
		
		for(int i=0;i<num;i++) {
			
			list[i] = sc.nextInt();
			
		}
		
		String result = "";
		for(Object x : solution(list)) {
			
			if(Integer.parseInt(String.valueOf(x))>1) {

				result+=x+" ";
			
			}
			}
		
		System.out.println(result);
		
	}
	
	static List<Integer> solution(int[] input) {

		List<Integer> result = new ArrayList<>();
		
		for(int a=0;a<input.length;a++) {
			
			boolean answer = true;
			
			StringBuilder sb = new StringBuilder(String.valueOf(input[a]));
			//StringBuilder의 객체로 int는 불가능. 따라서 int를 String으로 바꿔주었음. 
			
			sb.reverse();
			
			int num = Integer.parseInt(String.valueOf(sb));
			
			
			for(int i=2;i<=Math.sqrt(num);i++) {//2나 3처럼 i가 ++될 기회조차 없는 수들은 반복문이 시작되지도 못한다. 따라서 answer은 true인 채로 지나간다
				System.out.println("num="+num+" i="+i);
				if(num%i==0) {
					answer = false;
				}
				
			}
			
			if(answer) {
				result.add(Integer.parseInt(String.valueOf(sb)));
				
			}
			
		}
		return result;
	}
}
