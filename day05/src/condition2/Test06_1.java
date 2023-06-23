package condition2;

import java.util.Scanner;

public class Test6_1 {

	public static void main(String[] args) {
//		BMI 계산기 개조
//
//		사용자에게 신장과 체중을 입력받아 BMI 수치를 계산하고 다음 기준에 따라 비만도 판정까지 수행하도록 구현하세요
//		(BMI 계산 공식은 이전 문제를 참조하세요)
//
//		범위	판정
//		18.5 미만	저체중
//		18.5 이상 23 미만	정상
//		23 이상 25 미만	과체중
//		25 이상 30 미만	경도비만
//		30 이상	중등도비만
		
//						체중(kg)
//		계산공식 = ───────────────────
//		               키²(m²)
		
		Scanner sc = new Scanner(System.in);
		
	
		
		System.out.println("키를 입력하세요");
		int cm=sc.nextInt();
		
		System.out.println("몸무게를 입력하세요");
		int kg=sc.nextInt();
		
		double m=cm*0.01;
		double bmi=kg/(m*m);
		
		System.out.println("당신의 bmi는 "+bmi);
	
		String result;
		
		if(bmi<18.5) {
//			System.out.println("저체중");
			result="저체중";
		
		
	}
		else if(bmi<23) {
//			System.out.println("정상");
			result="정상";
			
		}
	
		
		else if(bmi<25) {
//			System.out.println("과체중");
			result="과체중";
			
		}
		
		
		else if(bmi<30) {
//			System.out.println("경도비만");
			result="경도비만";
			
		}
		else if(30<=bmi) {
//			System.out.println("중등도비만");
			result="중등도비만";
			
		}
		else {
			result="";
		}
		System.out.println(result);
				
				sc.close();
				
		
		
		
	}
}
