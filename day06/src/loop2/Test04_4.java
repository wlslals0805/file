package loop2;

public class Test04_4 {

	public static void main(String[] args) {
		//입력
				int number = 7;

				int count = 0;

				for(int i=1; i <= number; i++) {
					if(number % i == 0) {
						//System.out.println(number % i);
						count++;
					}
				}

				System.out.println("number = " + number);
				System.out.println("count = " + count);

				if(count == 2) {
					System.out.println("소수입니다");
				}
				else {
					System.out.println("소수가 아닙니다");
	}
	}
}
