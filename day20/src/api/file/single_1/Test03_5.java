package api.file.single_1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.DecimalFormat;

public class Test03_5 {

	public static void main(String[] args) throws IOException {
		//파일 복사 프로그램
		
				//준비물 : 입력용파일+스트림, 출력용파일+스트림
				File readTarget = new File("c:/study/origin.txt");
				FileInputStream readStream = new FileInputStream(readTarget);
				
				File writeTarget = new File("sample/copy.txt");
				FileOutputStream writeStream = new FileOutputStream(writeTarget);
			
				//-1이 들어가면 그만두도록 처리
				long count = 0L;
				long total = readTarget.length();
				DecimalFormat fmt = new DecimalFormat("#,##0.00");
				
				System.out.println(total);
				
				while(true) {
					int a = readStream.read();
					if(a == -1) break;
					writeStream.write(a);
					count++;
					double percent = count * 100d / total;
					System.out.println(count + "/" + total + "("+fmt.format(percent)+"%)");
				}
				
				//정리
				readStream.close();
				writeStream.close();
	}

}
