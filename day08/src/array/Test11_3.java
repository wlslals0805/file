package array;

public class Test11_3 {

	public static void main(String[] args) {
		//데이터 준비
				double[] data = new double[] {150.8, 180.2, 175.9, 162.7, 170.3};
				//double[] data = new double[] {180.2, 162.7, 175.9, 150.8, 170.3};
				
				//계산 - 탐색
				int minIndex = 0;//위치(index)는 정수(int)이다
				for(int i=1; i < data.length; i++) {
					if(data[minIndex] > data[i]) {//더 작은 데이터를 만나면
						//위치 정보를 갱신
						minIndex = i;
					}
				}
				
				System.out.println("작은 값의 위치 = " + minIndex);
				System.out.println("작은 값 = " + data[minIndex]);
	}

}
