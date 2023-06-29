package array3;

public class Test03 {

	public static void main(String[] args) {
		
//		다음 데이터를 2차원 배열에 저장하고 출력
//
//		- `1.5f`, `2.5f`, `3.6f`
//		- `10.2f`, `5.3f`, `6.5f`

		
		float [][] score=new float[2][3];
		
		score[0][0]=1.5f;
		score[0][1]=2.5f;
		score[0][2]=3.6f;
		score[1][0]=10.2f;
		score[1][1]=5.3f;
		score[1][2]=6.5f;
		
		for(int a=0;a<score.length;a++) {
		
		for(int i=0;i<score[a].length;i++) {
			System.out.println(score[a][i]);
		}}
		
//		System.out.println(score[0][0]);
//		System.out.println(score[0][1]);
//		System.out.println(score[0][2]);
//		System.out.println(score[1][0]);
//		System.out.println(score[1][1]);
//		System.out.println(score[1][2]);
		
		
	
		
		
	}

}
