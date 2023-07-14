package api.file.single;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileUtil {
	
	public static void copy(File readTarget,File writetarget) throws IOException {
		
		
		File target = new File("D:/origin.txt");
		FileInputStream stream = new FileInputStream(target);
		
		
		File target2 = new File("sample", "copy.txt");
		FileOutputStream stream2 = new FileOutputStream(target2);
		
		target2.createNewFile();
		

		
		while(true) {
			int a=  stream.read();
			if(a == -1) break;
			stream2.write(a);
		}
		
		
		
	}
}
