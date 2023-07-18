package api.file.object;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class Test07_1 {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		
//		Player라는 클래스를 만들고 아이디, 레벨, 소지금 정보를 저장할 수 있도록 구성
//
//		프로그램을 시작하면 sample/player.kh 파일을 찾아서 다음과 같이 처리하세요
//
//		파일이 없다면 최초 실행한 것으로 간주하고 사용자에게 아이디를 입력받아 레벨 1, 소지금 0으로 생성
//		사용자에게 다음과 같은 메뉴를 반복적으로 출력
//		입력(1-정보출력/2-레벨업/3-종료) :
//		1을 입력하면 현재 플레이어의 정보를 화면에 출력
//		2를 입력하면 현재 플레이어의 레벨을 1 증가 처리
//		3을 입력하면 현재 플레이어의 정보를 sample/player.kh 파일에 저장하고 종료
		
		File target = new File("sample/player");
		Scanner sc= new Scanner(System.in);
		
		
		if(target.exists()==false) {
			
			System.out.println("첫 계정 생성. 아이디를 설정하세요");
			String name = sc.next();
			Player p =new Player(name);
			
			while(true) {
				
				System.out.println("입력(1-정보출력/2-레벨업/3-종료)");
				
				int n = sc.nextInt();
				
			
				if(n==1) {
			p.show();
				}
				else if(n==2) {
					
					p.levelUp();
					
				}
				else {
					
					System.out.println("시스템 종료");
					
					FileOutputStream stream = new FileOutputStream(target);
					BufferedOutputStream buffer = new BufferedOutputStream(stream);
					ObjectOutputStream obj = new ObjectOutputStream(buffer);
					
					obj.writeObject(p);
					
					obj.close();
					
					break;
					
				}
			}
		}
		
		else {
			FileInputStream stream1 = new FileInputStream(target);
			BufferedInputStream buffer1 = new BufferedInputStream(stream1);
			ObjectInputStream obj1 = new ObjectInputStream(buffer1);
			
			Player p = (Player) obj1.readObject();
			
				while(true) {
				
				System.out.println("입력(1-정보출력/2-레벨업/3-종료)");
				
				int n = sc.nextInt();
				
			
				if(n==1) {
			p.show();
				}
				else if(n==2) {
					
					p.levelUp();
					
				}
				else {
					
					System.out.println("시스템 종료");
					
					FileOutputStream stream = new FileOutputStream(target);
					BufferedOutputStream buffer = new BufferedOutputStream(stream);
					ObjectOutputStream obj = new ObjectOutputStream(buffer);
					
					obj.writeObject(p);
					
					obj.close();
					
					break;
					
				}
			}
			
			
			
			
		
			
		
			
			
		}
		
		
		
	}

}
