package day01;

import java.util.ArrayList;
import java.util.Scanner;

public class Test60 {

	public static void main(String[] args) {
//		자연수 M과 N이 주어질 때 M이상 N이하의 자연수 중 소수인 것을 모두 골라 이들 소수의 합과 최솟값을 찾는 프로그램을 작성하시오.
//
//		예를 들어 M=60, N=100인 경우 60이상 100이하의 자연수 중 소수는 61, 67, 71, 73, 79, 83, 89, 97 총 8개가 있으므로, 
//		이들 소수의 합은 620이고, 최솟값은 61이 된다.
//
//		입력
//		입력의 첫째 줄에 M이, 둘째 줄에 N이 주어진다.
//
//		M과 N은 10,000이하의 자연수이며, M은 N보다 작거나 같다.
//
//		출력
//		M이상 N이하의 자연수 중 소수인 것을 모두 찾아 첫째 줄에 그 합을, 둘째 줄에 그 중 최솟값을 출력한다. 
//
//		단, M이상 N이하의 자연수 중 소수가 없을 경우는 첫째 줄에 -1을 출력한다.
		
		
		Scanner sc = new Scanner(System.in);
		
		int m =sc.nextInt();
		int n = sc.nextInt();
		
		ArrayList<Integer> list2=new ArrayList<>();
		
		for(int i=m;i<=n;i++) {
			
			ArrayList<Integer> list=new ArrayList<>();
			for(int a=1;a<=i;a++) {
				if(i%a==0) {
					list.add(a);
				}	
			}
			
			if(list.size()==2) {
				
				list2.add(i);
				
			}	
		}
		
		if(list2.size()==0) {
			System.out.println(-1);
		}
		else {
		int total=0;
		for(int i=0; i<list2.size();i++) {
			
			total+=list2.get(i);
			
		}
		
		int min=list2.get(list2.size()-1);
		
	for(int i=0; i<list2.size();i++) {
			
		if(list2.get(i)<min) {
			
			min=list2.get(i);
			
		}
		
		}
		
		
		
		
		System.out.println(total);
		System.out.println(min);}
		
	}

}
