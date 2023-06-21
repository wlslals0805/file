package data3;

public class Test03_1 {

	public static void main(String[] args) {

//		어떤 숫자(ex : 17)가 주어졌을 때
//
//		이 숫자가 짝수인지 판정하여 출력하도록 프로그램 구현
		
//		int number=17;
//		int evenNum=number%2;
//		boolean evenNumY=evenNum==0;
//		
//		System.out.println(evenNumY);
		
		//짝수 판정
		
		//입력
		int number=17;
		
		//계산
		int mod=number%2; ///2로 나누어 떨어지는 수
//		boolean isZero=mod가 0과 같습니까?
		boolean isZero = mod==0; ///2로 나누어 떨어지는 수가 0==2의 배수==짝수
		
		//출력
		System.out.println(isZero);
		
		//짝수=2로 나눈 나머지가 0인 수

	}

}
