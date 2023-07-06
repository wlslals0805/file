package oop.poly1;

import java.util.Scanner;

public class Test01 {

	public static void main(String[] args) {
//		노트북을 먼저 선택하세요
//		1.맥북   2.갤럭시북 : 1
	//
//		테스트할 기능을 선택하세요
//		1.전원  2.동영상재생 3.타이핑 : 2
	//
//		맥북으로 동영상을 재생합니다
		
		Scanner sc = new Scanner(System.in);
		
		GalaxyBook g = new GalaxyBook();
		MacBook m = new MacBook();
		
	
		
		
		System.out.println("노트북을 선택하세요: 1. 맥북 2.갤럭시북");
		int a=sc.nextInt();
		System.out.println("테스트할 기능을 선택하세요");
		int b=sc.nextInt();
	
		if(a==1) {
		
		if(b==1) { m.power();}
		else if(b==2) {m.video();}}
		
		if(a==2) {
			
			if(b==1) { g.power();}
			else if(b==2) {g.video();}

		}
		sc.close();
	}
	}



