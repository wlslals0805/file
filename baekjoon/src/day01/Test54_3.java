package day01;

import java.util.ArrayList;
import java.util.Scanner;

public class Test54_3 {

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
		
		
		
		
		String e="";
		e = input;
		
		for(int i=0;i<list.size();i++) {
			if(e.contains(list.get(i))) {
			
		e = e.replace(list.get(i),"*");
			}
		}
		int result = e.length();
		
		System.out.println(result);
		
		
		
		
		
		
		}
		
		
	}


