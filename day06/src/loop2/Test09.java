package loop2;

import java.util.Scanner;

public class Test09 {

	public static void main(String[] args) {
		//사용자에게 숫자를 10개 입력받아서 다음을 계산
		
//		1. 홀수의 개수
//		2.짝수의 개수
//		3.전체 합계
//		4.전체 평균
		
		Scanner sc=new Scanner(System.in);
		int count=0;
		int count2=0;
		int total=0;
		double a=0;
		for(int i=1;i<=10;i++) {
			System.out.println("숫자를 입력하세요");
			int number=sc.nextInt();
			
			if(number%2!=0) {
				count++;
				
			}
			else {count2++;
		}

		total+=number;
		a=total/10.0;
	}
		System.out.println("홀수의 개수는 "+count+ "개");
		System.out.println("짝수의 개수는 "+count2+"개");
		System.out.println("전체 합계는 "+total);
		System.out.println("전체 평균은 "+a);
	}
}
