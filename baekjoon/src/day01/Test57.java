package day01;

<<<<<<< HEAD
import java.util.ArrayList;
import java.util.Scanner;

public class Test57 {

	public static void main(String[] args) {
//		어떤 자연수 p와 q가 있을 때, 만일 p를 q로 나누었을 때 나머지가 0이면 q는 p의 약수이다. 
//
//		6을 예로 들면
//
//		6 ÷ 1 = 6 … 0
//		6 ÷ 2 = 3 … 0
//		6 ÷ 3 = 2 … 0
//		6 ÷ 4 = 1 … 2
//		6 ÷ 5 = 1 … 1
//		6 ÷ 6 = 1 … 0
//		그래서 6의 약수는 1, 2, 3, 6, 총 네 개이다.
//
//		두 개의 자연수 N과 K가 주어졌을 때, N의 약수들 중 K번째로 작은 수를 출력하는 프로그램을 작성하시오.
//
//		입력
//		첫째 줄에 N과 K가 빈칸을 사이에 두고 주어진다. N은 1 이상 10,000 이하이다. K는 1 이상 N 이하이다.
//
//		출력
//		첫째 줄에 N의 약수들 중 K번째로 작은 수를 출력한다. 
//		만일 N의 약수의 개수가 K개보다 적어서 K번째 약수가 존재하지 않을 경우에는 0을 출력하시오.
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int k = sc.nextInt();
		
		ArrayList<Integer> list = new ArrayList<>();
		
		int a= 1;
		
		
		
		while(true) {
			if(n%a==0) {
				list.add(a);
				
				if((n==a)&&(list.size()<k)) {
					System.out.println(0);
					break;
				}
				
				else if(list.size()==k) {
					System.out.println(list.get(k-1));
					break;
					
				}	
			}
			
			a++;		
			
=======
import java.util.Scanner;

public class Test57 {

	public static void main(String[] args) {
		
		
//		N*M크기의 두 행렬 A와 B가 주어졌을 때, 두 행렬을 더하는 프로그램을 작성하시오.
//
//		입력
//		첫째 줄에 행렬의 크기 N 과 M이 주어진다. 
//		둘째 줄부터 N개의 줄에 행렬 A의 원소 M개가 차례대로 주어진다. 
//		이어서 N개의 줄에 행렬 B의 원소 M개가 차례대로 주어진다. N과 M은 100보다 작거나 같고, 
//		행렬의 원소는 절댓값이 100보다 작거나 같은 정수이다.
//
//		출력
//		첫째 줄부터 N개의 줄에 행렬 A와 B를 더한 행렬을 출력한다. 
//		행렬의 각 원소는 공백으로 구분한다.
		
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt(),m=sc.nextInt();
		
		int[][] a = new int[n][m];
		int[][] b = new int[n][m];
		
		for(int i = 0;i<n;i++) {
			for(int t = 0;t<m;t++) {
				
				a[i][t]=sc.nextInt();
				
			}	
		}
		for(int i = 0;i<n;i++) {
			for(int t = 0;t<m;t++) {
				b[i][t]=sc.nextInt();
			}	
		}
		
		
		
		for(int i = 0;i<n;i++) {
			for(int t = 0;t<m;t++) {
				System.out.print(b[i][t]+a[i][t]+" ");
			}	
>>>>>>> branch 'main' of https://github.com/wlslals0805/file.git
		}
		
		
		
	}

}
