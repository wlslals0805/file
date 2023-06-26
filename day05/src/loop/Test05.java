package loop;

public class Test05 {

	public static void main(String[] args) {
//		1부터 99 사이에 369게임에서 박수치는 숫자만 필터링하여 출력
		
		for(int i=1; i <=99; i++) 
		{ boolean f= i/10==3||i/10==6||i/10==9;
		 boolean s= i%10==3||i%10==6||i%10==9;
		 
		 if(f&&s) {System.out.println("짝짝");
	}
		 else if(f||s) {System.out.println("짝");
		 
		 }
		 else {System.out.println(i);
		 
		 }
	}
	}
}

