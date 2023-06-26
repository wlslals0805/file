package loop2;

public class Test03_1 {

	public static void main(String[] args) {
		//369 박수치는 숫자 개수 구하기
		
				int count = 0;
				
				for(int i=1; i <= 99; i++) {
					boolean ten = i / 10 == 3 || i / 10 == 6 || i / 10 == 9;
					boolean one = i % 10 == 3 || i % 10 == 6 || i % 10 == 9;
					if(ten || one) {
						//System.out.println(i);
						count++;
					}
				}
				
				System.out.println("박수치는 숫자 = " + count+"개");
	}

}
