package api.file.single2;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.DecimalFormat;

public class Test03 {

	public static void main(String[] args) throws IOException {
		
		
		
		
		File readFile = new File("D:\\study\\eclipse/eclipse.exe");
		File copyFile = new File("sample/test.txt");
		
		FileInputStream readStream = new FileInputStream(readFile);
		FileOutputStream copyStream = new FileOutputStream(copyFile);
		
		byte[] buffer = new byte[100000]; //시간을 재 본 결과 가장 빨랐습니다. 0.00초
		
		int count = 0;
		long total = readFile.length();
		
		DecimalFormat fmt = new DecimalFormat("#,##0.00");
		
		long strat = System.currentTimeMillis();
		
		while(true) {
			
			int a= readStream.read(buffer); 
			if(a==-1){break;} 
			copyStream.write(buffer, 0, a);
			
			count+=a;
			
			double percent = count*100d/total;
			
			System.out.print(count+"/"+total);
			System.out.println("("+fmt.format(percent)+")%진행중");
			
			}
		
		DecimalFormat fmt2 = new DecimalFormat("#,##0.00");
		
		long end = System.currentTimeMillis();
		
		double time = (end - strat)/1000d;
		
		System.out.println(fmt2.format(time)+"초");
		
	}

}