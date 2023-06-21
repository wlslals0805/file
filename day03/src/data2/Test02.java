package data2;

public class Test02 {

	public static void main(String[] args) {

//		키가 180cm, 체중이 80kg인 사람이 있을 때 이 사람의 BMI 지수를 구하여 출력
//
//		               체중(kg)
//		계산공식 = ───────────────────
//		               키²(m²)
	
		int cm=180;
		double m=cm*0.01; ///정확한 결과를 위해 소수 곱해주기
		int kg=80;
		
		double bmi=kg/(m*m);
		
		System.out.println(bmi);
		
		
	}

}
