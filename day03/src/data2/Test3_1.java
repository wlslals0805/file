package data2;

public class Test3_1 {

	public static void main(String[] args) {

		
//		KH 주유소에서는 휘발유를 1L에 1530원에 팔고 있습니다.  
//
//		50000원 주유했을 때 주유되는 휘발유의 양을 출력하세요
		
//		int L=1530;
//		int price=50000;
//		
//		
//		double oil=price/(double)L;
//		
//		
//		System.out.println(oil);
		
		//입력
		
		int unitPrice=1530;
		int money=50000;
		
		//계산
		double liter= money /(double)unitPrice;
		
		//출력
		System.out.println(liter);
		
	}

}
