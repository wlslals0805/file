package loop3;

import java.util.Random;

public class Test05_3 {

	public static void main(String[] args) {
//		모바일 게임에서 이벤트 패키지를 1500원에 판매합니다.  
//		이벤트 패키지에서는 1~9개의 쿠폰이 나오며 이 쿠폰을 이용하여 
//		각종 아이템을 구매할 수 있습니다.
//
//		게임사에서 공개한 쿠폰 획득 확률은 다음과 같습니다.  
//		| 개수 | 확률 |
//		| 1개 | 7.69% |
//		| 2개 | 9.62% |
//		| 3개 | 11.54% |
//		| 4개 | 13.46% |
//		| 5개 | 15.38% |
//		| 6개 | 13.46% |
//		| 7개 | 11.54% |
//		| 8개 | 9.62% |
//		| 9개 | 7.69% |
//
//		최고급 보상이 쿠폰 `999`개에 판매되고 있을 때
//		최고급 보상을 획득하기 위해 결제해야 할 금액을 시뮬레이션으로 구하시오.
		
		Random r=new Random();
		int count=0;
		int a;
		int total1=0;
		int total=0;
		while(true) {
			int c=r.nextInt(100)+1;
			
			if(c<=7&&c>=1) {
				a=1;
				total+=a;}
			else if(c<=17&&c>=8) {
				a=2;
				total+=a;}
			else if(c<=28&&17>=1) {
				a=3;
				total+=a;}
			else if(c<=30&&c>=17) {
				a=4;
				total+=a;}
			else if(c<=45&&c>=30) {
				a=5;
				total+=a;}
			else if(c<=58&&c>=45) {
				a=6;
				total+=a;}
			else if(c<=69&&c>=58) {
				a=7;
				total+=a;}
			else if(c<=78&&c>=69) {
				a=8;
				total+=a;}
			else if(c<=30&&c>=78) {
				a=9;
				total+=a;}
			else if(c<=85&&c>=78) {
				a=10;
				total+=a;}
			
		
			count++;

			if(total>=999) {
				break;
			}
//			System.out.println("뽑은 쿠폰 개수:"+a);
			System.out.println("이제까지의 합:"+total);
			System.out.println();
		}
System.out.println(count*1500);
	}

}
