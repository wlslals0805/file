package data;

public class Test15_1 {

	public static void main(String[] args) {
//		KH 여행사에서는 다음과 같이 프로모션을 진행중입니다.
//
//		```
//		국내 어디든 한 사람당 1박에 10만원!  
//		추가로 25% 할인까지 챙겨가세요!
//		```
//
//		성인 3명이 7일동안 여행갈 때 예상 경비를 출력하세요
		
		//입력
		int people=3;
		int days=7;
		int dayPrice=100000;
		int rate=25;
		
		//계산
		int price = people *days*dayPrice;
		
		int discount = price *rate/100;
		
		int result = price - discount;
		
		
		//출력
		System.out.println(price);
		System.out.println(discount);
		System.out.println(result);
		
///할인 가격 계산 실습. 전체 가격 구해서 할인률 계산해주기
	}

}
