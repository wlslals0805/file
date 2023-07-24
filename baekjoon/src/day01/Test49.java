package day01;

import java.util.ArrayList;
import java.util.Scanner;

public class Test49 {

	public static void main(String[] args) {

//		전화를 걸고 싶은 번호가 있다면, 숫자를 하나를 누른 다음에 금속 핀이 있는 곳 까지 시계방향으로 돌려야 한다. 
//		숫자를 하나 누르면 다이얼이 처음 위치로 돌아가고, 다음 숫자를 누르려면 다이얼을 처음 위치에서 다시 돌려야 한다.
//
//		숫자 1을 걸려면 총 2초가 필요하다. 1보다 큰 수를 거는데 걸리는 시간은 이보다 더 걸리며, 한 칸 옆에 있는 숫자를 걸기 위해선 1초씩 더 걸린다.
//
//		상근이의 할머니는 전화 번호를 각 숫자에 해당하는 문자로 외운다. 
//		즉, 어떤 단어를 걸 때, 각 알파벳에 해당하는 숫자를 걸면 된다. 예를 들어, UNUCIC는 868242와 같다.
//
//		할머니가 외운 단어가 주어졌을 때, 이 전화를 걸기 위해서 필요한 최소 시간을 구하는 프로그램을 작성하시오.
//
//		입력
//		첫째 줄에 알파벳 대문자로 이루어진 단어가 주어진다. 단어의 길이는 2보다 크거나 같고, 15보다 작거나 같다.
//
//		출력
//		첫째 줄에 다이얼을 걸기 위해서 필요한 최소 시간을 출력한다.
		
		Scanner sc = new Scanner(System.in);
		
		String input = sc.next();
		String total = "";
		
		ArrayList<String> ABC = new ArrayList<>(); 
		ArrayList<String> DEF = new ArrayList<>(); 
		ArrayList<String> GHI = new ArrayList<>(); 
		ArrayList<String> JKL = new ArrayList<>(); 
		ArrayList<String> MNO = new ArrayList<>(); 
		ArrayList<String> PQRS = new ArrayList<>(); 
		ArrayList<String> TUV = new ArrayList<>(); 
		ArrayList<String> WXYZ = new ArrayList<>(); 
		
			ABC.add("A");
			ABC.add("B");
			ABC.add("C");
			DEF.add("D");
			DEF.add("E");
			DEF.add("F");
			GHI.add("G");
			GHI.add("H");
			GHI.add("I");
			JKL.add("J");
			JKL.add("K");
			JKL.add("L");
			MNO.add("M");
			MNO.add("N");
			MNO.add("O");
			PQRS.add("P");
			PQRS.add("Q");
			PQRS.add("R");
			PQRS.add("S");
			TUV.add("T");
			TUV.add("U");
			TUV.add("V");
			WXYZ.add("W");
			WXYZ.add("X");
			WXYZ.add("Y");
			WXYZ.add("Z");
		
			
		
		for(int i = 0;i<input.length();i++) {
			String a = String.valueOf(input.charAt(i));
			
			if(ABC.contains(a)) {
				total+="2";	
			}
			else if(DEF.contains(a)) {
				total+="3";	
			}
			else if(GHI.contains(a)) {
				total+="4";	
			}
			else if(JKL.contains(a)) {
				total+="5";	
			}
			else if(MNO.contains(a)) {
				total+="6";	
			}
			else if(PQRS.contains(a)) {
				total+="7";	
			}
			else if(TUV.contains(a)) {
				total+="8";	
			}
			else if(WXYZ.contains(a)) {
				total+="9";	
			}

		}
		
		int total2=0;
		for(int i = 0;i<total.length();i++) {
			
		int b = Integer.parseInt(String.valueOf(total.charAt(i)));	
		
		if(b>1) {
			b=(b-1)+2;
			
		}
		
			total2+=b;
			
		}
		System.out.println(total2);
		
		
		
		
		
	}

}
