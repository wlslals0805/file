package api.exception;

import java.time.LocalDate;
import java.util.Scanner;

public class Test06_2 {

	public static void main(String[] args) {
		try {
			//입력
			Scanner sc = new Scanner(System.in);
			System.out.println("출생년월 입력(YYYY-MM)");
			String input = sc.next();
			sc.close();
			
			if(input.matches("^(19[0-9]{2}|20[0-9]{2})-(0[1-9]|1[0-2])$") == false) {//형식에 맞지 않으면
				throw new Exception("시간 형식이 맞지 않습니다");
			}
			
			int currentYear = LocalDate.now().getYear();
			int currentMonth = LocalDate.now().getMonthValue();
			
			//계산
			String[] part = input.split("-");//-를 구분자(delimiter)로 하여 분해
			int year = Integer.parseInt(part[0]);
			int month = Integer.parseInt(part[1]);
			if(year > currentYear || (year == currentYear && month > currentMonth)) {
				throw new Exception("미래의 시간은 입력할 수 없습니다");
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
