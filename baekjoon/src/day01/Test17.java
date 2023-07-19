package day01;

import java.util.Scanner;

public class Test17 {

	public static void main(String[] args) {
//		1에서부터 6까지의 눈을 가진 3개의 주사위를 던져서 다음과 같은 규칙에 따라 상금을 받는 게임이 있다. 
//
//		같은 눈이 3개가 나오면 10,000원+(같은 눈)×1,000원의 상금을 받게 된다. 
//		같은 눈이 2개만 나오는 경우에는 1,000원+(같은 눈)×100원의 상금을 받게 된다. 
//		모두 다른 눈이 나오는 경우에는 (그 중 가장 큰 눈)×100원의 상금을 받게 된다.  
//		예를 들어, 3개의 눈 3, 3, 6이 주어지면 상금은 1,000+3×100으로 계산되어 1,300원을 받게 된다. 
//		또 3개의 눈이 2, 2, 2로 주어지면 10,000+2×1,000 으로 계산되어 12,000원을 받게 된다. 
//		3개의 눈이 6, 2, 5로 주어지면 그중 가장 큰 값이 6이므로 6×100으로 계산되어 600원을 상금으로 받게 된다.
//
//		3개 주사위의 나온 눈이 주어질 때, 상금을 계산하는 프로그램을 작성 하시오.
//
//		입력
//		첫째 줄에 3개의 눈이 빈칸을 사이에 두고 각각 주어진다. 
		
//		출력
//		첫째 줄에 게임의 상금을 출력 한다.
		
		Scanner sc = new Scanner(System.in);
		
		int a1 = sc.nextInt();
		int a2 = sc.nextInt();
		int a3 = sc.nextInt();
		
		boolean three=a1==a2&&a2==a3;
		int money;
		
		boolean two1 = a1==a2;
		boolean two2 = a2==a3;
		boolean two3 = a3==a1;
				
		
		if(three) {
			
		money=	10000+a1*1000;
		}
		else if(two1) {
			money = 1000+a1*100;
		}
		else if(two2) {
			money = 1000+a2*100;
		}
		else if(two3) {
			money = 1000+a3*100;
		}
		else {
			int big = a2;
			if(a1>a2) {
				big= a1;
				if(a3>a1) {
					big=a3;
				}}
				else if(a1<a2) {
					if(a3>a2) {
						big=a3;
					}
			}
			money = big * 100;
		}
	
		
		
		System.out.println(money);
		
		
		
		
		
		
		
		
	}

}
