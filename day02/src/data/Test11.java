package data;

public class Test11 {

	public static void main(String[] args) {
		
//		int startHour=9, startMin=40;
//		int endhour=12, endMin=25;
//		int totalMin=(startHour*60+startMin)-(endhour*60+endMin);
//		int hour=totalMin/60;
//		int minute=totalMin%60;
//		
//		System.out.println(-totalMin);
//		System.out.println(-hour);
//		System.out.println(-minute);
//		
//		int charge= hour*1200;
//		System.out.println(-charge);   나의 풀이

	
		//입력
		
		int startHour=9,startMin=40;
		int endHour=12,endMin=25;
		//계산
		int startTime= startHour*60+startMin;
		int endTime=endHour*60+endMin;
		int useTime=endTime-startTime;
//		System.out.println(useTime);
		int useHour=useTime/60;
		int useMin=useTime%60;
		
		System.out.println(useHour);
		System.out.println(useMin);     				
		
		
		//강사님 풀이
	}

}
