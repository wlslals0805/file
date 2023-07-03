package loop2;

public class Test07_2 {

	public static void main(String[] args) {
		//(Q1) 30일동안 매일 20개씩
				//(Q2) 30일동안 처음에 10개 이후 +3개씩
				for(int day=1; day <= 30; day++) {
					//int pushUp = day * 3 + 7;//비추천(복잡)
					int pushUp = 10 + (day-1) * 3;//비추천(복잡)
					System.out.println(day+"일차 : " + pushUp + "개");
				}
	}

}
