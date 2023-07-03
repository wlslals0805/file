package loop2;

public class Test07_3 {

	public static void main(String[] args) {
		//(Q1) 30일동안 매일 20개씩
				//(Q2) 30일동안 처음에 10개 이후 +3개씩

				int pushUp = 10;//시작은 10개(추천)

				for(int day=1; day <= 30; day++) {
					System.out.println(day+"일차 : " + pushUp + "개");

					pushUp += 3;//3개씩 증가
				}
	}

}
