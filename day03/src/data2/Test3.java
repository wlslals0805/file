package data2;

public class Test3 {

	public static void main(String[] args) {

		
//		KH 주유소에서는 휘발유를 1L에 1530원에 팔고 있습니다.  
//
//		50000원 주유했을 때 주유되는 휘발유의 양을 출력하세요
		
		int L=1530;
		int price=50000;
		
		
		double oil=price/(double)L; ///십원단위로 계산했을 때 깔끔하게 나눠떨어지지 않기 때문에 소수 곱해주기
		
		
		System.out.println(oil);
		
	}

}
