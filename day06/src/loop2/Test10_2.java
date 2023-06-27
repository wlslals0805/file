package loop2;

import java.util.Scanner;

public class Test10_2 {

	public static void main(String[] args) {
		//문제에서 원하는 항목 계산하여 출력
				Scanner sc = new Scanner(System.in);

				int total = 0;

				System.out.print("일 수 입력 : ");
				int day = sc.nextInt();

				for(int i=0; i < day; i++) {
					System.out.print("공부한 시간/분 : ");
					int hour = sc.nextInt();
					int minute = sc.nextInt();

					int time = hour * 60 + minute;
					total += time;
				}

				sc.close();

				int hour = total / 60;
				int minute = total % 60;

				System.out.println("총 공부한 시간은 "+hour+"시간 "+minute+"분 입니다");

				int average = total / day;

				int averageHour = average / 60;
				int averageMinute = average % 60;

				System.out.println("평균 공부한 시간은 약 "+averageHour+"시간 "+averageMinute+"분 입니다");

	}

}
