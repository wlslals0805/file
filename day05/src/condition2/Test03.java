package condition2;

import java.util.Scanner;

public class Test03 {

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
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("나이를 입력하세요");
		
		int age=sc.nextInt();
		
		sc.close();
		
		if(age>=65) {
			System.out.println("어르신입니다.");
			System.out.println("지하철 요금은 무료입니다.");
		}
		else if(age<65&&age>=20) {
			System.out.println("성인입니다.");
			System.out.println("지하철 요금은 1250원입니다.");
		}
		else if(age>=14&&20>age){
			System.out.println("청소년입니다.");
			System.out.println("지하철 요금은 720원입니다.");
		}
		else if(age>=8&&age<14) {
			System.out.println("어린이입니다.");
			System.out.println("지하철 요금은 450원입니다.");
		}
		else if(age<8){
			System.out.println("영유아입니다.");
			System.out.println("지하철 요금은 0원입니다.");
		}
		
		
	}

}
