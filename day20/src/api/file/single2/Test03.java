package api.file.single2;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.DecimalFormat;

public class Test03 {

	public static void main(String[] args) throws IOException {
<<<<<<< HEAD
		
		
		
		
		File readFile = new File("D:\\study\\eclipse/eclipse.exe");
		File copyFile = new File("sample/test.txt");
		
		FileInputStream readStream = new FileInputStream(readFile);
		FileOutputStream copyStream = new FileOutputStream(copyFile);
		
		byte[] buffer = new byte[100000]; //시간을 재 본 결과 가장 빨랐습니다. 0.00초
		
		int count = 0;
		long total = readFile.length();
		
		DecimalFormat fmt = new DecimalFormat("#,##0.00");
		
		long strat = System.currentTimeMillis();
=======
//		기존에 만든 파일 복사 프로그램을 byte[]을 이용하여 처리하도록 변경
//
//		최적의 버퍼 크기를 찾아서 설정
//
//		배열을 이용하여 복사를 하는 경우 처리가 잘못되면 복사된 파일의 크기가 커지는 현상이 생깁니다
		
		File readTarget = new File("c:/study/origin.txt");
		FileInputStream readStream = new FileInputStream(readTarget);
		
		File writeTarget = new File("./sample/copy.txt");
		FileOutputStream writeStream = new FileOutputStream(writeTarget);
		
		
		byte[] buffer=new byte[100];
		
		while(true) {
		int a= readStream.read(buffer);	//식을 쓴 것만으로도 메소드가 실행되기 때문에 이런 식은 한 번만 써줘야 한다.
		if(a==-1)	{break;}	//근데 왜 식을 중복해서 쓰면 한글이 깨질까? 그냥 그만큼 더 나와야되는 거 아닌가?
		writeStream.write(buffer, 0, a);
		System.out.println(a);
		System.out.println(Arrays.toString(buffer));
		}
		

	
>>>>>>> branch 'main' of https://github.com/wlslals0805/file.git
		
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