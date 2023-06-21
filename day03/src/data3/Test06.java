package data3;

public class Test06 {

	public static void main(String[] args) {
//		어떤 두 자리 이하의 수(ex : 95)가 주어졌을 때
//
//		이 숫자에 3, 6, 9가 포함되어 있는지 판정 후 출력하세요
//
//		(369 게임에서 박수치는 숫자인지 아닌지 판정)
		
		int number=95;
		
		int answer=number/10;
		boolean condition1=answer==3||answer==6||answer==9;
		
		int odd= number%10;
		boolean condition2=odd==3||odd==6||odd==9;
		
		boolean condition= condition1 || condition2;
		
		System.out.println(condition);
		
	}

}
