package day01;

import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

public class Test53_1 {

	public static void main(String[] args) {
		
		
//		알파벳 대소문자로 된 단어가 주어지면, 
//		이 단어에서 가장 많이 사용된 알파벳이 무엇인지 알아내는 프로그램을 작성하시오. 단, 대문자와 소문자를 구분하지 않는다.
//
//		입력
//		첫째 줄에 알파벳 대소문자로 이루어진 단어가 주어진다. 
//		주어지는 단어의 길이는 1,000,000을 넘지 않는다.
//
//		출력
//		첫째 줄에 이 단어에서 가장 많이 사용된 알파벳을 대문자로 출력한다. 
//		단, 가장 많이 사용된 알파벳이 여러 개 존재하는 경우에는 ?를 출력한다.
		
		
		
		Map<String,Integer> map = new TreeMap<>();
		
		
		Scanner sc = new Scanner(System.in);
		
		String input = sc.next();
		
		input = input.toUpperCase();
		
		
		
		for(int i = 0;i<input.length();i++) {
			String now = String.valueOf(input.charAt(i));
			if(map.containsKey(now)) {
				int now2 = map.get(now) +1;
				map.put(now, now2);
			}
			else {
				map.put(now, 1);
			}
			
		}
		

		
		
//		int bigValue=0;
//		String big = String.valueOf(input.charAt(0));
//		for(int i = 0;i<map.size();i++) {
//			
//			if(map.get(big)<map.get(String.valueOf(input.charAt(i)))) {
//				big =String.valueOf(input.charAt(i));
//			}
//			
//		}
//		bigValue = map.get(big);
//			map.remove(big);
		

		
		String result ="";
		Set<String> alp  = map.keySet();

		int maxCount = 0;
		
		for(String alp2:alp) {
			int count = map.get(alp2);
			
			if(count>maxCount) {
				
				maxCount = count;
				result = alp2;
				}
			else if(count == maxCount) {
				
				result ="?";
				
			}
		
		}
			
			
			
		
		
		System.out.println(result);
		
		
		
	}

}
