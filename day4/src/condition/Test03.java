package condition;

import java.util.Scanner;

public class Test03 {
	
	public static void main(String[] args) {
		
//		KH국밥집에서는 65세 이상 어르신들만 
//		30% 할인된 가격에 국밥을 판매합니다.
//
//		국밥 한 그릇에 7500원일 때, 
//		출생년도 4자리와 그릇 수를 입력받아
//		상황에 맞는 결제 금액을 계산하여 출력하세요
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("출생년도를 입력하세요");
		
		int birth=sc.nextInt();
		
		System.out.println("그릇 수를 입력하세요");
		
		int count=sc.nextInt();
		
		int presentYear=2023;
		int age=presentYear-birth+1;
		int rate=30;
		int price=7500;
		int totalPrice=price*count;
		int ratePrice=totalPrice-(totalPrice*rate/100);
		
		if(age>=65) { System.out.println(ratePrice+"원 입니다");
			
		}
		else {
		System.out.println(totalPrice);	
		}
		
		sc.close();
		
		}
	}
	
	

