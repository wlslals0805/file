package loop;

public class Test03 {

	public static void main(String[] args) {
//		1부터 100 사이의 홀수를 출력하는 프로그램을 구현하세요
		//-1,3,5,7,9,....,93,95,97,99(50개)
		//-횟수로 처리하기 어려우므로 범위를 정해서 처리
		
		
	
	
		
		for(int i=1; i<=100;i++) {
			
			boolean a = i%2==1;
			
			if(a) {System.out.println(i);} 
			
		}
		
	}

}
