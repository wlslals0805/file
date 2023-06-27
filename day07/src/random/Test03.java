package random;

import java.util.Random;

public class Test03 {

	public static void main(String[] args) {
//		윷놀이 게임
//
//		윷놀이는 빽도/도/개/걸/윷/모 중 하나가 랜덤으로 나옵니다.
//
//		랜덤을 이용하여 윷놀이 1턴의 결과를 출력하도록 구현하세요.
//		실제 윷놀이는 개가 가장 많이 나옵니다. 이것을 고려하여 코드를 변경하세요.

		//경우의 수=발생할 수 있는 모든 상황
		//윷이 1개만 있다면 경우의 수는 2가지=안 뒤집히거나(0) 뒤집히거나(1)
		
		//윷이 2개라면 경우의 수는 4가지=00/01/10/11
		
		//윷이 3개라면 경우의 수는 8가지 = 000/ 001/ 010/ 100 / 011/ 101/ 110/ 111 
		
		//윷이 4개라면 경우의 수는 16가지
		
		
		Random r=new Random();
		
		int a=r.nextInt(16);
		
		if(a==0) {System.out.println("빽도");}
		else if(a>=1&&a<=3) {System.out.println("도");}
		else if(a>=4&&a<=7) {System.out.println("걸");}
		else if(a==8) {System.out.println("윷");}
		else if(a==9) {System.out.println("모");}
		else {System.out.println("개");}
	
		
	
	}
	

}
