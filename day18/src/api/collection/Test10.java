package api.collection;

import java.util.ArrayList;
import java.util.Collections;

public class Test10 {

	public static void main(String[] args) {
		
		//(Test08 추가문제)
		
//		한 명의 딜러와 여러 명의 겜블러가 포커를 치려고 합니다.
//		다음 규칙에 따라 포커 카드를 분배하는 프로그램을 구현하고 구현 결과를 출력하세요.
//
//		인원수는 2~4명으로 입력하여 설정할 수 있습니다.
//		카드는 네 개의 도형(하트, 스페이드, 클로버, 다이아몬드)이 존재합니다.
//		각 도형마다 13장의 카드(A, 2, 3, 4, 5, 6, 7, 8, 9, 10, J, Q, K)가 존재합니다.
//		총 52장의 카드가 하나의 덱(deck)을 이룹니다.
//		카드를 실제로 그릴 수 없으므로 다음과 같이 표현합니다.
//		하트 A는 "하트/A"라고 표현합니다.
//		딜러는 게임이 시작되면 카드를 랜덤으로 섞습니다.
//		카드가 섞이면 플레이어에게 순서대로 카드를 한 장씩 분배합니다.
//		카드는 한 사람당 세 장씩 분배합니다.
//		네 명이라면 다음과 같이 결과가 출력되어야 합니다.
//
//		플레이어1 : [하트/A, 클로버/2, 다이아/K]
//		플레이어2 : [클로버/Q, 하트/J, 스페이드/10]
//		플레이어3 : [하트/3, 하트/5, 다이아/7]
//		플레이어4 : [다이아/J, 스페이드/Q, 하트/Q]
//		출력된 결과 옆에 다음의 경우를 분석하여 추가적으로 출력합니다.
//
//		숫자가 두 개 같으면 "원 페어"
//		숫자가 세 개 같으면 "트리플"
		
		int count =2;
		
		
		ArrayList<String> heart = new ArrayList<>();
		ArrayList<String> spade = new ArrayList<>();
		ArrayList<String> clover = new ArrayList<>();
		ArrayList<String> dia = new ArrayList<>();
		ArrayList<String> card = new ArrayList<>();
		ArrayList<String> shuffleCard = new ArrayList<>();
		
		
//		A, 2, 3, 4, 5, 6, 7, 8, 9, 10, J, Q, K
		
		card.add("A");
		card.add("2");
		card.add("3");
		card.add("4");
		card.add("5");
		card.add("6");
		card.add("7");
		card.add("8");
		card.add("9");
		card.add("10");
		card.add("J");
		card.add("Q");
		card.add("K");
		
		for(int i=0;i<card.size();i++) {
			heart.add("하트/"+card.get(i));
		}
		
		for(int i=0;i<card.size();i++) {
			spade.add("스페이드/"+card.get(i));
		}
		for(int i=0;i<card.size();i++) {
			clover.add("클로버/"+card.get(i));
		}
		for(int i=0;i<card.size();i++) {
			dia.add("다이아/"+card.get(i));
		}
		
		
		
		for(int i=0;i<13;i++) {
			
			shuffleCard.add(heart.get(i));
			
		}
	for(int i=0;i<13;i++) {
			
			shuffleCard.add(spade.get(i));
			
		}
	for(int i=0;i<13;i++) {
		
		shuffleCard.add(clover.get(i));
		
	}
	for(int i=0;i<13;i++) {
		
		shuffleCard.add(dia.get(i));
		
	}
	System.out.println(shuffleCard);	
	
		Collections.shuffle(shuffleCard);
		
		System.out.println(shuffleCard);
		
		
		ArrayList<String> player = new ArrayList<>();
		ArrayList<String> player2 = new ArrayList<>();
			
		for(int i=0;i<3;i++) {
			
			player.add(shuffleCard.get(i));
			
			
		}
		
		for(int i=3;i<6;i++) {
			
			player2.add(shuffleCard.get(i));
			
		}
		
		System.out.println(player);
		System.out.println(player2);
		
		int player1Count=0;
		
		for(int i=0;i<3;i++) {
			
			for(int a=0;a<3;a++) {
			if(player.get(i).charAt(player.get(i).length()-1)==player.get(a).charAt(player.get(a).length()-1)) {
				
				player1Count++;
				
			}}}
		
		int player2Count=0;
		
		
		
		for(int i=0;i<3;i++) {
				
			for(int a=0;a<3;a++) {
			if(player2.get(i).charAt(player2.get(i).length()-1)==player2.get(a).charAt(player2.get(a).length()-1)) {

					
				player2Count++;
					
			}}}
			
			if(player1Count==1) {
				
				System.out.println("플레이어 원: 원 페어");
	
			}
			else if(player1Count==2) {
				
				System.out.println("플레이어 원:트리플");
			}
			
		if(player2Count==1) {
				
				System.out.println("플레이어 투: 원 페어");
	
			}
			else if(player2Count==2) {
				
				System.out.println("플레이어 투:트리플");
			}
			
			
			
			
			
			
			
		}
		
		
		
		
		
		
		
		
		
		
		
		}
	
		

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	


