package array;

public class Test11_1 {

	public static void main(String[] args) {
//		5명의 키 데이터가 다음과 같을 때 가장 키가 작은 사람의 위치와 값을 출력
//
//		데이터 : 150.8, 180.2, 175.9, 162.7, 170.3
		
		double[] a=new double[]{150.8,180.2,175.9,162.7,170.3};
		
//		double s=a[0];
		int si=0;
		
		for(int i=1;i<a.length;i++) {
			
			if(a[si]>a[i]) {
				
				si=i;	
			}
		
		}
		
		System.out.println("가장 작은 사람의 위치는"+si);
		
	}

}
