package oop.inherit4;

//- 파일 이름(filename)을 필드로 가짐
//- 파일 크기(filesize)를 필드로 가짐
//- 재생 속도(speed)를 필드로 가짐
//- 실행(execute) 기능이 존재
//- 빨리감기(forward) 기능이 존재
//- 되감기(rewind) 기능이 존재
public class Mp4 extends Mp {
	
	private float speed;

	public float getSpeed() {
		return speed;
	}

	public void setSpeed(float speed) {
		this.speed = speed;
	}


}
