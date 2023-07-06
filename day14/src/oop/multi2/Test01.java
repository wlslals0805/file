package oop.multi2;

public class Test01 {

	public static void main(String[] args) {
		
		Drone d=new Drone();
		Bus b= new Bus();
		AirPlane a= new AirPlane();
		KickBoard k = new KickBoard();
		Train t = new Train();
		R v=new AirPlane();
		
		v.Reserve();
		
		

		T tt=d; //업캐스팅
//		D dd = tt; //다운캐스팅(에러)
		Drone dd = (Drone)tt; //다운캐스팅 (ok) 
		
		
		
		
		d.Electronic();
		d.Flyable();
		d.Transportation();
		
		System.out.println();
		
		b.Transportation();
		
		System.out.println();
		
		a.Flyable();
		a.Reserve();
		a.Transportation();
	 
		System.out.println();
		
		k.Electronic();
		k.Transportation();
		
		System.out.println();
		
		t.Reserve();
		t.Transportation();
		
		
		
		
	}

}
