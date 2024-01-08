package day01;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Test86 {
	
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int m = sc.nextInt();
		
		int[][] list = new int[m][n];
		
		for(int i=0;i<m;i++) {
			for(int a=0;a<n;a++) {
				list[i][a] = sc.nextInt();
			}
		}
		
		System.out.println(solution(list));
	}
	
	static int solution(int[][] list) {
		
		int n = list[0].length;	//학생 수
		int m = list.length;	//테스트 횟수
		int result = 0;
		
		
		for(int b=1;b<=n;b++) {//학생 번호
		
			Set<Integer> set = new TreeSet<>();
			
			for(int c=1;c<=n;c++) {
				
				set.add(c);
				
			}
			
			
			for(int i=0;i<m;i++) {//테스트 순서
				
				for(int a=0;a<n;a++) {//등수

					if(list[i][a]==b) {
						a=n-1;
					}
					else {
						set.remove(list[i][a]);
					}
					
			}
		}
			result+=set.size()-1;
			
		}
		
		return result;
	}

}
