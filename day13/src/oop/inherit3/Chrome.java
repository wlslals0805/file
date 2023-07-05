package oop.inherit3;
//개발자 도구 기능이 존재해야 한다(develop)
//크롬스토어 기능이 존재해야 한다(chromeStore)
public class Chrome extends Browser {
	
	private String develop;
	private String chromeStore;
	
	public void develop() {
		
		System.out.println("개발자 도구 기능 실행");
		
	}
	
	public void chromeStore() {
		
		System.out.println("크롬스토어 기능 실행");
	}
	
	


}
