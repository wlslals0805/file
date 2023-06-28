package array;

import java.util.Scanner;

public class Test08 {

	public static void main(String[] args) {
//		학생 5명의 시험점수를 입력받아서 저장하고 다음 문제를 푸세요.
//
//		1. 통과하지 못한 학생의 점수만 출력 (60점 미만)
//		2. 우수한 성적(90점 이상)으로 통과한 학생의 점수만 출력
//		3. 만약 75점인 학생이 전학을 왔다면 몇 등인지 구해서 출력
		
		Scanner sc=new Scanner(System.in);
		
		int[] a= new int[5];

		for(int i=0; i < a.length;i++) {
			System.out.println("점수를 입력하세요");
			a[i]=sc.nextInt();}
		
		for(int i=0; i < a.length;i++) {
			if(a[i]>=90) {
				System.out.print(a[i]);
				System.out.println("점. 우수한 성적으로 통과");
			}
			else if(a[i]<60) {
				System.out.print(a[i]);
				System.out.println("점. 재평가");
			}
		}
		
		System.out.println("전학생 점수 입력:");
		int n=sc.nextInt();
		int count=0;
		for(int i=0; i <a.length ;i++) {
			
			boolean number=a[i]<n;//전학생의 점수가 기존 학생들의 점수보다 큰 게 트루인 횟수
		
	
			if(number) {
				count++;}
		}
			
			if(count==5) {
				System.out.println("전학생의 점수는 1등");
			}
			else if(count==4) {
				System.out.println("전학생의 점수는 2등");
			}
		 	else if(count==3) {
		 		System.out.println("전학생의 점수는 3등");
		}
		 	else if(count==2) {
		 		System.out.println("전학생의 점수는 4등");
		 	}
		 	else if(count==1) {
		 		System.out.println("전학생의 점수는 5등");
		 	}
		 	else if(count==0) {
		 		System.out.println("전학생의 점수는 6등");
		 	}
		
	
		


			}
		
	}


		
	

//}
