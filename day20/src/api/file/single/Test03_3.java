package api.file.single;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.DecimalFormat;
import java.util.concurrent.TimeUnit;

public class Test03_3 {

	public static void main(String[] args) throws IOException {
		
		File readFile = new File("C:\\study\\eclipse/eclipse.exe");
		File copyFile = new File("sample/selfCopy.txt");
		
		FileInputStream readStream = new FileInputStream(readFile);
		FileOutputStream copyStream = new FileOutputStream(copyFile);
		
		
		byte[] buffer = new byte[10000];
		
		int count = 0;
		long total = readFile.length();
		
		DecimalFormat fmt = new DecimalFormat("#,##0.00");
		
		long strat = System.currentTimeMillis();
		
		while(true) {
			
			int a= readStream.read(buffer); //만약 출력하면 배열 크기 한 줄씩 출력했을 때 몇 번(몇 글자)나 출력되었는지 나옴
			if(a==-1)/*출력한 게 없다.*/ {break;} 
			copyStream.write(buffer, 0, a/*네가 출력한 글자까지만 입력해*/);
			
			count+=a;
			
			double percent = count*100d/total;
			
			System.out.print(count+"/"+total);
			System.out.println("("+fmt.format(percent)+")%진행중");
			
			}
		
		
		long end = System.currentTimeMillis();
		
		double time =(end - strat)/1000d;
		
		System.out.println(fmt.format(time)+"초");
		
	}

}
