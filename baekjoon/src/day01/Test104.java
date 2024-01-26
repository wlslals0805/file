package day01;

public class Test104 {

	public int solution(int[][] sizes) {
	
		int maxWidth = 0;
		int maxHeight=0;
		
		for(int i=0;i<sizes.length;i++) {
			
			int width = Math.min(sizes[i][0], sizes[i][1]);
			int height = Math.max(sizes[i][0], sizes[i][1]);
			
			maxHeight = Math.max(height, maxHeight);
			maxWidth = Math.max(width, maxWidth);
			
			
		}

		return maxWidth*maxHeight;
	}

}
