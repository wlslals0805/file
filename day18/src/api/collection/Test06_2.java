package api.collection;

import java.util.ArrayList;
import java.util.Scanner;

public class Test06_2 {

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
		
		ArrayList<String> word = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		
		String startWord = "자바";
		
		word.add(startWord);
		
		

		
	
		
		while(true) {
			
			int before = word.size()-1;
			
			int last = word.get(before).length()-1;
			
			System.out.println(word.get(before).charAt(last)+"로 시작하는 단어는?");
			
			
			
			
			System.out.print("단어 입력:");
			String input=sc.next();
			
			if(input.charAt(0)!=word.get(before).charAt(last)) {
				
				System.out.println("게임 오버!");
				System.out.println("제시어와 이어지지 않습니다.");
				System.out.println(word);
				break;
				
				
			}
			else if(!input.matches("^[가-힣]{2,6}$")) {
				
				System.out.println("게임 오버!");
				System.out.println("글자 조건 불충족");
				System.out.println(word);
				break;
			}
			else if(word.contains(input)) {
				System.out.println("게임 오버!");
				System.out.println("단어 중복");
				break;
			}
			
			else {word.add(input);}
			
			
			
			
			
		}
		
		
		
		
	}

}
