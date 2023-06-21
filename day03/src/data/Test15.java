package data;

public class Test15 {

	public static void main(String[] args) {
//		KH 여행사에서는 다음과 같이 프로모션을 진행중입니다.
//
//		```
//		국내 어디든 한 사람당 1박에 10만원!  
//		추가로 25% 할인까지 챙겨가세요!
//		```
//
//		성인 3명이 7일동안 여행갈 때 예상 경비를 출력하세요
		
		int adult=3;
		int day=7;
		int price=100000;
		
		int totalPrice=day*price;
		int threeTotalPrice=totalPrice*adult;
		int rate=25;
		
		int discount=threeTotalPrice*rate/100;
		int pay=threeTotalPrice-discount;
		
		System.out.println(threeTotalPrice);
		System.out.println(discount);
		System.out.println(pay);
	}

}
