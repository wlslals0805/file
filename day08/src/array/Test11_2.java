package array;

public class Test11_2 {

	public static void main(String[] args) {
		
double[] a=new double[]{150.8,180.2,175.9,162.7,170.3};
		
		double s=a[0];
		int si=0;
		
		
		for(int i=1;i<a.length;i++) {
			
			if(s>a[i]) {
				
				s=a[i];	
			}
			if(a[si]>a[i]) {
				
				si=i;
			}
		
		}
		
		System.out.println("가장 작은 키는 "+s);
		System.out.println("가장 작은 키의 위치는 "+si);
		
	}

}
