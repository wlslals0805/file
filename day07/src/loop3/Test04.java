package loop3;

import java.util.Random;
import java.util.Scanner;

public class Test04 {

	public static void main(String[] args) {
//		업다운 게임
//
//		업다운 게임은 숫자를 맞추는 게임입니다.
//
//		1.술래가 1부터 1000 사이의 정수 중에서 랜덤으로 하나의 숫자를 정합니다.
//		2.술래가 아닌 사람이 정답을 예측합니다.
//		3.예측한 정답과 실제 정답이 같으면 게임 끝
//		4.예측한 정답과 실제 정답이 같지 않으면 업 또는 다운을 외친다
//		 	i.업을 외치는 경우는 예측한 정답보다 실제 정답이 더 큰 수 일 경우
//			ii.다운을 외치는 경우는 예측한 정답보다 실제 정답이 더 작은 수 일 경우
		
//		컴퓨터가 술래를 하고, 사용자가 정답을 맞추는 형태의 프로그램을 구현하세요.
//		정답을 맞추면 몇 번만에 맞췄는지 카운트하여 출력하시기 바랍니다.
		
		
		Scanner sc=new Scanner(System.in);
		Random r=new Random();
		int number=r.nextInt(1001)+1;
		int count=0; 
		
		while(true) {
			
			int number2=sc.nextInt();
			
			if(number==number2) {
				System.out.println("게임 끝");
				break;
				
			}
			else {
				count++;
				if(number>number2) {
					System.out.println("up");}
					else {System.out.println("down");}
					
				}
			}
		
		System.out.println(count+"번만에 정답을 맞춤");

		
		}
		
		
	}


