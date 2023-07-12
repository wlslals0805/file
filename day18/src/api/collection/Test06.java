package api.collection;

import java.util.ArrayList;
import java.util.Scanner;

public class Test06 {

	public static void main(String[] args) {
//		끝말잇기 게임 만들기
//
//		제시어는 자바로 정한 뒤 사용자에게 2~6글자의 한글 단어를 입력받아 끝말잇기 게임을 진행하세요
//
//		입력한 모든 단어는 기록해두어야 하며 만약 다음 조건에 해당되면 게임오버 처리 및 여태까지 입력했던 단어들을 순차적으로 출력
//
//		제시어와 이어지지 않는 단어 입력
//		한글 2~6글자가 아닌 단어 입력
//		띄어쓰기 허용하지 않음
		
		ArrayList<String>list = new ArrayList<>();
		Scanner sc=new Scanner(System.in);

		list.add("자바");
		
//		System.out.println(r);
//		System.out.println(list.get(r));
//		System.out.println(list.get(r).length());
//		System.out.println(list.get(r).charAt(list.get(r).length()-1));
		while(true) {
			
		String input=sc.next();
		int r= list.size()-1;
			
			if(input.charAt(0)!=list.get(r).charAt(list.get(r).length()-1)) {
					System.out.println("제시어와 이어지지 않는 단어");
					System.out.println(list);
					break;
				}
				
			if(!input.matches("^[가-힣]{2,6}$")) {
				System.out.println("글자 조건 미충족");
				System.out.println(list);
				break;
			}
				
//			if(input.contains(" ")) {
//				System.out.println("띄어쓰기 불가");
//				System.out.println(list);
//				break;
			
			else {
				list.add(input);
			}
			
			}
			
		}
		}
		

		
		
