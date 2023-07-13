package api.collection3;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Test03 {

	public static void main(String[] args) {
		
//		투표 프로그램
//
//		요즘 유행하는 TV 경연 프로그램들처럼 사용자에게 투표할 이름을 입력받아 투표를 처리하는 프로그램을 만드세요
//
//		이름과 투표수를 Map에 저장하여 프로그램을 구현합니다.
//		한 번도 입력한 적이 없는 이름이 입력되면 1표를 획득한 상태로 저장합니다
//		한 번이라도 입력한 적이 있는 이름이 입력되면 투표 수를 증가시킵니다.
//		투표가 완료되면 사용자에게 방금 투표한 사람이 현재 몇 표를 획득하였는지 출력합니다.
//		이름에 종료라는 글자가 입력되면 투표 프로그램을 종료하고 모든 값을 출력합니다.
		
//		이름 입력 : 피카츄
//		[피카츄] 현재 1표 획득!
		
//		이름 입력 : 라이츄
//		[라이츄] 현재 1표 획득!
//
//		이름 입력 : 피카츄
//		[피카츄] 현재 2표 획득!
//
//		이름 입력 : 피카츄
//		[피카츄] 현재 3표 획득!
//
//		이름 입력 : 라이츄
//		[라이츄] 현재 2표 획득!
//
//		이름 입력 : 종료
//
//		프로그램을 종료합니다.
//
//		{피카츄=3, 라이츄=2}
		
		
		Map<String,Integer> vote = new TreeMap<>();
		
		Scanner sc=new Scanner(System.in);
		
		
		
		
		
		while(true) {
			System.out.println("투표할 사람의 이름을 입력하세요");
			
			String name = sc.next();
		
		if(name.contains("종료"))	{
			System.out.println("프로그램을 종료합니다.");
			System.out.println(vote);
			break;
		}
		
		else if(vote.containsKey(name)) {
			
			vote.put(name, vote.get(name)+1);
			System.out.println(name+vote.get(name)+"표 획득");
			
		}
		else {
			vote.put(name, 1);
			System.out.println(name+" 첫 투표 획득");
		}
		
		}
		
		
		
		
		
		
		
		
		
		
	}

}
