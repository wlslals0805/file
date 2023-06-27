package loop2;

import java.util.Scanner;

public class Test10 {

	public static void main(String[] args) {
		//사용자에게 이번주 월요일부터 금요일까지 공부한 시간을 입력받습니다.
		//입력된 정보를 토대로 다음을 계산하여 출력
		
		//1.총 공부한 시간
		//2.일 평균 공부한 시간
		
		//입력은 시간과 분을 따로 받으며, 출력도 시간과 분을 따로 합니다.
		
		Scanner sc=new Scanner(System.in);
		int totalHour=0;
		int totalMin=0;
		
		float hourA=0;
		float minA=0;

		
		for(int day=1;day<=5;day++) {
			
			System.out.print("공부한 시간을 입력하세요:");
			int hour=sc.nextInt();
			System.out.print("공부한 분을 입력하세요:");
			int minute=sc.nextInt();
			System.out.println();
			
			totalHour+=hour;
			totalMin+=minute;
			hourA=(float)totalHour/5;
			minA=(float)totalMin/5;
		}
		System.out.println("총 공부한 시간은 "+totalHour+"시간 "+totalMin+"분");
		System.out.println("일 평균 약 "+hourA+"시간 "+minA+"분"); //평균은 total로 구하는 게 좋다
		sc.close();
	}

	
}
