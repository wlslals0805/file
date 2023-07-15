package api.file.single2;

import java.io.File;

public class Test04 {

	public static void main(String[] args) {
		
		File a =new File("c:/study/delete.txt");
		File b =new File("sample");
		
//		FileUtil.info(a);
//		FileUtil.list(a);
//		FileUtil.delete(a);
		FileUtil.move(a, b);
		
		
		
		
	}

}
