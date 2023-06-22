package condition;

import java.util.Scanner;

public class Test04 {

	public static void main(String[] args) {
//		KH 여행사에서 두 번째 프로모션을 다음과 같이 진행하려고 합니다
//
//		- 여름 매출이 저조하여 여름에 여행갈 경우(6,7,8월) 비용에서 25%를 할인합니다
//		- 여름이 아닌 다른 계절은 할인 행사를 진행하지 않습니다
//
//		이전과 동일하게 `국내 어디든 1인 1박에 10만원`이라는 슬로건을 유지할 때
//		사용자에게 필요한 정보를 입력받아 예상 경비를 출력하도록 구현하세요
		

		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("인원 수를 입력하세요");
		int peopleC=sc.nextInt();
		
		System.out.println("몇박인지 입력하세요");
		int day=sc.nextInt();
		
		System.out.println("달을 입력하세요");
		int month=sc.nextInt();
		
		int price=100000;
		int rate=25;
		
		int pay=price*day*peopleC;
		
//		int discount=pay*rate/100;
		
		int discount;
		
		if(month==6||month==7||month==8) {
//			System.out.println ("여행 비용은 "+(pay-discount)+"원이 나옵니다.");
		discount=pay*rate/100;
		}
		else {
//			System.out.println("여행 비용은 "+pay+"원이 나옵니다.");
			discount=0;
			
		}
		
		int finalPrice=pay-discount;
		
		System.out.println("여행 비용은 "+finalPrice+"원이 나옵니다.");
		
		sc.close();

	}

}
