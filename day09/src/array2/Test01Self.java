package array2;

public class Test01Self {

	public static void main(String[] args) {
		int[] data=new int[] {30,50,20,10,40};

//		int s=data[0];
//		
//		for(int i=1;i<data.length;i++) {
//			
//			if(s>data[i]) {
//				
//				s=data[i];		
//			}
//		}
//		System.out.println(s);
//		
//		int backup=data[0];
//		data[0]=data[3];
//		data[3]=backup;
//		
//		System.out.println(data[0]);
//		System.out.println(data[3]);
		
		
		int sIndex=0;
		for(int i=0;i<data.length;i++) {
			
			for(int a=i;a<data.length;a++) {//a=1부터 하면 이미 최솟값으로 사용됐던 수를 다시 최솟값 취급. i로 바꾸어야함
			
				if(data[sIndex]>data[a]) {//최솟값을 찾으려면 한 번 쭉 돌려야지 같이 돌리면 안됨
				
				sIndex=a;		
//				System.out.println(sIndex);
			}
				
			}
//			System.out.println(sIndex);
			int backup=data[i];
			data[i]=data[sIndex];
//			System.out.println(data[i]);
			
			data[sIndex]=backup;}
		
			for(int i=0;i<data.length;i++) {
	System.out.println(data[i]);
	}
	}
}
