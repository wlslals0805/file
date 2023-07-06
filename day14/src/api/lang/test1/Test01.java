package api.lang.test1;

public class Test01 {
	
	public static void main(String[] args) {
//	StringBuffer라는 클래스를 찾아 다음 요구사항에 맞게 구현하시오
//
//	객체 생성
//	a라는 이름으로 용량이 10인 객체를 생성하세요
//	b라는 이름으로 hello라는 글자가 저장된 객체를 생성하세요
//	메소드 활용
//	a 객체에 KH정보교육원이라는 글자를 추가
//	각 객체에 대한 요약본을 출력
//	각 객체에 설정된 용량을 확인할 수 있는 메소드를 찾아 결과 출력
//	각 객체에 저장된 글자수를 구하여 출력
//	b 객체의 글자 순서를 뒤집어서 출력
	
	StringBuffer a =new StringBuffer(10);
	StringBuffer b=new StringBuffer("hello");
	
	
	a.append("KH정보교육원");
	System.out.println(a.toString());
	System.out.println(b.toString());
	System.out.println(a.capacity());
	System.out.println(b.capacity());
	System.out.println(a.length());
	System.out.println(b.length());
	System.out.println(b.reverse());
	
	}
}
