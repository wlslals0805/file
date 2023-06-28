package array;

public class Test04 {

	public static void main(String[] args) {
//		'자바', '파이썬', '루비'를 저장하기 위한 배열을 생성하고 데이터를 저장한 뒤 출력하세요
		
		//data--------->[null][null][null]
		//참조형의 초기값:null
		
		String[] a=new String[3];
		
		
		//초기화(대입)
		a[0]="자바";
		a[1]="파이썬";
		a[2]="루비";
//		
		System.out.println(a[0]);
		System.out.println(a[1]);
		System.out.println(a[2]);

		
	}

}
