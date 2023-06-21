package data3;

public class Test02 {

	public static void main(String[] args) {
//		KH 편의점에서는 한국 나이로 20세 이상에게만 술, 담배를 팝니다  
//
//		어떤 사람의 출생년도가 2003년일 때 이 사람에게 술, 담배를
//		팔아도 되는지 판정하여 출력하세요
//
//		(한국 나이는 태어났을 때부터 1살이며, 만 나이와 다릅니다)
		
		int presentyear=2023;
		int birth=2003;
		int person=presentyear-birth;
		boolean ok= 20<=person;
		
		System.out.println(ok);
		
	}

}
