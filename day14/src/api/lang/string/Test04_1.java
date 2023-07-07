package api.lang.string;

import java.util.Scanner;

public class Test04_1 {

	public static void main(String[] args) {
	//닉네임 설정 문제
		
		Scanner sc = new Scanner(System.in);
		System.out.print("닉네임 입력 : ");
		String nickname = sc.next();
		sc.close();
		
		if(nickname.length() < 2 || nickname.length() > 10) {
			System.out.println("2글자 이상 10글자 이하로만 작성하세요");
		}
		else if(nickname.contains("운영자")) {
			System.out.println("운영자라는 단어는 포함할 수 없습니다");
		}
		else {
			System.out.println("닉네임 설정이 완료되었습니다");
		}
	}

}
