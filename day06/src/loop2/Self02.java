package loop2;

public class Self02 {

	public static void main(String[] args) {
//		여름을 맞이하여 다이어트 계획을 다음과 같이 세웠습니다.
//
//		1.30일동안 매일 하루에 20개씩 푸시업을 한다
//		2.30일동안 첫날은 10개, 둘째날부터는 3개씩 늘려가며 한다
//		1번과 2번에 대한 각각의 푸시업 개수 합계를 구하여 출력하세요
		
		
		int pushUp=0;
		for(int day=1;day<=30;day++) {
			
		pushUp+=20;
		
	
			}
		System.out.println(pushUp);
		
		int pushUp2=0;
		int total2=0;
		for(int day=1;day<=30;day++) {
			if(day==1) {
				
				pushUp2=10;
				total2+=pushUp2;
				
			}
			else {
				pushUp2+=3; //기존 푸시업 개수에 3개를 추가한 것
				total2+=pushUp2; //n일 때 한 푸시업 개수에 n+1이 되고 하는 푸시업 개수를 더한 것
		
			}
			
			
		}
		
		System.out.println(total2);
		
		}
	
	}


