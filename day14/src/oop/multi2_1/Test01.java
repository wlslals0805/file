package oop.multi2_1;

public class Test01 {
	public static void main(String[] args) {
		Drone d = new Drone();
//		Flyable d = new Drone();//업캐스팅
//		Electronic d = new Drone();//업캐스팅
//		Transportation d = new Drone();//업캐스팅
//		Reserve d = new Drone();//상속관계가 아니므로 업캐스팅이 불가능
		d.on();
		d.fly();
		d.move();
		d.off();
		
		Transportation t = d;//업캐스팅
		
//		----------------------------------------------
		
//		if(t가 드론일 경우만) {
		if(t instanceof Drone) {
//			Drone dd = t;//다운캐스팅(에러)
			Drone dd = (Drone)t;//다운캐스팅(ok)
			
			dd.on();
			dd.fly();
			dd.move();
			dd.off();
		}
		
	}
}
