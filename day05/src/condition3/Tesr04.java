package condition3;

import java.util.Scanner;

public class Tesr04 {

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
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("년도를 입력하세요");
		int year=sc.nextInt();
		
		boolean leapYear=(year%4==0 && (year%100!=0 || year%400==0)) ||  year%400==0;
		
		
		System.out.println("달을 입력하세요");
		int month=sc.nextInt();

		
		switch(month) {
		
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			System.out.println("31일");
			break;
			
		case 4:
		case 6:
		case 9:
		case 11:
			System.out.println("30일");
			break;
			
			default:
				if(leapYear) {
					System.out.println("29일");
				}
				else {
					System.out.println("28일");
				}
				}
				}
		}
		
	


