package data;

public class Test11_2 {

	public static void main(String[] args) {
		
		int startHour=9, startMin=40;
		int endhour=12, endMin=25;
		int totalMin=(startHour*60+startMin)-(endhour*60+endMin);
		int hour=totalMin/60;
		int minute=totalMin%60;
		int price=1200;
		int pricePerMin=price/60;
		
		System.out.println(-totalMin);
		System.out.println(-hour);
		System.out.println(-minute);
		
		System.out.println(-(pricePerMin*totalMin));
		
		//내 풀이에 강사님 풀이 적용
		

	
		//입력
//		
//		int startHour=9,startMin=40;
//		int endHour=12,endMin=25;
//		//계산
//		int startTime= startHour*60+startMin;
//		int endTime=endHour*60+endMin;
//		int useTime=endTime-startTime;
////		System.out.println(useTime);
//		int useHour=useTime/60;
//		int useMin=useTime%60;
//		
//		System.out.println(useHour);
//		System.out.println(useMin);     				
//		
		
		//강사님 풀이
	}

}
