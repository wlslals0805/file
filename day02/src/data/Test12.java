package data;

public class Test12 {

	public static void main(String[] args) {

		int price =1400;
		int a=5;
		int totalPrice=price*a; //전체 가격
		int freeCount=a/2; //무료 처리되는 개수
		int d=freeCount*1400; //무료 처리되는 삼각김밥의 가격
		int finalPrice=totalPrice-d;
		
//		System.out.println(totalPrice);
		System.out.println(freeCount);	
//		System.out.println(d);	
		System.out.println(finalPrice);
		
		
	}

}
