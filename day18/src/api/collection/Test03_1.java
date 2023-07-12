package api.collection;

import java.util.ArrayList;
import java.util.Scanner;

public class Test03_1 {

	public static void main(String[] args) {

		//저장소 생성
		ArrayList<String> history = new ArrayList<>();
		
		//입력도구 생성
		Scanner sc = new Scanner(System.in);
		
		//사용자 입력
		while(true) { 
			System.out.print("나라 이름 : ");
			String name = sc.next();
			
			//if(저장소에 이미 추가된 이름이라면) {
			if(history.contains(name)) {
				break;
			}
			else {
				history.add(name);
			}
			
		}
		
		sc.close();
		
		System.out.println("게임 오버!");
		System.out.println("총 "+history.size()+"개의 나라를 입력했습니다");
	}

}
