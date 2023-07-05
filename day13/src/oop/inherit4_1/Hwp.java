package oop.inherit4_1;
//- hwp 파일
//- 파일 이름(filename)을 필드로 가짐
//- 파일 크기(filesize)를 필드로 가짐
//- 페이지 수(pagesize)를 필드로 가짐
//- 실행(execute) 기능이 존재
//- 미리보기(preview) 기능이 존재
public class Hwp extends DocumentFile {
	
	public void preview() {
		System.out.println("미리보기 실행");
	}
}
