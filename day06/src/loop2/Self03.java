package loop2;

import java.util.Scanner;

public class Self03 {

	public static void main(String[] args) {
		//소수 탐색 프로그램
		
		//소수는 나누기가 어려운 숫자들을 말합니다.
		//나누기가 어렵다는 것은 1이나 자기자신 빼고 나누어 떨어지는 수가 없다는 뜻
		
		//5는 소수이다.(1,5 빼고 딱 떨어지는 수가 없음)
		
		//소수가 아니라는 것은 1과 자기자신을 제외하고도 나누어 떨어지는 수가 있다는 뜻
		
		//6은 소수가 아니다.(1,6 빼고도 2,3 등 나누어 떨어지는 수가 있음)
		
		//(Q)사용자가 2 이상의 어떤 숫자를 입력했을 때 소수인지 아닌지 판정하여 출력
		
		//1부터 자기자신'까지' 나눴을 때를 기준으로 1과 자기 자신 외에 나눠지는 수가 없으면 소수
		
		Scanner sc=new Scanner(System.in);
		
		int number=sc.nextInt();
		int count=0;
		for(int i=1;i<=number;i++) {
		
		int e=number%i;
		boolean pNumber=e==0;
		
		
		if(pNumber) {
			count++;
		}
		
		if(count>2) {
			System.out.println("소수가 아닙니다");
		}
		else { System.out.println("소수입니다");
		
		}
		}
		}
}
		
	



