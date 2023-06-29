package array2;

public class Test01_1 {

	public static void main(String[] args) {
		int[] data=new int[] {30,50,20,10,40};
		
		int sIndex=0;
	
		for(int i = 0; i< data.length-1;i++) {
		
			
		for(int a =i+ 1; a< data.length;a++) {
			
			if(data[sIndex]>data[a]) {			
				sIndex=a;	}}
			
		System.out.println(i+"번 째로 작은 수의 위치: "+sIndex);
		System.out.println(data[i]);
		int backup=0;
		int iBackup=sIndex;
		System.out.println("자리 저장:"+iBackup);
		System.out.println("현재"+i+"번 째 자리 값:"+data[1+1]);
		backup=data[i+1];
		System.out.println("현재"+i + "번 째 자리인 값 저장:"+backup);
		data[i+1]=data[sIndex];
		data[iBackup]=backup;

	}
		
		for(int i=0;i<data.length;i++) {System.out.println(data[i]);}
	}
}
