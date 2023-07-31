package day01;

import java.util.ArrayList;
import java.util.Scanner;

public class Test54_2 {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
		ArrayList<String> list = new ArrayList<>();
		

		
		list.add("c=");
		list.add("c-");
		list.add("dz=");
		list.add("d-");
		list.add("lj");
		list.add("nj");
		list.add("s=");
		list.add("z=");
		
		String input = sc.next();
		
		
		for (String alphabet : list) {
		    input = input.replace(alphabet, "*"); 
		}
		
		System.out.println(input.length());
		
	}

}
