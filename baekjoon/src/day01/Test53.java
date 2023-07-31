package day01;

import java.util.ArrayList;
import java.util.Scanner;

public class Test53 {

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
		
		
		Scanner sc = new Scanner(System.in);
		
		String a = sc.next();
		
		sc.close();
		
		ArrayList<String> list =new ArrayList<>();
		ArrayList<String> list2 =new ArrayList<>();
		ArrayList<String> list3 =new ArrayList<>();

		for(int i = 0; i<a.length();i++) {
		
		list.add(String.valueOf(a.charAt(i)));
	
		}
		
		int count = 0;
		
		for(int i = 0 ; i<a.length();i++) {
			for(int q = 0; q<a.length();q++) {
				
				if(list.get(i).equals(list.get(q))) {
					
					count++;
				
				}

			}
			list2.add(String.valueOf(count));
			count = 0;

}
		

		int[] number = new int[list.size()];
		
		
		for(int i = 0;i<list2.size();i++) {
			number[i] = Integer.parseInt(list2.get(i));
		}

		for(int i = 0;i<list2.size();i++) {
		}
		
		int big = number[0];
		
		
		for(int i = 0;i<list2.size();i++) {
			
			if(big<number[i]) {
				big = number[i];
			}
			
		}
		

		 int g = list2.indexOf(String.valueOf(big));
	
		
		 String fre = list.get(g);
		
		 for(int i = 0;i<big;i++) {
		 list.remove(fre);}
		 
		 int count2 = 0;
			
			for(int i = 0 ; i<list.size();i++) {
				for(int q = 0; q<list.size();q++) {
					
					if(list.get(i).equals(list.get(q))) {
						
						count2++;
					
					}

				}
				list3.add(String.valueOf(count2));
				count2 = 0;

	}
			

			int[] number2 = new int[list.size()];
			
			
			for(int i = 0;i<list3.size();i++) {
				number2[i] = Integer.parseInt(list3.get(i));
			}

			for(int i = 0;i<list3.size();i++) {
			}
			
			int big2 = number2[0];
			
			
			for(int i = 0;i<list3.size();i++) {
				
				if(big2<number2[i]) {
					big2 = number2[i];
				}
				
			}
		 
		 if(big==big2) {
			 System.out.println("?");
		 }
		 else {
			 System.out.println(fre);
		 }
		 
		 
	
			
			
		}
		 
		 
	}

	

