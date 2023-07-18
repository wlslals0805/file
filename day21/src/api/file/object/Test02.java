package api.file.object;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class Test02 {

	public static void main(String[] args) throws IOException {
		//이번 주 로또 번호를 예상한 결과를 'sample/lotto.kh' 파일에 객체 출력
		
//		/day19/src/api/collection2/Test02_1.java
		
	
		Random r = new Random();
		
		
		Set<Integer> lotto = new TreeSet();
		
		while(lotto.size()<6) {
			
			lotto.add(r.nextInt(45)+1);
			
		}
		
		
		
		
		File copy = new File("sample/lotto.kh");
		
		FileOutputStream stream = new FileOutputStream(copy);
		BufferedOutputStream buffer = new BufferedOutputStream(stream);
		ObjectOutputStream obj = new ObjectOutputStream(buffer);	
		
		obj.writeObject(lotto);
		
		obj.close();
		
		
		
		
		
	}

}
