package loop3;

import java.util.Scanner;

public class Test05_2 {

	public static void main(String[] args) {
int number = 100;
		
		Scanner sc = new Scanner(System.in);
		
		int count = 0;
		
		while(true) {
			System.out.print("1~9 입력 : ");
			int input = sc.nextInt();
			
			//[방법2] 원치 않는 상황이면 SKIP 하도록 처리
			//if(input < 1 || input > 9) {//1미만 또는 9초과인 경우
			if( !(input >= 1 && input <= 9) ) {//1이상 9이하가 아니면
				System.out.println("1~9만 입력가능해요");
				continue;//처음으로 이동
			}
			
			count++;
			
			number -= input;//차감 처리
			System.out.println("남은 숫자 : " + number);
			
			if(number <= 0) {//남은 숫자가 0 이하라면 반복을 중지(게임오버)
				break;
			}
		}
		
		sc.close();
		
		System.out.println("게임 오버!");
		System.out.println("총 입력 횟수는 "+count+"번 입니다");
	}

}
