package loop;

public class Test06 {

	public static void main(String[] args) {
		//369 박수치는 숫자 찾기
		
				for(int i=1; i <= 99; i++) {
					boolean ten = i / 10 == 3 || i / 10 == 6 || i / 10 == 9;
					boolean one = i % 10 == 3 || i % 10 == 6 || i % 10 == 9;
					boolean clap = ten || one;
					boolean doubleClap = ten && one;

					if(doubleClap) {
						System.out.println("짝짝");
					}
					else if(clap) {
						System.out.println("짝");
					}
					else {
						System.out.println(i);
					}
				}
	}

}
