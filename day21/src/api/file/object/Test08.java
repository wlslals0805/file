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

public class Test08 {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		File target = new File("sample/bank.kh");
		Scanner sc = new Scanner(System.in);
		
		
		if(target.exists()==false) {
			System.out.println("처음 오셨습니다.");
			System.out.println("이름 입력: ");
			String name = sc.next();
			Account a = new Account(name);
			
			while(true) {
				
			
			System.out.println("입력(1-정보출력/2-입금/3-출금/0-종료)");
			int n = sc.nextInt();
			
			if(n==1) {
				a.show();
			}
			else if(n==2) {
				System.out.println("입금할 금액 입력 :");
				int in = sc.nextInt();
				
			a.deposit(in);
			}
			else if(n==3) {
				System.out.println("출금할 금액 입력: ");
				int out = sc.nextInt();
				a.withdraw(out);
			}
			else {
				
				
				FileOutputStream stream = new FileOutputStream(target);
				BufferedOutputStream buffer = new BufferedOutputStream(stream);
				ObjectOutputStream obj = new ObjectOutputStream(buffer);
				
				obj.writeObject(a);
				
				obj.close();
				System.out.println("저장이 완료되었습니다. 시스템 종료");
				
				break; 
				
			}
			}
			}
		
		else {
			System.out.println("KH은행에 오신 것을 환영합니다.");
			FileInputStream stream = new FileInputStream(target);
			BufferedInputStream buffer = new BufferedInputStream(stream);
			ObjectInputStream obj = new ObjectInputStream(buffer);
			
			Account a = (Account) obj.readObject();
			
			System.out.println(a.name+"님 환영합니다.");
		
			while(true) {
				
				System.out.println("입력(1-정보출력/2-입금/3-출금/0-종료)");
				int n = sc.nextInt();
				
				if(n==1) {
					a.show();
				}
				else if(n==2) {
					System.out.println("입금할 금액 입력 :");
					int in = sc.nextInt();
				a.deposit(in);
				}
				else if(n==3) {
					System.out.println("출금할 금액 입력: ");
					int out = sc.nextInt();
					a.withdraw(out);
				}
				else {
					System.out.println("저장이 완료되었습니다. 시스템 종료");
					FileOutputStream stream1 = new FileOutputStream(target);
					BufferedOutputStream buffer1 = new BufferedOutputStream(stream1);
					ObjectOutputStream obj1 = new ObjectOutputStream(buffer1);
					
					obj1.writeObject(a);
					
					obj1.close();
					
					break; 
					
				}
				}
		
		}
	
	}

}
