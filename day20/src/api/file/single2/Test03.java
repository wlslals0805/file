package api.file.single2;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;

public class Test03 {

	public static void main(String[] args) throws IOException {
//		기존에 만든 파일 복사 프로그램을 byte[]을 이용하여 처리하도록 변경
//
//		최적의 버퍼 크기를 찾아서 설정
//
//		배열을 이용하여 복사를 하는 경우 처리가 잘못되면 복사된 파일의 크기가 커지는 현상이 생깁니다
		
		File readTarget = new File("D:/origin.txt");
		FileInputStream readStream = new FileInputStream(readTarget);
		
		File writeTarget = new File("./sample/copy.txt");
		FileOutputStream writeStream = new FileOutputStream(writeTarget);
	
		File readTarget2 = new File("./sample/copy.txt");
		FileInputStream readStream2 = new FileInputStream(readTarget2);
		
		
		
		
		byte[] count=new byte[5];
		byte[]count2=new byte[5];
		
		readStream.read(count);
		writeStream.write(count);
		writeStream.write(count2);
		
//		System.out.println(Arrays.toString(count));
//		writeStream.write(Arrays.to);
		
		
//		while(true) {
//		readStream.read(count);
//		writeStream.write(count);
//		readStream2.read(count);
//		if(readStream2.read(count))
		
		
		
		
	}

}
