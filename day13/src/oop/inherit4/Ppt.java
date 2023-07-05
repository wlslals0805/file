package oop.inherit4;
//- ppt 파일
//- 파일 이름(filename)을 필드로 가짐
//- 파일 크기(filesize)를 필드로 가짐
//- 페이지 수(pagesize)를 필드로 가짐
//- 실행(execute) 기능이 존재
//- 슬라이드쇼(slideShow) 기능이 존재
//- 모든 기능은 간단한 텍스트 메세지만 출력되면 됩니다
//- 가급적 효율적인 상속 구조를 찾아서 구현하세요
public class Ppt extends Word {
	

	public void slideShow() {
		
		System.out.println("슬라이드쇼 기능 실행");
	}
	
}
