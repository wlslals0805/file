package oop.total1;

public class Time01 {
//	시간을 관리할 수 있는 클래스를 구현하려고 합니다.
//	이 클래스의 이름은 Time이며 다음과 같은 항목들을 가지고 있어야 합니다.
//
//	객체를 생성하는 방법은 다음과 같습니다.
//
//	시간, 분, 초를 설정하는 방법
//	분, 초를 설정하는 방법
//	초만 설정하는 방법
//	어떤 방법으로 생성하든지 데이터는 초로 변환되어 저장됩니다.
//	하지만 외부에서는 이를 알지 못해야 하며 시간, 분, 초를 각각 확인할 수 있어야 합니다.
//
//	show 메소드에서는 설정된 시간을 다음과 같이 출력해야 합니다.
//
//	?시간 ?분 ?초
//	다음 정보들을 객체로 만들고 정보를 출력하세요.
//
//	3시간 30분 40초
//	1시간 70분 100초
//	50분 20초
//	30000초
	
//	TimeCalculator라는 클래스를 만들어 시간 계산이 가능하도록 구현하려고 합니다.
//	구현하려고 하는 계산은 다음과 같습니다.
//
//	이름	설명
//	plus	두 개의 시간 객체 정보를 더하여 새로운 시간 객체를 생성하여 반환
//	minus	두 개의 시간 객체 정보를 빼서 새로운 시간 객체를 생성하여 반환
//	TimeCalculator를 이용하여 다음 시간 계산을 수행한 뒤 결과를 출력하세요
//
//	3시간 20분 - 1시간 50분 30초
//	4000초 - 1시간 10분

	int second;
	int minute;
	int hour;

	





	public void setSecond(int second) {
		this.second = second;
	}

	private void setMinute(int minute) {
		this.minute = minute*60;
	}

	public void setHour(int hour) {
		this.hour = hour*60*60;
	}


	public int getTotal() {
		return second+this.minute+this.hour;
	}



	public int getHour() {
		return this.getTotal()/60/60;
	}
	public int getMinute() {
		return this.getTotal()/60%60;
	}
	public int getSecond() {
		return this.getTotal()%60;
	}
	
	Time01(int hour,int minute,int second){
		
//		this.hour=hour;
//		this.minute=minute;
//		this.second=second;
		
		this.setHour(hour);
		this.setMinute(minute);
		this.second=second;
	}
	Time01(int minute,int second){
		this.hour=0;
		this.setMinute(minute);
		this.second=second;
	}
	Time01(int second){
		this.hour=0;
		this.minute=0;
		this.second=second;
	}

	public void show() {
		
		System.out.println(this.getHour()+"시간");
		System.out.println(this.getMinute()+"분");
		System.out.println(this.getSecond()+"초");
		System.out.println("토탈 초: "+getTotal());
	}





	
}
