package api.collection2;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Test05_2 {

	public static void main(String[] args) {
//		철수와 영희가 올해 본 영화는 다음과 같습니다.
//
//		철수 - 범죄도시3, 늑대사냥, 드림, 퍼펙트게임
//		영희 - 파수꾼, 늑대사냥, 리바운드, 익스트랙션2, 드림
//		다음을 구하세요
//
//		철수와 영희가 둘 다 본 영화를 출력
//		철수와 영희 중 한 명만 본 영화를 출력
		
		
//		Set<String> a = new TreeSet<>();
//		Set<String> b = new TreeSet<>();
		
		Set<String> a=Set.of("범죄도시","늑대사냥","드림","퍼펙트게임");
		Set<String> b=Set.of("파수꾼","늑대사냥","리바운드","익스트랙션2","드림");
		
		
		//둘 다 본 영화 = 교집합
		
		Set<String> all = new TreeSet<>();		//데이터가 중복으로 들어오기 때문에 출력에서는 중복을 빼기 위해 Set 사용
		
		all.addAll(a);
		all.retainAll(b);	//교집합
		
		System.out.println("둘 다 본 영화: "+all);	
		
		
		
		
		
		
		List<String> one = new ArrayList<>();		//혼자만 본 영화는 중복으로 들어오지 않기에 List를 써도 된다.
		
		//혼자만 본 영화 구하는 방법 = 1. 차집합 or 2. 합집합-교집합
		
		one.addAll(a);
		one.removeAll(b);		//차집합
		
		System.out.println("철수만 본 영화: "+ one);	
		
		List<String> one2 = new ArrayList<>();
		
		one2.addAll(b);
		one2.removeAll(a);
		
		System.out.println("영희만 본 영화: "+one2);
		
		
		
		
		
		List<String> all2 = new ArrayList<>();
		
		all2.addAll(one);
		all2.addAll(one2);		
		
		System.out.println("한 명만 본 영화 총 모음 (차집합): "+all2);		//차집합+차집합
		
		
		List<String> all3 = new ArrayList<>();
		
		
		all3.addAll(a);
		all3.addAll(b);
		all3.removeAll(all);
		
		System.out.println("한 명만 본 영화 총 모음(합집합-교집합)"+all3);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
