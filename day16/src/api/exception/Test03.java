package api.exception;

import java.awt.image.AreaAveragingScaleFilter;
import java.util.Scanner;
public class Test03 {

	public static void main(String[] args) {
		
//		사용자에게 생년월일을 YYYY-MM-DD 형태로 입력받아서
//
//		연도, 월, 일을 각각 분리한 뒤 숫자로 변환해서 출력
//
//		생년월일 입력 : 2023-07-10
//
//		출생년도 : 2023년
//		출생월 : 7월
//		출생일 : 10일
//		문제가 발생하는 상황을 try~catch 구문을 이용해서 처리한 뒤 메세지 작성
		
		Scanner sc= new Scanner(System.in);
		StringBuilder buffer = new StringBuilder();
		System.out.println("생년월일을 입력하세요");
		
		String a= sc.next();
		
		for(int i=0;i<a.length()-6;i++) {
			
			buffer.append(a.charAt(i));
			
//			System.out.print(a.charAt(i));
	}
	for(int i=5;i<7;i++) {
			
			buffer.append(a.charAt(i));
			
//			System.out.print(a.charAt(i));
	}
	for(int i=8;i<a.length();i++) {
		
		buffer.append(a.charAt(i));
		
//		System.out.print(a.charAt(i));
}
		
		Integer n=Integer.valueOf(buffer.toString());
		System.out.println(n);
		
//		Integer n1=Integer.valueOf();
//		System.out.println(n1);
		
//		1998-08-05
		
		
		
		
}
	
}
