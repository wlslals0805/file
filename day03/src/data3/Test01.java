package data3;

public class Test01 {
	
	public static void main(String[] args) {
		
		///논리 수업
	//논리(Logical Data)
		//-수치를 기반으로 Yes/No를 판정하기 위한 데이터 형태
		//-Yes 대신 true, No대신 false 라는 값을 사용
		//-형태는 boolean 한 개 뿐이다.
		
//		boolean c=100; /// 논리 변수 타입에는 논리 연산자만 가능. 숫자 불가능
		boolean a=true;
		boolean b=false;
		
		//(Q) 
		//주머니에 2만원이 있다. 
		//피자가 18000원일 때 주문이 가능한가?
		int money =20000;
		int pizza=18000;
		
		boolean order=money >= pizza; ///수중에 가지고 있는 돈을 대입한 변수 money가 피자의 가격보다 크냐는 물음
		
		System.out.println(order);
		
		
	}

}
