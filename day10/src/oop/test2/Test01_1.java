package oop.test2;

public class Test01_1 {

	public static void main(String[] args) {
//		pocketMonser의 객체(인스턴스)를 생성
		
		pocketMonster p1=new pocketMonster();
		pocketMonster p2=new pocketMonster();
		pocketMonster p3=new pocketMonster();
		pocketMonster p4=new pocketMonster();
		
		
		
		//초기화
		p1.name="이상해씨";
		p1.number=1;
		p1.type="풀";
		
		p2.name="파이리";
		p2.number=4;
		p2.type="불꽃";
		
		p3.name="꼬부기";
		p3.number=7;
		p3.type="물";
		
		p4.name="피카츄";
		p4.number=25;
		p4.type="전기";
		
		System.out.println(p1.number);
		System.out.println(p1.name);
		System.out.println(p1.type);
		System.out.println();
		System.out.println(p2.number);
		System.out.println(p2.name);
		System.out.println(p2.type);
		System.out.println();
		System.out.println(p3.name);
		System.out.println(p3.number);	
		System.out.println(p3.type);
		System.out.println();
		System.out.println(p4.name);
		System.out.println(p4.number);
		System.out.println(p4.type);
		
	}

}
