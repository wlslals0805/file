package loop2;

public class Test02 {

	public static void main(String[] args) {
		
		//1부터 99사이의 숫자 중 7이 포함된 숫자의 개수를 구하여 출력
		
		int count=0;
		
		for(int i = 1;i<=99;i++) {
			boolean a=i/10==7;
			boolean b=i%10==7;
			
			boolean c=a||b;
			if(c) {
				System.out.println(i);
				count++;
			}
			
		}
		System.out.println("7이 들어간 수는"+count+"개");
		

		
	}

}
