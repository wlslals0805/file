package data3;

public class Test05_1_1 {

	public static void main(String[] args) {
		
		
//		건강검진은 30세 이상인 사람들을 대상으로
//		2년에 한 번씩 진행합니다
//
//		올해가 짝수 해라면(condition a), 짝수년도 출생자(condition b)가 대상이고 1.
//		올해가 홀수 해(condition a)라면, 홀수년도 출생자(condition b)가 대상입니다 2.
		///1,2둘 중 하나만 충족하면 건강검진 대상 기준 중 1개는 통과
//
//		어떤 사람의 출생년도(ex : 1985)를 입력값으로 두고
//		이 사람이 올해 건강검진 대상인지 아닌지 판정하여 출력
		
		
		//결론
		//-30세이상 && (짝수해 && 짝수년생 || 홀수해이면서 홀수년생)
		//-condition1 && (conditon2 || conditon3)
		
		//입력
		int birth =1985;
		int year=2023;
		
		//계산
		int age=year-birth + 1;
		boolean condition1=age>=30;
		
		boolean condition2a=year%2==0; //짝수년도
		boolean condition2b=birth%2==0; //짝수년생
		boolean condition2=condition2a&&condition2b; //짝수년도이면서 짝수년생인가?
		
		boolean condition3a=year%2!=0; //홀수년도
		boolean condition3b=birth%2!=0 ; //홀수년생
		boolean condition3=condition3a&&condition3b; //홀수년도이면서 홀수년생인가?
		
		
//		boolean condition1=30세 이상인가?;
//		boolean condition2=짝수년도&& 짝수년생인가?;
//		boolean condition2=홀수년도&& 홀수년생인가?;
		
		boolean condition = condition1 && (condition2 || condition3);
		
		//출력
		System.out.println(condition);
		
		
		
	}

}
