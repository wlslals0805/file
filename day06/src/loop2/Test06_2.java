package loop2;

public class Test06_2 {

	public static void main(String[] args) {
		//누적 합계 구하기
		//(Q1) 10을 10번 더하면 얼마예요?
		//(Q2)1부터 10까지 더하면 얼마에요?
		
		
//		int total= 1+2+3+4+5+6+7+8+9+10;
		
		int total=0;
		
		for(int i=1; i<=10;i++) {
			total+=i;
		}
		

		
		System.out.println(total);
		
		
	}

}
