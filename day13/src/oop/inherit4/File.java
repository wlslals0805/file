package oop.inherit4;

public class File {
	
//	다음 구조를 구현하고 객체를 종류별로 생성해서 모든 기능을 테스트하세요
//
//	- mp4 파일
//		- 파일 이름(filename)을 필드로 가짐
//		- 파일 크기(filesize)를 필드로 가짐
//		- 재생 속도(speed)를 필드로 가짐
//		- 실행(execute) 기능이 존재
//		- 빨리감기(forward) 기능이 존재
//		- 되감기(rewind) 기능이 존재
//	- mp3 파일
//		- 파일 이름(filename)을 필드로 가짐
//		- 파일 크기(filesize)를 필드로 가짐
//		- 재생 시간(duration)을 필드로 가짐
//		- 실행(execute) 기능이 존재
//		- 빨리감기(forward) 기능이 존재
//		- 되감기(rewind) 기능이 존재
//	- hwp 파일
//		- 파일 이름(filename)을 필드로 가짐
//		- 파일 크기(filesize)를 필드로 가짐
//		- 페이지 수(pagesize)를 필드로 가짐
//		- 실행(execute) 기능이 존재
//		- 미리보기(preview) 기능이 존재
//	- ppt 파일
//		- 파일 이름(filename)을 필드로 가짐
//		- 파일 크기(filesize)를 필드로 가짐
//		- 페이지 수(pagesize)를 필드로 가짐
//		- 실행(execute) 기능이 존재
//		- 슬라이드쇼(slideShow) 기능이 존재
//	- 모든 기능은 간단한 텍스트 메세지만 출력되면 됩니다
//	- 가급적 효율적인 상속 구조를 찾아서 구현하세요

	private String filename;
	public String getFilename() {
		return filename;
	}

	public void setFilename(String filename) {
		this.filename = filename;
	}

	public long getFilesize() {
		return filesize;
	}

	public void setFilesize(long filesize) {
		if(filesize<0L) return;
		this.filesize = filesize;
	}

	private long filesize;
	
	public void execute() {
		
		System.out.println("실행 기능");
		
	}
	
	
	
}
