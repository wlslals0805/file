package api.file.single_1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class Test03 {

	public static void main(String[] args) throws FileNotFoundException {
		//파일 복사 프로그램
		
				//준비물 : 입력용파일+스트림, 출력용파일+스트림
				File readTarget = new File("D:/origin.txt");//절대경로(absolute path)
				FileInputStream readStream = new FileInputStream(readTarget);
				
				File writeTarget = new File("./sample/copy.txt");//상대경로(relative path)
				FileOutputStream writeStream = new FileOutputStream(writeTarget);
	}

}
