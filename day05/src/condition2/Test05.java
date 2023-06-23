package condition2;

import java.util.Scanner;

public class Test05 {

	public static void main(String[] args) {

//		SNS에서는 작성한 글이 몇 초 전에 작성되었는지에 따라 다음과 같이 출력합니다.
//
//		구분	설명
//		방금 전	작성한 지 10초가 되지 않은 글
//		?초 전	작성한 지 10초 이상 1분이 되지 않은 글
//		?분 전	작성한 지 1분 이상 1시간 미만인 글
//		?시간 전	작성한 지 1시간 이상 1일 미만인 글
//		?일 전	작성한 지 1일 이상인 글
//		사용자에게 초를 입력받아서 기준에 따라 게시글 시간 형식을 출력
		
		Scanner sc=new Scanner(System.in);
		
		int second=sc.nextInt();
		
//		int minute=second/60;
//		int hour=second/3600;
//		int day=second/86400;
		
		if(second<10) {
			
			System.out.println("방금 전");
			
		}
		
		else if(second>=10&&60>second) {
			System.out.println(second+"초 전");
		}
	
		else if(second>=60&&second<3600) {
		
			int minute=second/60;
			System.out.println(minute+"분 전");
		
		}
		else if(second>=3600&&second<86400) {
			
			int hour=second/3600;
			System.out.println(hour+"시간 전");
			
		}
		else if(second>=86400&&second<1*365*24*60*60){
		
		int day=second/86400;
		System.out.println(day+"일 전");
		
		}
		
		else if(second>1*365*24*60*60) {
			
			int year=second/(1*365*24*60*60);
			System.out.println(year+"년 전");
			
			
		}
	}
		}
	

