package api.file;

import java.io.File;

public class Test04 {

	public static void main(String[] args) {
		
		//경로(Path) 
		//=PC마다 설치된 디스크 환경이 다를 수 있다
		//=D:/와 같은 절대적인 위치는 다른 PC에서 인식하지 못할 수 있다.
		//=다른 운영체제나 환경에서도 작동하는 경로를 설정하고 싶다
		
		//[1] 상대경로
		//- .은 현재 위치(current path)를 의미
		//- ..은 상위 위치(parent path)를 의미
		//[2]System 클래스 활용
		
		//[1]
//		File a=new File("sample"); 	//프로젝트 범위에서 경로를 탐색
		File a =new File("./sample");	
		a.mkdirs();
		
		File b = new File("../dummy");
		b.mkdirs();
		
		
		//[2]
		System.out.println(System.getProperty("user.home"));	//사용자 홈 폴더 읽어오기
		System.out.println(System.getProperty("user.dir"));		//프로그램 실행위치	읽어오기
		//System.getproperty=컴퓨터 정보 읽어오는 기능
		
		File c = new File(System.getProperty("user.home"), "dummy");	//홈폴더에다가 dummy 만들기
															//특정 위치(이어지지 않고 끊어지는 통로)에다가 뭘 만들고 싶을 때에는 두 개로 입력하면 된다 (/ 안 쓰고)
		c.mkdirs();
		
		
		
	}

}
