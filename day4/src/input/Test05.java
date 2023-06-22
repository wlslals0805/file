package input;

import java.util.Scanner;

public class Test05 {

	public static void main(String[] args) {
//		KH분식점의 메뉴판은 다음과 같습니다.
//
//		이름	가격
//		떡볶이	3000원
//		튀김	500원
//		순대	2000원
//		사용자에게 떡볶이, 튀김, 순대 개수를 입력받아 결재금액을 출력
//		(단, 현재 행사중이라서 10% 할인된 가격으로 판매합니다)
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("떡볶이 개수를 입력하세요");
		int menu1Count=sc.nextInt();
		int menu1Price=3000;
		int a=menu1Count*menu1Price;
		
		System.out.println("튀김 개수를 입력하세요");
		int menu2Count=sc.nextInt();
		int menu2Price=500;
		int b=menu2Count*menu2Price;
				
		System.out.println("순대 개수를 입력하세요");
		int menu3Count=sc.nextInt();
		int menu3Price=2000;
		int c = menu3Count*menu3Price;
		
//		int totalCount = menu1Count+menu2Count+menu3Count;
		int totalPrice=a+b+c;
		int finalPrice=totalPrice-(totalPrice*10/100);
		
//		System.out.println(totalPrice);
		System.out.println(finalPrice);
		
		sc.close();
		
		
	}

}
