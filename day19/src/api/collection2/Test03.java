package api.collection2;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Test03 {

	public static void main(String[] args) {
//		사용자에게 글 번호를 입력받아 해당하는 번호의 글을 좋아요 설정/해제하는 프로그램 구현
//
//		요구사항
//		사용자에게 글 번호를 정수로 입력받는다
//		사용자가 좋아요를 누른 모든 글 번호는 Set에 저장되어 있다.
//		좋아요를 누른 적이 있는 글 번호가 입력될 경우 ?번 글에 좋아요를 취소했습니다 출력 후 저장소에서 번호를 제거한다
//		좋아요를 누른 적이 없는 글 번호가 입력될 경우 ?번 글에 좋아요를 눌렀습니다 출력 후 저장소에 번호를 추가한다
//		반복적으로 사용자에게 글 번호를 입력받아 위의 작업을 처리한다
//		만약에 사용자가 0 이하의 숫자를 입력한다면 프로그램을 중지하고 현재까지 좋아요를 설정한 글 번호를 화면에 출력한다
		

		Scanner sc=new Scanner(System.in);
		
		Set<Integer> number =new TreeSet<>();
		

		
		while(true) {
			System.out.println("좋아요를 누를 혹을 취소할 글 번호를 선택하세요.");
			int input = sc.nextInt();
				
			if(input<1) {
				System.out.print("프로그램 중지. 현재까지 좋아요를 누른 글 번호는: ");
				System.out.println(number);
				break;
			}
		
			else if(!number.contains(input)) {
		number.add(input);
		System.out.println(input+"번 글에 좋아요를 눌렀습니다");
		}
		else if(number.contains(input)) {
			number.remove(input);	
			System.out.println(input+"번 글에 좋아요를 취소했습니다.");
		}
		
		
		}
		
	}

}
