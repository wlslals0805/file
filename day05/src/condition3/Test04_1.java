package condition3;

import java.util.Scanner;

public class Test04_1 {

	public static void main(String[] args) {
//		1월부터 12월은 각각 정해진 날짜 수가 존재합니다.
//
//		| 구분 | 설명 |
//		| --- | --- |
//		| 큰달 | 31일까지 존재하는 달(1, 3, 5, 7, 8, 10, 12월) |
//		| 작은달 | 30일까지 존재하는 달(4, 6, 9, 11월) |
//		| 2월 | 윤년일 경우 29일, 아닐 경우 28일까지 존재 |
//
//		사용자에게 `월`을 입력받아 해당하는 달의 날짜 수를 출력하도록 구현하세요  
//		(단, 2월은 28일까지라고 가정합니다)
//
//		```
//		다 하신 분들은 연도를 추가하여 윤년까지 계산되도록 변경하세요
		
		//if로 풀이
		
		//입력
				int month = 4;

				//출력
				if(month == 1 || month == 3 || month == 5 
						|| month == 7 || month == 8 || month == 10 || month == 12) {
					System.out.println("31일");
				}
				else if(month == 4 || month == 6 || month == 9 || month == 11) {
					System.out.println("30일");
				}
				else {//2월
					System.out.println("28일");
				}
	}
}
		
	


