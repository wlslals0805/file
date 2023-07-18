package api.file.string;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Test03 {

	public static void main(String[] args) throws IOException {
		
		Scanner sc= new Scanner(System.in);
		
//		사용자가 "종료"를 입력할 때까지 작성한 모든 내용을 sample/note.kh 파일에 저장
//
//		단, 한 번의 입력은 한 줄에 저장되도록 처리
//
//		입력 예시
//		입력 : 안녕
//		입력 : 반가워
//		입력 : 잘 부탁해
//		입력 : 종료
//		파일 예시
//		안녕
//		반가워
//		잘 부탁해
		
		File directory = new File("sample");
		
		File target = new File(directory,"note.kh");
		
//		target.createNewFile();
		
		FileWriter fw = new FileWriter(target);
		BufferedWriter bw = new BufferedWriter(fw);

		while(true) {
	
			System.out.println("입력:");
			
			String input = sc.nextLine();			//띄어쓰기까지 입력받고 싶을 때
			
		 if(input.contains("종료")){
				bw.close();
				System.out.println("종료되었습니다.");
				break;
			}	
		 else {	//else를 굳이 쓰지 않고 순서를 바꿔도 가능하다. input.contains("종료")를 만났을 때 멈추는 것이 먼저 오면 bw.write(input); 하기 전에 멈춘다.
		 bw.write(input);
		 bw.write("\n");
		 //flush를 쓰면 바로바로 저장이 됨
//		 bw.flush();
		 
		 }
		 
		}
		
		
		
	}

}
