package day01;

import java.util.ArrayList;
import java.util.Scanner;

public class Test66ver2 {
//	설명
//
//	N개의 단어가 주어지면 각 단어를 뒤집어 출력하는 프로그램을 작성하세요.
//
//
//	입력
//	첫 줄에 자연수 N(3<=N<=20)이 주어집니다.
//
//	두 번째 줄부터 N개의 단어가 각 줄에 하나씩 주어집니다. 단어는 영어 알파벳으로만 구성되어 있습니다.
//
//
//	출력
//	N개의 단어를 입력된 순서대로 한 줄에 하나씩 뒤집어서 출력합니다.
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		sc.nextLine();
		
		String[] inputList = new String[n];
		
		for(int i = 0;i<n;i++) {
			
			inputList[i] = sc.nextLine();
		}
		
		for(String x : solution(n,inputList)){
			
			System.out.println(x);
			
		}
		
		
		
	}
	
	static ArrayList<String> solution(int n, String[] inputList) {

		ArrayList<String> list = new ArrayList<>();
		
		for(int i = 0;i<n;i++) {
			
			String str = inputList[i];
			char[] c = str.toCharArray();
			
		
			int begin = 0;
			int end = c.length-1;
			
		while(begin<end) {
		
			char a = c[begin];
			c[begin] = c[end];
			c[end] = a;
			
			begin++;
			end--;
			
			System.out.println("begin"+begin);
			System.out.println("end"+end);
			
		
		}
		
		
		
		list.add(String.valueOf(c));
		
		}
		
		return list;
	}
	

}
