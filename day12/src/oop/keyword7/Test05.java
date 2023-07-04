package oop.keyword7;

import java.util.Random;

public class Test05 {
	
	public static void main(String[] args) {
		//상수(constant)의 필요성?
		//(ex) 가위바위보 출력
		
		Random r = new Random();
		
		int choice = r.nextInt(3);
		//System.out.println("choice = " + choice);
		
		switch(choice) {
		case RSPGame.scissors:
			System.out.println("가위");
			break;
		case RSPGame.rock:
			System.out.println("바위");
			break;
		case RSPGame.paper:
			System.out.println("보");
			break;
		}
		
	}

}
