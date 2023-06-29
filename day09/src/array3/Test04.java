package array3;

public class Test04 {

	public static void main(String[] args) {
//		# Test04
//
//		다음 데이터를 2차원 배열에 저장하고 출력
//
//		- `자바`, `스프링`, `안드로이드`
//		- `파이썬`, `판다스`, `장고`
		
		String[][] a=new String[][]{{"자바","스프링","안드로이드"},{"파이썬","판다스","장고"}};
		
//		a[0][0]="자바";
//		a[0][1]="스프링";
//		a[0][2]="안드로이드";
//		a[1][0]="파이썬";
//		a[1][1]="판다스";
//		a[1][2]="장고";
		
		
		
		for(int b=0;b<a.length;b++) {
			
			for(int i=0;i<a[b].length;i++) {
				System.out.println(a[b][i]);
			}}
//		System.out.println(a[0][0]);
//		System.out.println(a[0][1]);
//		System.out.println(a[0][2]);
//		System.out.println(a[1][0]);
//		System.out.println(a[1][1]);
//		System.out.println(a[1][2]);
		
	}

}
