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

public class BankUtil {

	
	
	public static Account load() throws IOException, ClassNotFoundException{
		Scanner sc = new Scanner(System.in);
		
		Account account;
		
		File target =new File("sample/bank.kh");
		
		if(target.exists()==false) {
			
			System.out.println("처음 방문하셨습니다.");
			System.out.println("이름을 입력하세요.");
			
			String name = sc.next();
			
			account = new Account(name);
			
			
		}
		else {
			
			System.out.println("KH 은행에 오신 것을 환영합니다.");
			
			FileInputStream stream = new FileInputStream(target);
			BufferedInputStream buffer = new BufferedInputStream(stream);
			ObjectInputStream obj = new ObjectInputStream(buffer);
			
			account = (Account) obj.readObject();
			
			System.out.println(account.name+"님 환영합니다.");
			
		}
		return account;}
		
		public static void save(Account account) throws IOException {
		
			File target =new File("sample/bank.kh");
			FileOutputStream stream = new FileOutputStream(target) ;
			BufferedOutputStream buffer = new BufferedOutputStream(stream);
			ObjectOutputStream obj = new ObjectOutputStream(buffer);
			
			obj.writeObject(account);
			
			obj.close();
		}
		
		public static void play() throws ClassNotFoundException, IOException {
			Scanner sc = new Scanner(System.in);
			Account account = BankUtil.load();
			
			
			while(true) {
				
				System.out.println("입력(1-정보출력/2-입금/3-출금/0-종료)");
				int a =sc.nextInt();
				
				
				if(a==1) {
					
					account.show();
					
				}
				else if(a==2) {
					System.out.println("입금할 금액을 입력해주세요:");
					int input = sc.nextInt();
					account.deposit(input);
					
					
				}
				else if(a==3) {
					System.out.println("출금할 금액을 입력해주세요:");
					int output = sc.nextInt();
					account.withdraw(output);
				}
				else {
					
					BankUtil.save(account);
					
					System.out.println("저장완료. 프로그램을 종료합니다.");
					
					break;
				}
				
				
				
				
			}
			
			
			
			
			
			
			
			
		}
		
		
		
	
	}

