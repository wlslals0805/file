package condition2;

import java.util.Scanner;

public class Test03_1_1 {

	public static void main(String[] args) {
		
//		지하철 이용요금은 다음과 같습니다
//
//		| 구분 | 기준 | 요금 |
//		| --- | --- | --- |
//		| 어르신 | 65세 이상 | 무료 |
//		| 성인 | 20세 이상 65세 미만 | 1250원 |
//		| 청소년 | 14세 이상 20세 미만 | 720원 |
//		| 어린이 | 8세 이상 14세 미만 | 450원 |
//		| 영유아 | 8세 미만 | 0원 |
//
//		사용자에게 나이를 입력받아 지하철 요금을 출력하세요
		//카드 보증금 500원 추가
	
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("나이를 입력하세요");
		int age = sc.nextInt();
		int card=500;
		int price; 
		
		
		if(65<=age||age<8) {
			price=0;
		}
		else if(age>=20){
			price=card+1250;
			
		}
		else if(age>=14) {
			price=card+720;
		}
		else {
			price=card+450;
		}
		
		System.out.println(price);
	}

}
