package api.util.scanner;

import java.util.Scanner;

public class Test03 {

	public static void main(String[] args) {
		// Scanner와 정규표현식을 결합하여 패턴을 분석
		
		String color = "빨강 주황 노랑 초록 파랑 남색 보라";
		String color2 = "빨강/주황+노랑=초록-파랑%남색*보라";
		
		Scanner sc=new Scanner(color2);	
		
	//sc에 '+'를 구분자()
		sc.useDelimiter("[\\/\\+\\=\\-\\%\\*]");
		
		System.out.println(sc.next());
		System.out.println(sc.next());
		System.out.println(sc.next());
		System.out.println(sc.next());
		System.out.println(sc.next());
		System.out.println(sc.next());
		System.out.println(sc.next());
		
	}

}
