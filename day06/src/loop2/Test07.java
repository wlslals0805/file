package loop2;

public class Test07 {

	public static void main(String[] args) {
//		여름을 맞이하여 다이어트 계획을 다음과 같이 세웠습니다.
//
//		1.30일동안 매일 하루에 20개씩 푸시업을 한다
//		2.30일동안 첫날은 10개, 둘째날부터는 3개씩 늘려가며 한다
//		1번과 2번에 대한 각각의 푸시업 개수 합계를 구하여 출력하세요
		
		int total=0;
		int total2=0;
		int total3=0;
		
		
		for(int i=1; i<=30;i++) {
			total+=20;
			System.out.println(i+"일차"+"20개");
			
		}

		System.out.println("1번 총 푸시업 개수 "+total+"개");
		System.out.println();
		
	for(int i=1; i<=30;i++) {
		int a=total2+10;
		if(i==1) {total2=a;
		System.out.println(i+"일 차 "+total2+"개");}
		else {
//			for(i=2; i<30; i++)
				{total2+=3;
				System.out.println(i+"일 차 "+total2+"개");
				}
				
		
	}
		total3=total3+total2;
	}
	System.out.println("2번 총 푸시업 개수 "+ total3+ "개");
	
	}
}

