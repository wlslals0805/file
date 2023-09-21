package day01;


import java.util.ArrayList;
import java.util.Scanner;

public class Test58 {

	public static void main(String[] args) {
//		어떤 숫자 n이 자신을 제외한 모든 약수들의 합과 같으면, 그 수를 완전수라고 한다.
//		예를 들어 6은 6 = 1 + 2 + 3 으로 완전수이다.
//		n이 완전수인지 아닌지 판단해주는 프로그램을 작성하라.
//
//		입력
//		입력은 테스트 케이스마다 한 줄 간격으로 n이 주어진다. (2 < n < 100,000)
//		입력의 마지막엔 -1이 주어진다.
//
//		출력
//		테스트케이스 마다 한줄에 하나씩 출력해야 한다.
//		n이 완전수라면, n을 n이 아닌 약수들의 합으로 나타내어 출력한다(예제 출력 참고).
//		이때, 약수들은 오름차순으로 나열해야 한다.
//		n이 완전수가 아니라면 n is NOT perfect. 를 출력한다.
		
		//백준 풀기
		//member 배운 내용 보충
		//java의 정석 interface 인강 듣기
		
		Scanner sc = new Scanner(System.in);
		int a = 1;
		int total = 0;
		String total2="";
		
		
		
		ArrayList<Integer> list = new ArrayList<>();
		a=1;
		
		
		while(true) {
			
			
			int input = sc.nextInt();
			
			if(input==-1) {
				break;
			}
			else {
				while(true) {
				if(input%a==0) {
					list.add(a);
					
					if(a==input) {
						break;
					}
				}
				a++;
				}
				for(int i = 0;i<list.size()-1;i++) {
					
					total+=list.get(i);
				}
				if(total==input) {
					
					total2=input+" = 1";
					for(int i = 1;i<list.size()-1;i++) {
						
						total2+=" + "+list.get(i);
						
					}
					System.out.println(total2);
				}
				else {System.out.println(input+" is NOT perfect.");}
				
				a=1;
				list.removeAll(list);
				total=0;
				total2="";
			}
			}
		

				
				
				
				
			
			
			
			
			

		
		
		
		

	}

}
