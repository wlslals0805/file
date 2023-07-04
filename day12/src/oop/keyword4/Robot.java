package oop.keyword4;

import java.util.Random;

public class Robot {

//	Robot이라는 이름의 클래스를 만들고 다음 기능을 메소드로 구현한 뒤 계산 수행
//
//	square라는 이름으로 제곱을 계산하는 기능을 구현하고 11²을 계산
//	triangle이라는 이름으로 삼각형의 넓이를 구하는 기능을 구현하고 밑변 3, 높이 7인 삼각형의 넓이를 계산
//	circle이라는 이름으로 원의 넓이를 구하는 기능을 구현하고 반지름이 5인 원의 넓이를 계산
//	원주율은 3.14로 계산하세요
//	sort라는 이름으로 정수 배열을 선택 정렬 할 수 있는 기능을 구현
	
	
//	[1] 제곱 계산 기능
	public static int square(int n) {
		return n * n;
	}
	public static double square(double n) {
		return n * n;
	}
	
//	[2] 삼각형 넓이 구하는 메소드
	public static float triangle(int width, int height) {
		return (float)width * height / 2;
	}
	public static double triangle(double width, double height) {
		return width * height / 2;
	}
	
//	[3] 원의 넓이를 구하는 메소드 (넓이 = 반지름 * 반지름 * 원주율)
	public static float circle(int radius) {
		//return radius * radius * 3.14f;
		//return Robot.square(radius) * 3.14f;
		return square(radius) * 3.14f;
	}
	public static double circle(double radius) {
		return square(radius) * 3.14;
	}
	
//	[4] 배열을 선택정렬하는 메소드
	public static void sort(int[] data) {
		//선택 정렬
		for(int k=0; k < data.length-1; k++) {
			int minIndex = k;//k번 위치의 값이 가장 작다고 생각
			for(int i=k+1; i < data.length; i++) {//뒤에 있는 데이터와 비교하여
				if(data[minIndex] > data[i]) {//더 작은 값이 있다면
					minIndex = i;//교체!
				}
			}
			//System.out.println("minIndex = " + minIndex);
			
			int backup = data[minIndex];
			data[minIndex] = data[k];
			data[k] = backup;
		}
	}

//	[5] 배열을 뒤집는 메소드(reverse)
	public static void reverse(int[] data) {
		int left = 0;
		int right = data.length-1;
		
		for(int i=0; i < data.length/2; i++) {
			int backup = data[left];
			data[left] = data[right];
			data[right] = backup;
			
			left++;
			right--;
		}
	}
	
//	[6] 배열을 무작위로 섞는 메소드(shuffle)
	public static void shuffle(int[] data) {
		//셔플(뒤섞기)
		//- 같은자리 제거
		//- 같은자리가 나오면 다시 뽑아라
		//- 같은자리가 나오면 하던 작업을 무효화시켜라
		Random r = new Random();
		for(int i=0; i < data.length; i++) {
			//[i] <---> [0~4]
			int index = r.nextInt(data.length);
			
			if(i == index) {//같은 자리가 나왔다면
				i--;
				continue;
			}
			
			int backup = data[i];
			data[i] = data[index];
			data[index] = backup;
		}
	}
	
//	[7] 배열을 출력하는 메소드
	public static void print(int[] data) {
		for(int i=0; i < data.length; i++) {
			System.out.print(data[i]);
			System.out.print("\t");
		}
		System.out.println();
	}
		
	}
	
	

