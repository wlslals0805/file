package oop.inherit6;



public class Test01 {

	public static void main(String[] args) {
		Galaxy23 a=new Galaxy23();
		GalaxyFold4 b=new GalaxyFold4();
		Iphone13 c=new Iphone13();
		Iphone14 d=new Iphone14();
		
		a.setNumber("01012341234");
		a.setColor("하얀색");
		a.show();
		a.call();
		a.sms();
		a.samsungPay();
		a.bixby();
		
		System.out.println();
		
		b.setNumber("01012341234");
		b.setColor("블루");
		b.show();
		b.call();
		b.sms();
		b.samsungPay();
		b.iris();
		
		System.out.println();
		
		c.setNumber("01012312421");
		c.setColor("화이트");
		c.show();
		c.call();
		c.sms();
		c.itunes();
		c.siri();
		
		System.out.println();
		
		d.setNumber("010104095091");
		d.setColor("블랙");
		d.show();
		d.call();
		d.sms();
		d.faceTime();
		d.siri();
		
		
	}

}
