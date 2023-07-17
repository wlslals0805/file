package api.file.single2;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileUtil {
	
//	FileUtil 클래스를 만들어서 여러 가지 파일 처리 작업들을 편하게 하고 싶습니다.
//
//	다음 제시된 기능들을 메소드로 구현하세요
//
//	메소드	설명
//	copy	두 개의 파일 또는 디렉터리 정보를 전달받아 파일 복사를 진행합니다
//	list	한 개의 디렉터리 정보를 전달받아 목록을 출력합니다
//	move	두 개의 파일 또는 디렉터리 정보를 전달받아 파일 이동을 진행합니다
//	delete	한 개의 파일 또는 디렉터리 정보를 전달받아 삭제를 진행합니다
//	info	한 개의 파일 또는 디렉터리 정보를 전달받아 정보를 출력합니다
	
//	제시된 기능은 파일일 경우와 디렉터리일 경우의 처리 내용이 달라야 합니다.
//	예를 들어서 copy 기능인 경우 처리되는 방식은 다음과 같습니다.
//
//	만약 copy(a, b)에서 a와 b가 파일인 경우는 파일의 내용을 복사합니다.
//	만약 copy(a, b)에서 a와 b가 디렉터리인 경우는 디렉터리 내부의 모든 내용을 복사합니다.
//	디렉터리는 복사라는 개념이 없기 때문에 대상 위치에 신규 생성해야 처리 가능합니다
//	디렉터리 내부 구조가 아무리 복잡하더라도 동일한 구조로 복사될 수 있어야 합니다.
//	이를 재귀(recursive) 구조라고 합니다
//	복사할 때 성능을 위하여 버퍼(buffer)를 사용하는 방식으로 처리해야 합니다
	
	
	 public static void copy(File readFile,File copyFile) throws IOException {
	
		 FileInputStream readStream = new FileInputStream(readFile);
		 FileOutputStream copyStream= new FileOutputStream(copyFile); 
		 
		 byte[] buffer = new byte[100];
		 
		 
			while(true) {
				if(readFile.isDirectory()&&copyFile.isDirectory()) {
		
				String[] listName = readFile.list();
	
				for(String copyList:listName){
					File c = new File(copyFile,copyList);
						c.mkdirs();
						
					}
					
					
					
				
				}
					
					
				
				else {
				int a= readStream.read(buffer); 
				if(a==-1) {break;} 
				copyStream.write(buffer, 0, a);}
	 }
	
				
	 }
	 
	 public static void list (File file) {
		 

		 
		 String[] name = file.list();
		 
		 if(file.isDirectory()) {
		 for(String nameList:name)
			 System.out.println(nameList);}
		 else {System.out.println("디렉터리가 아닙니다.");}
		 
	 }
		 
	 
	 public static void move(File stopFile, File moveFile)  {
		 
		moveFile.renameTo(moveFile);
		 
	 }
	 
	 public static void delete(File deleteFile) {
		 
		 deleteFile.delete();
		 
	 }
	 
	 public static void info(File file) {
		 File[] listSave = file.listFiles();
		 for(File list:listSave) {
		 System.out.println(list);}
	 }
		 

	 
	 
		 
} 
	 

