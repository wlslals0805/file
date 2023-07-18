package api.file.object;

import java.io.Serializable;

public class Account implements Serializable{
	
	String name;
	int balance;
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	
	public Account(String name) {
		this.setName(name);
		this.setBalance(0);
	}
	
	
	void show() {
		System.out.println("<계좌정보>");
		System.out.println("이름: "+this.name);
		System.out.println("잔액: "+this.balance+"원");
	}
	
	void deposit(int a) {
		
		this.balance = this.balance+a;
		System.out.println(a+"원 입금되었습니다.");
		System.out.println("남은 잔액: "+this.balance+"원");
		
	}
	void withdraw(int b) {
		
		this.balance = this.balance-b;
		System.out.println(b+"원 출금되었습니다.");
		System.out.println("남은 잔액: "+this.balance);
		
	}
	
	
	
	
	
	

}
