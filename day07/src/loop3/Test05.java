package loop3;

import java.util.Scanner;

public class Test05 {

	public static void main(String[] args) {
		
		//숫자 모래성 땅따먹기

//		최초에 100이라는 값을 정해두고 
//		사용자에게 한 자리 숫자(1~9)를 입력받아 차감을 합니다.
//
//		차감을 하다가 0 이하가 되면 반복을 종료하고 게임 오버 메세지를 출력
//
//		몇 번만에 게임오버가 되었는지 측정하여 출력
//		원하는 상황일 때만 코드를 실행하도록 구현
		
		Scanner sc=new Scanner(System.in);
		int a=100;
		int count=0;
		
		while(true) {
			System.out.println("1~9까지의 숫자 아무거나 입력:");
		int number=sc.nextInt();
		
		if(number<=9&&number>=1) {
		a=a-number;
		count++;
		
		System.out.println("남은 숫자="+a);
		
		
		if(a<=0) {
			System.out.println("종료");
			break;
		}
	}
		else {System.out.println("1~9 사이의 숫자만 입력하세요");}
		}
	
		sc.close();
		System.out.println("입력한 횟수는 "+count+"번");
	}
}
