package loop3;

import java.util.Scanner;

public class Test03 {

	public static void main(String[] args) {
//		while 반복
//
//		# Test03
//
//		사용자에게 숫자를 입력받아 합계와 평균을 구하여 출력하는 프로그램 구현  
//		(단, 사용자가 0을 입력할 경우 프로그램을 종료합니다)
		
		Scanner sc=new Scanner(System.in);
		
		int total=0;
		double a;
		
		int count=0;
		while(true) {
		
			int number=sc.nextInt();
			count++;
			if(number==0) {
				break;
				
			}
			total+=number;
			
			
		}
		a=(double)total/(count-1);
		
		System.out.println("합계는:"+total);
		System.out.println("평균은:"+a);
		
	}

}
