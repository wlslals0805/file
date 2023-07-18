package api.file.string;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Test03_1 {
	public static void main(String[] args) throws IOException {
		//콘솔 메모장 프로그램
		
		Scanner sc = new Scanner(System.in);
		
		File target = new File("sample/note.kh");
		FileWriter fw = new FileWriter(target);
		BufferedWriter bw = new BufferedWriter(fw);
		
		while(true) {
			System.out.print("입력 : ");
			String line = sc.nextLine();
			if(line.equals("종료")) {
				break;
			}
			
			bw.write(line);
			bw.write("\n");
			//flush를 하면 즉시 저장이 됨
			bw.flush();
		}
		
		sc.close();
		bw.close();
	}
}








