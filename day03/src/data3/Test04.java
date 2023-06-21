package data3;

public class Test04 {
	public static void main(String[] args) {
		//청소년 판정 프로그램
		//=14~19사이
		//=14세 이상 19세 이하
		
		int age=15; 
		
//		boolean teen= 14<=age<=19; //안됨 ///14<=15==true<=19(x) 이상함. 따로 나눠서 비교연산자 계산하기
		boolean teen=14<=age&&age<=19;
		
//		boolean free=8세 미만 또는 65세 이상;
		boolean free=age<8||65<=age;
		
		//논리연산-논리끼리 계산하기 위한 기호
		//|| (or연산)-왼쪽과 오른쪽이 모두 거짓인 경우 거짓
		//&&(and연산)-왼쪽과 오른쪽이 모두 참인 경우 참(참참참)
		System.out.println(teen);
		System.out.println(free);
		
		
		
		
	}
}
