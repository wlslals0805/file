package data;

public class Test10 {
		
		public static void main(String[] args) {
			
//			int a=(60*2+45); 
//			int b=(60+50);
//			
//			int c=a+b;
//			int d=c/60;
//			int e=c%60;
//			
//			System.out.println(c);
//			System.out.println(d);
//			System.out.println(e);
			
			//시간은 가장 작은 단위로 변환하여 푼다
			
			//입력
//			int yesterdayHour=2, yesterdayMin=45;
//			int todayHour=1, todayMin=50;
//			
//			//계산
//			
//		int yesterdayTime=yesterdayHour*60+yesterdayMin;
//		int todayTime=todayHour*60+todayMin;
//		
//		int time= yesterdayTime+todayTime;
//		
//		int hour=time/60;
//		int minute=time%60;
//		
//		//출력
//		
//		System.out.println(hour);
//		System.out.println(minute);
			
			int yesterdayHour=2, yesterdayMin=45;
			int todayHour=1, todayMin=50;
			
			int yesterdayTime=2*60+45;
			int todayTime=1*60+50;
			int totalTime=yesterdayTime+todayTime;
			int totalHour=totalTime/60;
			int totalMin=totalTime%60;
			
			System.out.println(yesterdayTime);
			System.out.println(todayTime);
			System.out.println(totalTime);
			System.out.println(totalHour);
			System.out.println(totalMin);
			
			
			
		
			
		
	}

}
