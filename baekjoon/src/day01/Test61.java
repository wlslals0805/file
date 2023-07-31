package day01;

<<<<<<< HEAD
import java.util.ArrayList;
import java.util.Scanner;

public class Test61 {

	public static void main(String[] args) {
//		정수 N이 주어졌을 때, 소인수분해하는 프로그램을 작성하시오.
//
//		입력
//		첫째 줄에 정수 N (1 ≤ N ≤ 10,000,000)이 주어진다.
//
//		출력
//		N의 소인수분해 결과를 한 줄에 하나씩 오름차순으로 출력한다. N이 1인 경우 아무것도 출력하지 않는다.
		
		
		Scanner sc = new Scanner(System.in);
		
		int n =sc.nextInt();
		ArrayList<Integer> list= new ArrayList<>();
		
			int i = n-1;
			int a = 0;
			
		while(true) {
			
			if(n/i==1&&n%i==0) {
				list.add(i);
				i--;
				if(i==1) {
					break;
				}
			}
			
			
			else  {
				i--;
				if(i==1) {
				break;}
			}
			
		
			}
			

		
		System.out.println(list);

	}}
	
					
				
				
					
				
			
			
			
			
		
		
		
		
	


=======
import java.util.Scanner;

public class Test61 {

	public static void main(String[] args) {
		
//	4 × 3 = 12이다.

//	이 식을 통해 다음과 같은 사실을 알 수 있다.

//	3은 12의 약수이고, 12는 3의 배수이다.

//	4도 12의 약수이고, 12는 4의 배수이다.

//	두 수가 주어졌을 때, 다음 3가지 중 어떤 관계인지 구하는 프로그램을 작성하시오.

//	첫 번째 숫자가 두 번째 숫자의 약수이다.
//	첫 번째 숫자가 두 번째 숫자의 배수이다.
//	첫 번째 숫자가 두 번째 숫자의 약수와 배수 모두 아니다.
		
//	입력
//	입력은 여러 테스트 케이스로 이루어져 있다. 
//	각 테스트 케이스는 10,000이 넘지않는 두 자연수로 이루어져 있다. 
//	마지막 줄에는 0이 2개 주어진다. 두 수가 같은 경우는 없다.

//	출력
//	각 테스트 케이스마다 첫 번째 숫자가 두 번째 숫자의 약수라면 factor를, 
//	배수라면 multiple을, 둘 다 아니라면 neither를 출력한다.
		
		
		Scanner sc = new Scanner(System.in);
		
		
		while(true) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			
			if(a==0&&b==0) {
				break;
			}
			
			else if(a>b&&a%b==0) {
				
				System.out.println("multiple");
				
			}
			else if(b>a&&b%a==0) {
				
				System.out.println("factor");
			}
			else {
				System.out.println("neither");
				
			}
			
			
			
			
			
			
			
		}
		
		
		
	}

}
>>>>>>> branch 'main' of https://github.com/wlslals0805/file.git
