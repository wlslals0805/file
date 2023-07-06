package api.lang.test1;

import java.util.Properties;

public class Test02 {

	public static void main(String[] args) {
//		'Properties`라는 클래스를 찾아 다음 요구사항에 맞게 구현하시오
//
//		- 객체 생성
//			- `prop`이라는 이름으로 기본 객체를 생성
//		- 메소드 활용
//			- key가 `hello`, value가 `world`인 데이터를 저장
//			- key가 `good`, value가 `bye`인 데이터를 저장
//			- 생성한 객체의 요약 정보를 출력
//			- key가 `hello`인 데이터의 value를 꺼내어 출력
		
		Properties prop = new Properties();
		
		prop.setProperty("hello", "world");
		prop.setProperty("good", "bye");
		
		System.out.println(prop.toString());
		System.out.println(prop.keySet());
		System.out.println(prop.values());
//		System.out.println(prop.);
		
		
		
		
	}

}
