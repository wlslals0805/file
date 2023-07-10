package api.exception;

import java.util.Scanner;

public class Test06 {

	public static void main(String[] args) {
		
//		만나이 계산기
//
//		사용자에게 생년월일을 YYYY-MM 형식으로 입력받습니다.
//		이 사용자의 한국나이와 만나이를 구하여 출력
//		만나이는 태어난 달이거나 해당 달이 지나면 1살을 추가하는 방식으로 구현
//
//		예를들어 2000년 1월 5일생이면 2000년 1월이 되면 한 살이 늘어납니다
//		처리를 하면서 문제가 되는 상황이 발생하면 상황에 맞는 에러메세지를 출력
//		예상 가능한 문제상황들은 다음과 같습니다.
//
//		입력이 너무 짧은 경우
//		숫자 변환이 올바로 되지 않는 경우 
//		생년월일을 미래의 값으로 입력하는 경우
//		월을 1~12로 입력하지 않은 경우
//		연도가 1900 미만인 경우
//		한 개의 catch 블록으로 모든 예외를 처리할 수 있도록 구현하세요
		Scanner sc = new Scanner(System.in);
	try {	
		
		String present="2023-07-10";
		
		System.out.println("생년월일을 입력하세요");
		
		String birth=sc.next();
		
		if(birth.length()<10) {
			throw new Exception("입력값이 부족합니다.");
		}
		
		
		String part1 = birth.substring(0, 4);
		String part2 = birth.substring(5, 7);
		String part3 = birth.substring(8, 10);
		
		int year = Integer.parseInt(part1);
		int month = Integer.parseInt(part2);
		int day = Integer.parseInt(part3);
		
		String part4 = present.substring(0, 4);
		String part5 = present.substring(5, 7);
		String part6 = present.substring(8, 10);
		
		int presentYear = Integer.parseInt(part4);
		int presentMonth = Integer.parseInt(part5);
		int presentDay = Integer.parseInt(part6);
	
		String a = part4+part5+part6;	//현재
		String b= part1+part2+part3;	//생년월일
		

//	if(birth.length()<10) {
//		throw new Exception("입력값이 부족합니다.");
//	}
	 if(Integer.parseInt(b)>Integer.parseInt(a)) {
		throw new Exception("미래는 입력하실 수 없습니다.");
	}
	else if(month<1||month>12) {
		throw new Exception("월은 1-12 사이로만 입력해주십시오.");
	}
	else if(year<1900) {
		throw new Exception("1900년도 이전은 입력하실 수 없습니다.");
	}

	
		
		

		
		int age=presentYear-year+1;
		
		System.out.println("한국나이는: "+age);
		int age2;
		
		if(month<=presentMonth) {
			age2=age-1;
			}
		else {age2=age-2;}
		
		System.out.println("만나이는: "+age2);
	}
	catch(Exception e){
		
			System.err.println("오류 발생");
		}

		
	}
	

		
	}


