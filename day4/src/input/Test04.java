package input;

import java.util.Scanner;

public class Test04 {

	public static void main(String[] args) {
		
//		강의장 입실시각과 퇴실시각을 입력받아
//		수업에 참여한 시간을 계산하여 출력
//
//		```
//		입실시각 입력 : 0925
//		퇴실시각 입력 : 1830
//		수업에 참여한 시간은 9시간 5분 입니다
		
		Scanner sc=new Scanner(System.in); 
		
		System.out.println("입실시간을 입력하세요.");
		int inTime= sc.nextInt();
		
		System.out.println("퇴실시간을 입력하세요.");
		int outTime= sc.nextInt();
		
		int time=outTime-inTime;
		
		int hour=time/100; ///소수점을 붙여서 int로 출력됐을 때 소수점 앞의 숫자만 나오는 걸 이용하는 줄 알았는데 나눗셈 성질을 활용하는 거였음
		
		int minute=time%100;
		
		System.out.println("수업에 참여한 시간은 "+hour+"시간 "+minute+"분입니다");
		
		sc.close();
		
	}

}
