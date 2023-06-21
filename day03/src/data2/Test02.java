package data2;

public class Test02 {

	public static void main(String[] args) {
//		BMI(체질량지수) 계산기
//
//		네이버에서 `BMI 계산기`라고 검색하면 참고할만한 프로그램이 나옵니다
//
//		해당 프로그램에서 성별, 나이를 제거하고 만들 예정입니다
//
//		키가 180cm, 체중이 80kg인 사람이 있을 때 이 사람의 BMI 지수를 구하여 출력
//
//		```
//		               체중(kg)
//		계산공식 = ───────────────────
//		               키²(m²)
//		```
		
//		int cm=180;
//		double m=cm*0.01;
//		int kg=80;
//		
//		
//		double bmi=kg/(m*m);
//		
//		System.out.println(bmi);
		
		//입력
		
		int cm=180;
		int kg=80;
		
		double m=cm/100.0;
		
		double bmi=kg/(m*m);
		
		System.out.println(bmi);
		
	}

}
