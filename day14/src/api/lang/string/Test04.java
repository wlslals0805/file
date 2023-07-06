package api.lang.string;

import java.util.Scanner;

public class Test04 {
//	사용자에게 프로그램 내에서 사용할 닉네임을 입력받도록 구현
//	단, 다음과 같은 상황일 경우 오류 메세지를 출력
//
//	닉네임이 2글자 이상 10글자 이하가 아닌 경우
//	닉네임에 운영자라는 단어가 포함된 경우
//	모든 검사를 통과했다면 닉네임 설정이 완료되었습니다라는 메세지를 출력
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
				
	System.out.println("닉네임을 입력하세요");
	String nick = sc.next();
	sc.close();

	boolean v = nick.contains("운영자");
	
	boolean pass=((nick.length()>=2&&nick.length()<=10)&&v==false);
	
	if(pass) {
	System.out.println("닉네임 설정이 완료되었습니다");}
	else {System.out.println("다시 설정하세요");}
		
		
		
	}

}
