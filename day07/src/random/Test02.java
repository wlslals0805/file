package random;

import java.util.Random;

public class Test02 {

	public static void main(String[] args) {
//		다음 요구하는 랜덤값을 구하여 화면에 출력하도록 코드를 구현하세요
//
//		1. 무작위 로또 번호 1개
//		2. 무작위 두 자리 정수 1개
//		3. 무작위 OTP 번호 1개(OTP 번호는 총 6자리로 구성되어 있습니다)
//		4. 무작위로 앞/뒤 출력 (약속) 앞=1, 뒤=2
//		5. 무작위로 가위/바위/보 출력
		
		Random r=new Random();
		
		int R=r.nextInt(45)+1;
		int i=r.nextInt(90)+10;
		int o=r.nextInt(1000000)+0;
		int f=r.nextInt(2)+1;
		if(f==1) {
			System.out.println("앞");
		}
		else {System.out.println("뒤");}
		
//		(약속) 가위=1, 바위=2, 보=2
//		int a=1부터 3개 중 하나
		int a=r.nextInt(3)+1;
		if(a==1) {System.out.println("가위");}
		else if(a==2) {System.out.println("바위");}
		else {System.out.println("보");
		
		}
		
		
		System.out.println("로또 번호:"+R);
		System.out.println("무작위 두 자리 정수:"+i);
		System.out.println("무작위 OTP 번호 1개:"+o);
	}
}


		
	
	

