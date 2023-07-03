package condition3;

import java.util.Scanner;

public class Test04_2 {

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
		
		//switch로 풀이(Java 13↑)

				//입력
				int year = 2004;
				int month = 2;

				//계산
				//int days = 31 or 30 or 28;
				int days;
				switch(month) {
				case 1, 3, 5, 7, 8, 10, 12:
					days = 31;
					break;
				case 4, 6, 9, 11:
					days = 30;
					break;
				//case 2:
				default:
					boolean leapYear = year % 400 == 0 ||  year % 4 == 0 && year % 100 != 0;
					if(leapYear) {
						days = 29;
					}
					else {
						days = 28;
					}
					break;
				}

				//출력
				System.out.println(days+"일");

				}
		}
		
	


