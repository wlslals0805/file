package array;

public class Test13 {

	public static void main(String[] args) {
//		`30`, `50`, `20`, `10`, `40` 이라는 데이터가 저장된 배열이 있을 때
//		이 배열의 데이터 위치를 완전히 반대로 뒤집어보세요
//
//		뒤집은 다음 데이터를 출력
		
		int[] a=new int[] {30,50,20,10,40};
		
		int backup=a[0];
		int backup2=a[1];
		
		a[0]=a[4];
		a[1]=a[3];
		a[4]=backup;
		a[3]=backup2;
		
		for(int i=0;i<a.length;i++) {
			
			System.out.println(a[i]);
		}
		
		
		
	}

}
