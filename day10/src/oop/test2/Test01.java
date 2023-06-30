package oop.test2;

public class Test01 {

	public static void main(String[] args) {
		//다음 데이터를 보고 적절한 클래스를 만들고 구조화하여 출력하세요
		//
		//포켓몬스터 목록
		//번호	이름	속성
		//1	이상해씨	풀
		//4	파이리	불꽃
		//7	꼬부기	물
		//25	피카츄	전기
		
		List b=new List();
		List c=new List();
		List d=new List();
		List e=new List();
		
		b.number=1;
		b.name="이상해씨";
		b.a="풀";
		
		c.number=4;
		c.name="파이리";
		c.a="불꽃";
		
		d.number=7;
		d.name="꼬부기";
		d.a="물";
		
		e.number=25;
		e.name="피카츄";
		e.a="전기";
		
		
		System.out.println(b.number);
		System.out.println(b.name);
		System.out.println(b.a);
		System.out.println();
		System.out.println(c.number);
		System.out.println(c.name);
		System.out.println(c.a);
		System.out.println();
		System.out.println(d.number);
		System.out.println(d.name);
		System.out.println(d.a);
		System.out.println();
		System.out.println(e.number);
		System.out.println(e.name);
		System.out.println(e.a);
		
		
	}

}
