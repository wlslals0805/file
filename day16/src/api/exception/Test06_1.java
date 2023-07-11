package api.exception;

import java.time.LocalDate;
import java.util.Scanner;

public class Test06_1 {

	public static void main(String[] args) {
		try {
			//입력
			Scanner sc = new Scanner(System.in);
			System.out.println("출생년월 입력(YYYY-MM)");
			String input = sc.next();
			sc.close();
			
			int currentYear = LocalDate.now().getYear();
			int currentMonth = LocalDate.now().getMonthValue();
			
			//계산
			String[] part = input.split("-");//-를 구분자(delimiter)로 하여 분해
			int year = Integer.parseInt(part[0]);
			int month = Integer.parseInt(part[1]);
			if(year > currentYear || (year == currentYear && month > currentMonth)) {//미래의 연/월이라면
				throw new Exception("미래의 시간은 입력할 수 없습니다");
			}
			if(year < 1900) {//연도가 1900미만이라면
				throw new Exception("1900년 미만은 입력할 수 없습니다");
			}
			if(month < 1 || month > 12) {//월이 1~12가 아니라면
				throw new Exception("월은 1~12로만 입력할 수 있습니다");
			}
			
			//한국나이 계산
			int koreanAge = currentYear - year + 1;
			
			//만나이 계산
			int totalMonth = (currentYear - year) * 12 + (currentMonth - month);
			int globalAge = totalMonth / 12;
			
			//출력
			System.out.println("한국나이 : "+koreanAge+"살");
			System.out.println("만나이 : "+globalAge+"살");
		}
		catch(Exception e) {
			//System.err.println("자바가 감지하지 못하는 예외 발생");
			if(e.getMessage() == null) {
				System.err.println("프로그램 오류 발생");
			}
			else {
				System.err.println("오류 : " + e.getMessage());
			}
		}
	}

}
