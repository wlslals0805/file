package input;

import java.io.IOException;

public class Test01 {

	public static void main(String[] args) throws IOException {
		//표준 입력 
		//=System.in 을 사용하여 처리
		//-사용자가 입력해주기를 기다려야 한다.
		//-ASCKII 코드를 입력받는다
		
		int a= System.in.read(); ///첫 글자
		System.out.println("a=" + a);
		
		int b= System.in.read(); ///두번째 글자
		System.out.println("b=" + b);
		
		int c= System.in.read(); ///세번째 글자
		System.out.println("c=" + c);
		
		int d= System.in.read(); ///네번째 글자
		System.out.println("d=" + d);
		
		
		
	}

}
