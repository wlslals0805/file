package day01;

public class Test97 {

//	두 수를 입력받아 두 수의 최대공약수와 최소공배수를 반환하는 함수, solution을 완성해 보세요. 
//	배열의 맨 앞에 최대공약수, 그다음 최소공배수를 넣어 반환하면 됩니다. 
//	예를 들어 두 수 3, 12의 최대공약수는 3, 
//	최소공배수는 12이므로 solution(3, 12)는 [3, 12]를 반환해야 합니다.

	public static void main(String[] args) {

		System.out.println(solution(3, 12)[0]);
	}

	public static int[] solution(int n, int m) {
		int[] answer = new int[2];

		int s = Math.min(n, m);
		int b = Math.max(n, m);

		for (int i = b; i > 0; i--) {

			if (b % i == 0) {

				for (int a = s; a > 0; a--) {

					if(s%a==0&&a==i) {
						
						
						answer[0]=i;
						break;
					}
					
				}
			}
			
			if(answer[0]!=0) {
				break;
			}
			
		}
		
		int num = 1;
		while(true) {

			for(int i=0;i<=num;i++) {
				
				if(s*num==b*i) {
					answer[1]=b*i;
					break;
				}
				
			}
			
			num++;
			
			if(answer[1]!=0) {
				break;
			}
			
			
		}
		

		return answer;
	}

}
