package condition;

import java.util.Scanner;

public class Test05 {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
	
		int penalty=30000;

		int km=sc.nextInt();
		
		sc.close();

		int penaltyAddKm=10;

		int addPenalty=10000;

		if(50<km){

		int exceedKm= km-50;

		int addCount=exceedKm/penaltyAddKm;

		int payPenalty=penalty+addCount*addPenalty;
		
		System.out.println("예상되는 벌금은 "+payPenalty+"원입니다.");

		}
		
		else
		{
			System.out.println("예상되는 벌금이 없습니다.");
			
		}

		
		
		}
	}