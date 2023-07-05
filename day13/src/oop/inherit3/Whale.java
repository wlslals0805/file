package oop.inherit3;
//파파고 번역 기능이 존재해야 한다(papago)
//네이버 검색 기능이 존재해야 한다(naverSearch)
public class Whale extends Browser {
	private String papapgo;
	private String naverSearch;
 
	public void papago() {
		
		System.out.println("파파고 번역 기능 실행");
	}
	public void naverSearch() {
		
		System.out.println("네이버 검색 기능 실행");
	}
	
}
