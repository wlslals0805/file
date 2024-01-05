package day01;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Test79_3 {
	
//	설명
//
//	자연수 N이 입력되면 1부터 N까지의 소수의 개수를 출력하는 프로그램을 작성하세요.
//
//	만약 20이 입력되면 1부터 20까지의 소수는 2, 3, 5, 7, 11, 13, 17, 19로 총 8개입니다.
//
//
//	입력
//	첫 줄에 자연수의 개수 N(2<=N<=200,000)이 주어집니다.
//
//
//	출력
//	첫 줄에 소수의 개수를 출력합니다.
	
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int num  = sc.nextInt();
		
		int[] list = new int[num];
		
		for(int i=1;i<=list.length;i++) {
			
			list[i-1] = i;
		}
		
		System.out.println(solution(list));
		
	}
	
	static int solution(int[] input) {

		Set<Integer> list = new TreeSet<Integer>();
		
		for(int i=1;i<input.length;i++) {
			int tmp = input[i]*2;
			
			for(int a=i+1;a<input.length;a++) {
					if(tmp==input[a]) {
						list.add(input[a]);
						tmp+=input[i];//tmp와 input[a]가 일치해야 한 번 더 곱해진다. 
						//6같은 경우에는 3의 배수로서 9가 3의 배수가 되어 1이 되기 위해선 6을 거치고 가야한다.
						//그런데 6은 앞선 2의 배수여서 이미 1이 되어버렸다. 그래서 3이 6을 밟고 넘어가지 못해 9를 만나지 못했다.
						//그래서 9가 3을 약수로 가지고 있음에도 소수가 아닌 수로 판정이 나지 않았다.
						
					}
					
			}

			
		}
		
		
		int result = input.length - list.size()-1;
		
		return result;
	}

}
