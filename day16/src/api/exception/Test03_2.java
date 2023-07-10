package api.exception;

public class Test03_2 {

	public static void main(String[] args) {
		//입력
				String input = "2023-07-10";
				
				//계산
				String part1 = input.substring(0, 4);
				String part2 = input.substring(5, 7);
				String part3 = input.substring(8, 10);
				
				int year = Integer.parseInt(part1);
				int month = Integer.parseInt(part2);
				int day = Integer.parseInt(part3);
				
				//출력
				System.out.println("출생년도 : "+year);
				System.out.println("출생월 : "+month);
				System.out.println("출생일 : "+day);
				
	}

}
