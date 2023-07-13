package api.collection2;

import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Test05 {

	public static void main(String[] args) {
//		철수와 영희가 올해 본 영화는 다음과 같습니다.
//
//		철수 - 범죄도시3, 늑대사냥, 드림, 퍼펙트게임
//		영희 - 파수꾼, 늑대사냥, 리바운드, 익스트랙션2, 드림
//		다음을 구하세요
//
//		철수와 영희가 둘 다 본 영화를 출력
//		철수와 영희 중 한 명만 본 영화를 출력
		
		
		Set<String> a = Set.of("범죄도시3", "늑대사냥", "드림" , "퍼펙트게임");					//철수
		Set<String> b = Set.of("파수꾼", "늑대사냥", "리바운드" , "익스트랙션2" , "드림");	//영희
		
		Set<String> union1 = new TreeSet<>();
		union1.addAll(a);
		union1.retainAll(b);
		System.out.println("철수와 영희가 둘 다 본 영화 = " + union1);
		
		Set<String> minus = new TreeSet<>();
		minus.addAll(a);
		minus.removeAll(b);
		System.out.println("철수만 본 영화 = " + minus);
		
		Set<String> minus2 = new TreeSet<>();
		minus2.addAll(b);
		minus2.removeAll(a);
		System.out.println("영희만 본 영화 = " + minus2);
		
		//set도 전체 출력이 되긴 된다
		//=확장반복(foreach)은 가능
		
		
		
		
	}

}
