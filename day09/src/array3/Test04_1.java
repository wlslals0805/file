package array3;

public class Test04_1 {

	public static void main(String[] args) {
		//String[][] subject = new String[2][3];
				String[][] subject = new String[][] {
					{"자바", "스프링", "안드로이드"},
					{"파이썬", "판다스", "장고"}
				};

				//subject	-->	subject[0]		-->	[ "자바" ][ "스프링" ][ "안드로이드" ]
				//				-->	subject[1]		-->	[ "파이썬" ][ "판다스" ][ "장고" ]
				for(int i=0; i < subject.length; i++) {
					for(int k=0; k < subject[i].length; k++) {
						System.out.print(subject[i][k]);
						System.out.print("\t");
					}
					//System.out.print("\n");
					System.out.println();
				}
	}

}
