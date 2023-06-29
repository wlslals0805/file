package array3;

import java.util.Random;

public class Test06 {

	public static void main(String[] args) {
//		빙고판 만들기
//
//		빙고판은 5x5 사이즈가 기본입니다
//		빙고판은 정사각형이며 홀수 크기만 가능합니다
//		빙고판에는 숫자가 1부터 랜덤한 위치에 배치됩니다
//		한 칸에는 한 번의 숫자만 배치 가능합니다
//		빙고판을 제작한 뒤 출력하세요
//		크기도 변경 가능하도록 업그레이드 하세요
		
		Random r=new Random();
		
		
		int f=5;
		int s=5;
		int d=f*s;
		
		int[][] a=new int[f][s];
//		int[] n=new int[25];
		
		
//		for(int i=0;i<n.length;i++) {
//			n[i]=i+1;
//		}
	
		for(int i=0;i<a.length;i++) {
			for(int b=0;b<a[i].length;b++) {
				int c=r.nextInt(25)+1;
					a[i][b]=c;
			}
			
		}
		
		for(int i=0;i<a.length;i++) {
			System.out.println();
			for(int b=0;b<a[i].length;b++) {
				System.out.print(a[i][b]+"\t");
			}
		
	}
	}
}


