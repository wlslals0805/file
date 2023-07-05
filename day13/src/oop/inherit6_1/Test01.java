package oop.inherit6_1;



public class Test01 {
	public static void main(String[] args) {
		Galaxy23s p1 = new Galaxy23s("010-1212-3434", "실버");
		p1.show();
		p1.call();
		p1.sms();
		p1.samsungPay();
		p1.bixby();
		
		GalaxyFold4 p2 = new GalaxyFold4("010-1234-5678", "블랙");
		p2.show();
		p2.call();
		p2.sms();
		p2.samsungPay();
		p2.iris();
		
		IPhone13 p3 = new IPhone13("010-1111-2222", "아쿠아블루");
		p3.show();
		p3.call();
		p3.sms();
		p3.siri();
		p3.itunes();
		
		IPhone14 p4 = new IPhone14("010-5555-6666", "레드");
		p4.show();
		p4.call();
		p4.sms();
		p4.siri();
		p4.facetime();
	}
}
