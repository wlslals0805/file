package api.file.single2;

import java.io.File;
import java.io.IOException;

public class Test04 {

	public static void main(String[] args) throws IOException {
		
		File a =new File("C:\\study");
		File b =new File("c://study/sample");
		
		FileUtil.copy(a, b);
//		FileUtil.info(a);
//		FileUtil.list(a);
//		FileUtil.delete(a);
//		FileUtil.move(a, b);
//		a.mkdirs();
		
		
	}

}
