package array3;

import java.util.Random;

public class Test05 {

	public static void main(String[] args) {
//		주사위를 5번씩 6회 던진 결과를 저장한 뒤
//		(1) 회차별 주사위 던진 결과를 출력하시고
//		(2) 모든 주사위 값의 평균을 출력하세요
//		회차별 평균 계산
		//=합계 저장할 변수가 "회차" 개수만큼 있어야 한다
		
		Random r=new Random();
		
		int count=0;
		int total=0;
		double ave;
		int[][] a=new int[6][5];//{{1,2,3,4,5},{1,2,3,4,5,6}};
	
		for(int i=0;i<a.length;i++) {
			
			for(int b=0;b<a[i].length;b++) {
				int c=r.nextInt(6)+1;	
				a[i][b]=c;
				total+=a[i][b];
				count++;
				}
			
			}
		

		for(int i=0;i<a.length;i++) {
			
			for(int b=0;b<a[i].length;b++) {
				
				System.out.println(a[i][b]);

				}
			
			}

		ave=(double)total/count;
System.out.println("모든 주사위 값의 합계는:"+total);
System.out.println(count);
				System.out.println("평균은:"+ave);
			
			
		}
		
		
		
	}


