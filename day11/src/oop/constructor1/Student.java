package oop.constructor1;

public class Student {
		
	String name;
	int score;
	
	//기본 생성자
	//-생성만 하고 아무 짓도 안 함
	//-한 개도 없으면 자동생성됨
	//-생성자가 없으면 객체생성불가
	//Student(){}
	//생성자가 없으면 객체생성이 불가능하기 때문에 클래스에는 자바가 만든 기본 생성자가 숨어있다. Student a = new /Student();/요게 기본 생성자
	
	//생성자의 이름은 클래스 이름
	//하는 일은 setup 메소드와 동일
	//생성자도 오버로딩(overloding)이 가능
	
	Student(String name){
		this.name=name;
		this.score=0;
	}
	
	Student(String name,int score){
		
		this.name=name;
		this.score=score;
	}
	
	void show() {
		
		System.out.println(name);
		System.out.println(score);
		
	}
	
	
//	Student(){
//		
//		System.out.println(name);
//		System.out.println(score);
	}
	

