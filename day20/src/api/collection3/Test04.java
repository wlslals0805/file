package api.collection3;

import java.util.Map;
import java.util.Set;

//매개변수는 인자(입력값)을 받는 공간 매개(이어주다) 생성자와 입력값을 이어주다?
//리스트,셋 = 클래스. key와 value는 TreeSet,HashSet같은 거였고 그 두 개를 묶어둔 게 Map? Map에서 key를 다시 하나로 빼두는 게 vote.keySet();?

public class Test04 {

	public static void main(String[] args) {
		//Map의 전체출력
		//Map<String,Integer> vote = new HashMap<>();
		Map<String,Integer>vote = Map.of("아이유",5,"피카츄",2,"영탁",4,"마리오",10);
		
		//Map에서 key만 보면 Set의 형태이다.
		//->일단 key만 추출하여 출력하고, value는 그때그때 가져와서 사용
		Set<String>names = vote.keySet(); //vote의 key만 추출하라!
		
		for(String name : names) {
			int count = vote.get(name);
			System.out.println("이름="+name + ",득표수="+count);
		}
	
	
	}

}
