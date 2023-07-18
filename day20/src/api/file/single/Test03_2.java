package api.file.single;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.DecimalFormat;

public class Test03_2 {

	public static void main(String[] args) throws IOException {
		File readFile = new File("c:/study/origin.txt");
		File copyFile=new File("sample/selfCopy2.txt");

		FileInputStream readStream = new FileInputStream(readFile);
		FileOutputStream writeStream = new FileOutputStream(copyFile);
		
		int count = 0;
		long total = readFile.length();	
		//length = 크기. 파일의 크기 = 글자수 = int로는 부족할 수 있다. = long을 써야함
		
		
		DecimalFormat fmt = new DecimalFormat("#,##0.00");
		
		while(true) {
			int code = readStream.read(); 
			if(code==-1) {break;}
			writeStream.write(code);
			count++; 
			//한 번 읽고 copy 파일에 복사(입력)할 때마다 +1적립. 
			//즉, 글자수가 한 자씩 입력될 때마다 1씩 적립되는 값(count) 
			//= 한 자 한 자 진행되는 복붙에서 진행도나 다름없다.
			
			double percent = count * 100d / total;
			
			System.out.print("현재 복사된 글자 수:"+count);
			System.out.print("/총 입력되어야 하는 글자 수:"+total);
			System.out.println("("+fmt.format(percent)+")% 진행됨");
		
			}
			

		
	}

}
