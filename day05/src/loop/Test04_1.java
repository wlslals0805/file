package loop;

public class Test04_1 {

	public static void main(String[] args) {
		//5가 들어간 숫자 출력
		
				//for(1부터 99까지) {
				for(int i=1; i<=99; i++) {
					boolean ten = i / 10 == 5;
					boolean one = i % 10 == 5;
					boolean five = ten || one;
					if(five) {
						System.out.println("i = " + i);
					}
					else {
						//할게 없음
					}
	}
	}
}
