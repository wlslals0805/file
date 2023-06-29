package array2;

public class Test02 {

	public static void main(String[] args) {
		//버블 정렬(Bubble sort)
		//-인접한 두 항목을 비교하여 교체하며 정렬하는 방식
		//-큰 데이터가 좌측에 있으면 교체, 아니면 통과
		
//		int[] data=new int[] {30,50,20,10,40};
		int[] data=new int[] {10,20,30,50,40};
//		int[] data=new int[] {30,50,20,10,40};
		int count=0;
	while(true) {	
		for(int i=0;i<data.length-1;i++) {
			boolean a=data[i]<data[i+1];
			if(a) { count++;}
			for(int b=0;b<data.length-1;b++) {
				if(data[b]>data[b+1]) {
					
					int backup=data[b];
					data[b]=data[b+1];
					data[b+1]=backup;
					}}
			
		}
		if(count>=data.length) {
			break;
		}

		
	for(int i=0;i<data.length;i++) {
		System.out.println(data[i]);
	}
	
	
//	if(data[1]>data[2]) {
//			
//			int backup=data[1];
//			data[1]=data[2];
//			data[2]=backup;
//			
//		}
//	if(data[2]>data[3]) {
//		
//		int backup=data[2];
//		data[2]=data[3];
//		data[3]=backup;
//		
//	}
//	
//if(data[3]>data[4]) {
//		
//		int backup=data[3];
//		data[3]=data[4];
//		data[4]=backup;
//		
//	}
//
	
	}
		}
	}


	
	

