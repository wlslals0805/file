package api.file.single;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Test03 {

	public static void main(String[] args) throws IOException {
	
//		D:/에 origin.txt라는 이름으로 파일을 만들고 다음 내용을 작성
//
//		내가 그린 기린 그림은 목이 긴 기린 그린 그림이고, 
//		네가 그린 기린 그림은 목이 안 긴 기린 그린 그림이다
//		앞 집 팥죽은 붉은 팥 풋팥죽이고 , 
//		뒷집 콩죽은 햇콩단콩 콩죽,
//		우리집 깨죽은 검은깨 깨죽인데 사람들은 
//		햇콩 단콩 콩죽 깨죽 죽먹기를 싫어하더라.
//		달공달공깨끗한콩은어떠냐깐깐한알콩알콩알콩알콩달콩달콩달콩달콩은어떠냐
		
//		저장한 파일을 복사해서 프로젝트 내에 sample 폴더에 copy.txt라는 이름으로 저장
		
		File target = new File("D:/origin.txt");
		FileInputStream stream = new FileInputStream(target);
		
		
		File target2 = new File("sample", "copy.txt");
		FileOutputStream stream2 = new FileOutputStream(target2);
		
		target2.createNewFile();
		

		
		while(true) {
			int a=  stream.read();
			if(a == -1) break;
			stream2.write(a);
			System.out.println(a);
		}
		
		
		
		
	}
		
	}


