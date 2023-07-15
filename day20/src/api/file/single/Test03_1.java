package api.file.single;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.DecimalFormat;

public class Test03_1 {

	public static void main(String[] args) throws IOException {
		
		File readTarget = new File("c:/study/origin.txt");
		FileInputStream readStream = new FileInputStream(readTarget);
		
		File writeTarget = new File("sample/copy.txt");
		FileOutputStream writeStream = new FileOutputStream(writeTarget);
	
		int count=0;
		long total=readTarget.length();
		
		DecimalFormat f = new DecimalFormat("#,##0.00");
		
		
		while(true) {
		
		int a= readStream.read();
		if(a==-1) {break;}
		writeStream.write(a);
		count++;
		
		System.out.print(count+"/");
		System.out.print(total);
		double percent = count*100d/total;
		System.out.println("("+f.format(percent)+")");
		
		}
		
	}

}
