package oop.mathod3;

public class Test01 {

	public static void main(String[] args) {
		
//		| 통신사 | 상품명 | 월정액 | 데이터(GB) | 통화(분) | 문자(건) |
//		| :---: | :---: | :---: | :---: | :---: | :---: |
//		| SK | 5G언택트 52 | 52000 | 200 | 1000 | 2000 |
//		| KT | 5G세이브 | 45000 | 100 | 900 | 1500 |
//		| LG | 5G시그니처 | 130000 | 500 | 2000 | 2500 |
		
		
		Tariff p1=new Tariff();
		Tariff p2=new Tariff();
		Tariff p3=new Tariff();

		
		p1.setup("sk", "5G언택트 52",52000, 200, 1000, 2000);			
		p2.setup("kt", "5G세이브",45000, 100, 900, 1500);			
		p3.setup("LG", "5G시그니처 ",130000, 500, 2000, 2500);			
			
		
		p1.show();
		p2.show();
		p3.show();
		
	}

}
