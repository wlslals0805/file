package condition2;

import java.util.Scanner;

public class Test04 {

	public static void main(String[] args) {
//		여행사 프로모션 3
//
//		KH여행사에서 세 번째 프로모션을 진행합니다.
//		무조건 1인당 1박 10만원을 유지한 채 계절별로 다음과 같이 할인하도록 할 예정입니다.
//
//		계절	월	할인율
//		봄	3, 4, 5	20%
//		여름	6, 7, 8	10%
//		가을	9, 10, 11	30%
//		겨울	12, 1, 2	5%
//		사용자에게 필요한 정보를 입력받아 예상 경비를 구하여 출력
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("달을 입력하세요.");
		int month=sc.nextInt();
		
		System.out.println("인원수를 입력하세요");
		int personCount=sc.nextInt();
		
		System.out.println("몇 박인지 입력하세요");
		int day=sc.nextInt();
		
		int price=100000;
		int totalPrice=personCount*day*price;
		int rate;
//		int result=totalPrice-(totalPrice*rate/100);
		
		
		
		if(month==3||month==4||month==5) {
			
			rate=20;
			int result=totalPrice-(totalPrice*rate/100);
			System.out.println(result);
			
			
		}
		
		else if(month==6||month==7||month==8) 
		{
			rate=10;
//			System.out.println(totalPrice-(totalPrice*rate/100);
			int result=totalPrice-(totalPrice*rate/100);
			System.out.println(result);
	}
		
		
		else if(month==9||month==10||month==11) {
			rate=30;
//			System.out.println(totalPrice-(totalPrice*rate/100);
			int result=totalPrice-(totalPrice*rate/100);
			System.out.println(result);
			
		}
		
		else if(month==12||month==1||month==2) {
			
			rate=5;
//			System.out.println(totalPrice-(totalPrice*rate/100);
			int result=totalPrice-(totalPrice*rate/100);
			System.out.println(result);
			
			
		}
		
//		System.out.println(result);
		
		

}
}
