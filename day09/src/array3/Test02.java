package array3;

public class Test02 {

	public static void main(String[] args) {
		//2차원 배열의 생성과 사용
		
		int[][] score = new int[2][3];
		
		//score ---> score[0] --->[0][0][0]
//					---> score[1] --->[0][0][0]
		
		//초기화
		
		score[0][1]=15;
		score[1][0]=20;
		score[1][2]=40;
		
		
		//출력
//		System.out.println(score); 			//리모컨	
//		System.out.println(score[0]);		//리모컨
//		System.out.println(score[1]);		//리모컨
	
		System.out.println(score[0][0]);
		System.out.println(score[0][1]);
		System.out.println(score[0][2]);
//		System.out.println(score[0][3]); //에러
		
		System.out.println(score[1][0]);
		System.out.println(score[1][1]);
		System.out.println(score[1][2]);
		
	}

}
