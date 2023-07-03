package loop2;

import java.util.Scanner;

public class Self {

	public static void main(String[] args) {
//		타이머 구현
//
//		사용자에게 분과 초를 입력받아 해당 시간만큼 메세지 출력하는 타이머 구현
//
//		분 입력 : 2
//		초 입력 : 30
//
//		2분 30초 후 알람이 울립니다!
//		2분 29초 후 알람이 울립니다!
//		...(생략)...
//		0분 2초 후 알람이 울립니다!
//		0분 1초 후 알람이 울립니다!
//		0분 0초 후 알람이 울립니다!
//		알람 시작!
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("분을 입력하세요.");		
		int minute=sc.nextInt();
		
		System.out.println("초를 입력하세요");
		int second=sc.nextInt();
		
		int time=minute*60+second;
		
		
		for(int i=time;i>=0;i--) {
			
			int minute1=i/60;
			int second1=i%60;
			
		System.out.println(minute1+"분"+second1+"초 후에 알람이 울립니다");
			
		}
		
		
	}

}
