package condition2;

public class Test01 {
	
	public static void main(String[] args) {
		
		//그룹 조건
		//-3가지 이상 중 하나의 경우를 선택하여 실행하는 상황
		
		//-7시 이전에 일어나면 오래 걸리지만 앉아서 올 수 있는 버스를 탑승
		//-8시에 일어나면 환승은 해야하지만 비교적 빠른 지하철을 탑승
		//-9시에 일어나면 무조건 택시를 타야한다
		
		int hour = 7;
		
		if(hour<=7) { 
			System.out.println("버스 도착 시간을 알아봐줄게");
			
		}
		else { 
			if(hour<=8) {
				System.out.println("지하철 시간을 알아봐줄게");
				
			}
			else {
				if(hour<=9) {
					System.out.println("택시를 불러줄게");
				}
				else {

					System.out.println("끝났어 그냥 천천히 가");
					
				}
			}
			
		
		}
		
	}
	

}
