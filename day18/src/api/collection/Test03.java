package api.collection;

import java.util.ArrayList;
import java.util.Scanner;

public class Test03 {

	public static void main(String[] args) {
		//기억력 테스트 게임
		
		//사용자에게 나라 이름을 입력받아 입력된 내용을 저장소에 저장하도록 구현
		//만약 똑같은 나라 이름을 두 번 입력 받았다면 입력을 중지하고
		//게임오버 메시지와 여태까지 입력된 나라이름 개수를 화면에 출력
		
		Scanner sc=new Scanner(System.in);
		
		ArrayList<String>list = new ArrayList<>();
		
		while(true) {
			System.out.println("나라 이름을 입력하세요.");
			String a= sc.next();
			if(list.contains(a)) {
				System.out.println("게임오버");
				System.out.println("여태까지 입력된 나라 이름은:"+list);
				System.out.println("여태까지 입력된 나라이름 개수는: "+list.size()+"개");
				break;}
			list.add(a);
		
		
		}
		
		
		
		
	}

}
