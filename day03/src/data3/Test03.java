package data3;

public class Test03 {

	public static void main(String[] args) {

//		어떤 숫자(ex : 17)가 주어졌을 때
//
//		이 숫자가 짝수인지 판정하여 출력하도록 프로그램 구현
		
		int number=17;
		int evenNum=number%2;
		boolean evenNumY=evenNum==0;
		
		System.out.println(evenNumY);

	}

}
