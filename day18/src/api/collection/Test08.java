package api.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Test08 {

	public static void main(String[] args) {
//		네이버 사다리 게임 만들기
//
//		네이버에서 사다리게임을 검색해서 나오는 게임을 만드세요
//		사다리 타기 관련 그래픽을 제외하고 다음을 만드시면 됩니다.
//
//		인원수 선택
//		이름 및 항목 입력
//		당첨 결과 출력
		
		Scanner sc=new Scanner(System.in);
		ArrayList<String> name = new ArrayList<>();
		ArrayList<String> item = new ArrayList<>();
		
		System.out.println("인원수를 입력하세요");
		int count = sc.nextInt();
		
		for(int i=0;i<count;i++) {
			System.out.println("이름을 입력하세요");
		
		String inputName=sc.next();
		
		name.add(inputName);
		
		}
		
		for(int i=0;i<count;i++) {
			System.out.println("항목을 입력하세요");
			
		String inputItem=sc.next();
		
		item.add(inputItem);}
		
		Collections.shuffle(item);
		
		for(int i=0;i<count;i++) {
			
			System.out.println(name.get(i)+"="+item.get(i));
			
		}
		
		
		
		
	}

}
