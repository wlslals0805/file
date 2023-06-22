package input;

import java.util.Scanner;

public class Test03_1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		//입력
		
		System.out.println("국어점수를 숫자로 입력하세요");
		int kor = sc.nextInt();
		
		System.out.println("영어점수를 숫자로 입력하세요");
		int eng = sc.nextInt();
		
		System.out.println("수학점수를 숫자로 입력하세요");
		int mat=sc.nextInt();
		
		sc.close();
		
		//계산
		int tot = kor + eng + mat;
		float avg = (float)tot/3;
		
		//출력
		
		System.out.println("<계산 결과>");
		System.out.println("총점=" + tot);
		System.out.println("평균=" + avg);
	}

}
