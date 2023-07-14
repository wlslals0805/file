package api.file;

import java.io.File;

public class Test02 {

	public static void main(String[] args) {
		//사용자에게 파일 경로를 입력받아서 다음과 같이 구분하여 처리
		
//		1.입력받은 경로가 실제로 존재하지 않는 경우에는 '존재하지 않는 파일 또는 폴더'
//		2.입력받은 경로가 파일일 경우 아래의 정보를 구하여 출력
//			(1)파일의 이름
//			(2)파일의 유형(확장자)
//			(3)파일의 크기
//		3.입력받은 경로가 디렉터리일 경우 내부의 파일을 다음과 같이 출력
//			(1)파일/디렉터리 관계없이 모두 출력
//			(2)파일은 옆에 '[파일]' 표시를 추가
//			(3)디렉터리는 옆에 [폴더] 표시를 추가
		
		
		File a = new File("D:/");
		
		if(a.isFile()) {
			System.out.println("파일 이름: "+a.getName());
			System.out.println("확장자: ");
			System.out.println("파일 크기: "+a.length()+"byte");
		}	
		else if(a.isDirectory()) {
			File[] files = a.listFiles(); //파일 객체를 추출(이름 + 나머지정보)
			for(File file : files) {		
				System.out.print(file.getName());
				
				if(file.isDirectory()) {
					System.out.println("[폴더]");
				}
				else if(file.isFile()) {
					System.out.println("[파일]");
				
				}
				else {
					System.out.println("존재하지 않는 폴더");}
			}
			
			
			
		}
	}

}
