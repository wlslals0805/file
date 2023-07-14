package api.file.single2;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Arrays;

public class Test02_1 {

	public static void main(String[] args) throws IOException {
		//byte를 뭉탱이로 읽는 예제
				//= 크기를 얼마로 할 것인가? 일단 5개씩 읽어봅시다
				
				//<예상 시나리오>	띄어쓰기와 엔터도 포함해서 읽음
				//1회차 - 5/27
				//2회차 - 10/27
				//3회차 - 15/27
				//4회차 - 20/27
				//5회차 - 25/27
				//6회차 - 27/27
				
				//읽을 수 있는 배열 준비
				byte[] buffer = new byte[5];
				
				//파일과 스트림을 준비
				File target = new File("./sample/single2.kh");
				FileInputStream stream = new FileInputStream(target);
				
				//읽기
				while(true) {
					int size = stream.read(buffer);		//배열을 받아서 실제로 읽은 글자 '수'가 반환되는 메소드.	/하나씩 받고 출력할 때는 받은 글자가 나오고 입력됐었다.
					if(size == -1) break;	//-1이 나오면 읽은 글자가 없다는 것(=더이상 읽을 글자가 없다)
					System.out.print(size);
					System.out.print("\t");
					System.out.println(Arrays.toString(buffer));
				}
				
				stream.close();
	}

}
