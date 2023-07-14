package api.file.single2;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Arrays;

public class Test03_1 {

	public static void main(String[] args) throws IOException {
		
		File readTarget2 = new File("./sample/copy.txt");
		FileInputStream readStream2 = new FileInputStream(readTarget2);
		
		byte[] read=new byte[4];
		int a=readStream2.read(read);
		System.out.println(a);
		System.out.println(Arrays.toString(read));
		
		
	}

}
