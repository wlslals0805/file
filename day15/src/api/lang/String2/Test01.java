package api.lang.String2;

public class Test01 {

	public static void main(String[] args) {
		//문자열의 구체적인 검사
		
		String name= "홍길동";
		
		//(Q) 올바른 이름 형식인가요?
//		[1] 모든 글자는 한글로 이루어져 있어야 한다
//		[2]이름은 2~7글자로 이루어져 있어야 한다
		
		

		boolean condition2=name.length() >=2 && name.length()<=7;
		
		int count = name.length();
		
		
		for(int i=0;i<count;i++) {
			
			if( name.charAt(i)>='가' && name.charAt(i)<= '힣') {
				boolean condition1 = ( name.charAt(i)>='가' && name.charAt(i)<= '힣');
		
	
	
		
		if(condition1&&condition2) {
			System.out.println("정확한 이름입니다");
		}}
		}
	}
}
		
		
	

		
	
		
		
		
	

