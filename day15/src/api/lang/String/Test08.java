package api.lang.String;

import java.util.Scanner;

public class Test08 {

//욕설 필터링 프로그램
//사용자에게 문장을 입력받아 욕설이 있다면 `*`로 대체하여 출력  
//문자열 입력받는 방법은 다음과 같습니다.

//Scanner sc = new Scanner(System.in);
//String line = sc.nextLine();
//sc.close();

//필터링할 욕설은 다음과 같습니다
//
//수박씨, 신발끈, 개나리, 십장생, 시베리아, 
//주옥, 조카, 게불, 10원, 

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String a=sc.nextLine();
		
		String[] f=new String[] {"수박씨","신발끈","개나리","십장생","시베리아","주옥","조카","게불","10원"};
		
		for(int i=0;i<f.length;i++)
	
		if(a.contains(f[i])) {
			
			String star="*";
			
			a=a.replace(f[i],star.repeat(f[i].length()));}
		
		
	
		System.out.println(a);
	}

}
