package day01;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Test48 {

	public static void main(String[] args) {
//		상수는 수를 다른 사람과 다르게 거꾸로 읽는다. 예를 들어, 734와 893을 칠판에 적었다면, 
//		상수는 이 수를 437과 398로 읽는다. 따라서, 상수는 두 수중 큰 수인 437을 큰 수라고 말할 것이다.
//
//		두 수가 주어졌을 때, 상수의 대답을 출력하는 프로그램을 작성하시오.
//
//		입력
//		첫째 줄에 상근이가 칠판에 적은 두 수 A와 B가 주어진다. 
//		두 수는 같지 않은 세 자리 수이며, 0이 포함되어 있지 않다.
//
//		출력
//		첫째 줄에 상수의 대답을 출력한다.
		
		Scanner sc =new Scanner(System.in);
		
		StringBuilder a =new StringBuilder();
		
		a.append(sc.nextLine());
		
		
		String a1= a.substring(0, 1);
		String a2= a.substring(1, 2);
		String a3= a.substring(2, 3);
		String b1= a.substring(4, 5);
		String b2= a.substring(5, 6);
		String b3= a.substring(6, 7);
		
		
		
		ArrayList<String> t =new ArrayList<>();
		
		t.add(a1);
		t.add(a2);
		t.add(a3);
		
		ArrayList<String> y =new ArrayList<>();
		y.add(b1);
		y.add(b2);
		y.add(b3);
		
		Collections.reverse(t);
		Collections.reverse(y);
		
		StringBuilder v = new StringBuilder();
		
		v.append(t.get(0));
		v.append(t.get(1));
		v.append(t.get(2));
		
		String last1 = v.toString();
		
		StringBuilder v2 = new StringBuilder();
	
		v2.append(y.get(0));
		v2.append(y.get(1));
		v2.append(y.get(2));
		
		String last2 = v2.toString();
		
		
		int result = Integer.parseInt(last1);
		int result2 = Integer.parseInt(last2);
		
if(result>result2) {
			
			System.out.println(result);
			
		}
		
		else{
			
			System.out.println(result2);
			
		}
	}

}
