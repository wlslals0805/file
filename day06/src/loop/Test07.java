package loop;

import java.util.Scanner;

public class Test07 {

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
		
//		System.out.println("분을 입력하세요");
//		int minute=sc.nextInt();
		
//		System.out.println("초를 입력하세요");
//		int second=sc.nextInt();
		

		
		for(int minute=sc.nextInt();minute>=0;minute--) {
			for(int second=sc.nextInt();second>=0;second--) {
				System.out.println(minute+"분"+second+"초후 알람이 울립니다!");
			}
			}
	
//			continue;
			//1초 대기
//			if(i>0) {
//				Thread.sleep(1000);
			}
			
		}
		

			
		
	


