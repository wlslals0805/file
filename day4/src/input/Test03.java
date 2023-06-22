package input;

import java.util.Scanner;

public class Test03 {

	public static void main(String[] args) {
		
//		사용자에게 다음 정보를 입력받아 `총점(tot)`과 `평균(avg)`을 구하여 출력
//
//		- 국어 점수(kor)
//		- 영어 점수(eng)
		
		Scanner sc = new Scanner(System.in);
		
		sc.close();
		
		int kor = sc.nextInt();
		System.out.println("kor="+kor);
		
		int eng = sc.nextInt();
		System.out.println("eng="+eng);
		
		int mat = sc.nextInt();
		System.out.println("mat="+mat);
		
		int tot = sc.nextInt();
		tot=kor+eng+mat;
		System.out.println("tot="+tot);
		
		
		double avg = sc.nextDouble();
		avg=tot/3.0;
		System.out.println("avg="+avg);
		
	}

}
