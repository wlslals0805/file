package array2;

public class Test01 {

	public static void main(String[] args) {
		//정렬(sort)
		//-여러 개의 데이터를 원하는 목적에 맞게 나열하는 것
		//-번호순, 이름순,가격순,랭킹순,성적순,최신순, ...<-정렬
		//-번호순이라고 하면 번호가 낮은 것부터 나와야 한다.(오름차순)
		//-성적순이라고 하면 성적이 높은 것부터 나와야 한다.(내림차순)
		//-정렬 방법은 여러가지가 있으며 상황에 따라 성능이 다르다
		//-사용자에게 데이터를 효과적으로 보여주기 위한 수단
		
		//-데이터 준비
		int[] data=new int[] {30,50,20,10,40};
		
		int sIndex=0;
	
		for(int i=0;i<data.length;i++) {
			if(data[sIndex]>data[i]) {			
				sIndex=i;	
			}}
		
			System.out.println("제일 작은 수의 위치: "+sIndex);
			
			System.out.println(data[0]);
			int backup=0;
			int iBackup=sIndex;
			System.out.println("자리 저장:"+iBackup);
			backup=data[0];
			System.out.println("현재 맨 앞자리인 값 저장:"+backup);
			data[0]=data[sIndex];
			data[iBackup]=backup;
			
			
//		for(int i=0;i<data.length;i++) {System.out.println(data[i]);}
			for(int i=1;i<data.length;i++) {
				if(data[sIndex]>data[i]) {			
					sIndex=i;	
				}}
			
			System.out.println("두번째로 작은 수의 위치: "+sIndex);
			System.out.println(data[0]);
			int backup1=0;
			int iBackup1=sIndex;
			System.out.println("자리 저장:"+iBackup1);
			System.out.println("현재 두번째 자리 값:"+data[1]);
			backup1=data[1];
			System.out.println("현재 두번째 자리인 값 저장:"+backup1);
			data[1]=data[sIndex];
			data[iBackup1]=backup1;

			for(int i=0;i<data.length;i++) {System.out.println(data[i]);}
			
			for(int i=2;i<data.length;i++) {
				if(data[sIndex]>data[i]) {			
					sIndex=i;	
				}}

			System.out.println("세번째로 작은 수의 위치: "+sIndex);
			System.out.println(data[1]);
			int backup2=0;
			int iBackup2=sIndex;
			System.out.println("자리 저장:"+iBackup2);
			System.out.println("세번째 자리 값:"+data[2]);
			backup2=data[2];
			System.out.println("현재 세번째 자리인 값 저장:"+backup2);
			data[2]=data[sIndex];
			data[iBackup2]=backup2;
			for(int i=0;i<data.length;i++) {System.out.println(data[i]);}
			

			for(int i=3;i<data.length;i++) {
				if(data[sIndex]>data[i]) {			
					sIndex=i;	
				}}


			System.out.println("네번째로 작은 수의 위치: "+sIndex);
			System.out.println(data[2]);
			int backup3=0;
			int iBackup3=sIndex;
			System.out.println("자리 저장:"+iBackup3);
			System.out.println("세번째 자리 값:"+data[3]);
			backup3=data[3];
			System.out.println("현재 세번째 자리인 값 저장:"+backup3);
			data[3]=data[sIndex];
			data[iBackup3]=backup3;
			for(int i=0;i<data.length;i++) {System.out.println(data[i]);}
			
	}

}
