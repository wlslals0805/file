package condition2;

import java.util.Scanner;

public class Test04_1 {

	public static void main(String[] args) {
//		여행사 프로모션 3
//
//		KH여행사에서 세 번째 프로모션을 진행합니다.
//		무조건 1인당 1박 10만원을 유지한 채 계절별로 다음과 같이 할인하도록 할 예정입니다.
//
//		계절	월	할인율
//		봄	3, 4, 5	20%
//		여름	6, 7, 8	10%
//		가을	9, 10, 11	30%
//		겨울	12, 1, 2	5%
//		사용자에게 필요한 정보를 입력받아 예상 경비를 구하여 출력
		
		//KH 여행사 프로모션3

				//입력
				Scanner sc = new Scanner(System.in);

				System.out.print("인원수 : ");
				int people = sc.nextInt();

				System.out.print("여행기간(일) : ");
				int days = sc.nextInt();

				System.out.print("여행예정 월 : ");
				int month = sc.nextInt();

				sc.close();

				//계산
				int total = 100000 * people * days;
				//int rate = 20 or 10 or 30 or 5;
				int rate;
				if(month == 3 || month == 4 || month == 5) {//봄
					rate = 20;
				}
				else if(month == 6 || month == 7 || month == 8) {//여름
					rate = 10;
				}
				else if(month == 9 || month == 10 || month == 11) {//가을
					rate = 30;
				}
				else {//겨울
					rate = 5;
				}

				int discount = total * rate / 100; //할인금액
				int result = total - discount; //최종경비

				//출력
				System.out.println("예상경비 : "+total+"원");
				System.out.println("할인율 : "+rate+"%");
				System.out.println("할인금액 : "+discount+"원");
				System.out.println("최종경비 : "+result+"원");
		

}
}
