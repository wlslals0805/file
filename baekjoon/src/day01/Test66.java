package day01;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Test66 {
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
//		sc.nextLine();	//nextInt를 쓰고 남은 개행문자("\n")소비용.
		//(nextInt는 숫자를 적고 엔터를 쳤을 때 숫자만 쏙 빼먹고 엔터를 버퍼에 남겨둔다 따라서 그다음에 오는 nextLine이 nextInt가 안 쓰고 남긴 개행문자를 흡수해서 사용자가 입력을 받지도 않았는데 입력을 받은 걸로 처리한 후 다음으로 넘어간다) 
		
		List<String> result = new ArrayList<>();
		
		for(int i=0;i<n;i++) {                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                     
			
			System.out.println("i="+i);
			
			String str = sc.nextLine();
			System.out.println("입력="+str);
			
			StringBuilder sb = new StringBuilder();
			
			for(char x : str.toCharArray()) {
				
				sb.append(x);
				
			}
			
			result.add(sb.reverse().toString());
			
		}
		
//		for(String answer : result) {
//			
//			System.out.println(answer);
//			
//		}
	
		
	}
	
	

}
