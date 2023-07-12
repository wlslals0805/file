package api.util.scanner;

import java.util.Scanner;

public class Test01_3 {

	public static void main(String[] args) {
		//Scanner 클래스
		//=문자열 입력 및 분석 클래스
		//=키보드 입력은 기능 중 일부분일 뿐
		//=파일 뿐 아니라 홈페이지도 읽어올 수 있다(웹 크롤링)
		
		String sample="떴다떴다 비행기\n날아라 날아라\n떴다떴다 비행기\n우리 비행기";
//		System.out.println(sample);

//		[1]단어 별로 읽기		.next()			띄어쓰기나 개행 등 공백이 기준
		//							.hasNext()		읽을 수 있는 단어가 있는지 기준
//		[2]줄 별로 읽기		.nextLine()		개행 문자 기준
		
		
		Scanner sc=new Scanner(sample);
		
		while(sc.hasNext()) {
			System.out.println(sc.next());
			
		}
		

		
		
		sc.close();
	}

}
