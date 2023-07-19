package day01;

import java.util.Scanner;

public class Test21 {

	public static void main(String[] args) {
		

//		영수증에 적힌 구매한 각 물건의 가격과 개수,구매한 물건들의 총 금액
//		을 보고, 구매한 물건의 가격과 개수로 계산한 총 금액이 영수증에 적힌 총 금액과 일치하는지 검사해보자.
//
//		입력
//		첫째 줄에는 영수증에 적힌 총 금액 X가 주어진다. 둘째 줄에는 영수증에 적힌 구매한 물건의 종류의 수 N이 주어진다.
//
//		이후 
//		N개의 줄에는 각 물건의 가격 a와 개수 b가 공백을 사이에 두고 주어진다.
//
//		출력
//		구매한 물건의 가격과 개수로 계산한 총 금액이 영수증에 적힌 총 금액과 일치하면 Yes를 출력한다. 일치하지 않는다면 No를 출력한다.
		
		Scanner sc = new Scanner(System.in);
		
		long x= sc.nextLong();	//총금액
		int n = sc.nextInt();	//구매한 물건의 종류 수
		
		long price = 0L;

		for(int i = 1;i<=n;i++) {
			int a =sc.nextInt();
			int b = sc.nextInt();
			
				price+=	a*b;
			
		}
		
		
		
		if(x==price) {
			System.out.println("Yes");}
		else {System.out.println("No");}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
