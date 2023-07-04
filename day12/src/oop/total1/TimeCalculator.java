package oop.total1;

public class TimeCalculator {
	
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
	
	int hour;
	int minute;
	int second;
	
	int hour1;
	int minute1;
	int second1;
	
	public void setSecond1(int second1) {
		this.second1 = second1;
	}

	public void setMinute1(int minute1) {
		this.minute1 = minute1*60;
	}

	public void setHour1(int hour1) {
		this.hour1 = hour1*60*60;
	}
	
	public void setSecond(int second) {
		this.second = second;
	}

	public void setMinute(int minute) {
		this.minute = minute*60;
	}

	public void setHour(int hour) {
		this.hour = hour*60*60;
	}

	public int getTotal() {
		return second+this.minute+this.hour;
	}
	
	public int getTotal1() {
		return second1+this.minute1+this.hour1;
	}
	
	public int getPlus() {
		return this.getTotal()+this.getTotal1();
	}
	
	public int getHour() {
		return this.getPlus()/60/60;
	}
	public int getMinute() {
		return this.getPlus()/60%60;
	}
	public int getSecond() {
		return this.getPlus()%60;
	}
	
	
	TimeCalculator(int hour,int minute,int second,int hour1,int minute1,int second1){

		this.setHour(hour);
		this.setMinute(minute);
		this.second=second;
		
		this.setHour1(hour1);
		this.setMinute1(minute1);
		this.second1=second1;
	}
	
public void show() {
		
		System.out.println(this.getHour()+"시간");
		System.out.println(this.getMinute()+"분");
		System.out.println(this.getSecond()+"초");
//		System.out.println("토탈 초: "+getTotal());
	}
	
	
}
