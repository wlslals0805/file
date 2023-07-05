package oop.inherit4_1;
//- mp3 파일
//- 파일 이름(filename)을 필드로 가짐
//- 파일 크기(filesize)를 필드로 가짐
//- 재생 시간(duration)을 필드로 가짐
//- 실행(execute) 기능이 존재
//- 빨리감기(forward) 기능이 존재
//- 되감기(rewind) 기능이 존재
public class Mp3 extends MediaFile{
	
	private int duration;

	public int getDuration() {
		return duration;
	}
	public void setDuration(int duration) {
		this.duration = duration;
	}

}
