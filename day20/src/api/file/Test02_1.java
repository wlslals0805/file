package api.file;

import java.io.File;

public class Test02_1 {

	public static void main(String[] args) {
		//경로 준비
		String input = "C:\\\\study\\\\eclipse\\\\artifacts.xml";	//파일
		//String input = "D:/study";		//디렉터리
		//String input = "D:/study2";	//존재하지 않는 대상
		
		//분석을 하려면 파일 객체를 생성해야함
		File target = new File(input);
		
		if(target.isFile()) {//파일이면 이름+확장자+크기
			System.out.println("<파일 정보>");
			System.out.println("이름 : " + target.getName());
			
			//확장자는 파일의 마지막 . 뒤에 있는 값을 말하며 없을 수 있다
			//(ex) abc.def.ghi 면 확장자는 .ghi이다
			int index = target.getName().lastIndexOf(".");
			String extension;
			if(index == -1) {
				extension = "없음";
			}
			else {
				extension = target.getName().substring(index+1);
			}
			System.out.println("확장자 : "+extension);
			System.out.println("크기 : " + target.length() + " bytes");
		}
		else if(target.isDirectory()) {//디렉터리면 목록[파일/폴더] 출력
			File[] list = target.listFiles();
			for(File file : list) {
				if(file.isFile()) {//파일이면
					System.out.print("[파일] ");
				}
				else if(file.isDirectory()) {//디렉터리면
					System.out.print("[폴더] ");
				}
				System.out.println(file.getName());
			}
		}
		else {//없으면
			System.out.println("존재하지 않는 파일 또는 폴더");
		}
	}

}
