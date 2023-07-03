package oop.constructor2;

public class Music {
//	다음 데이터를 요구사항에 맞게 구조화하고 출력하세요
//
//	음원차트
//	제목									가수				앨범							재생수		좋아요 수
//	그때 그 순간 그대로(그그그)	WSG워너비		WSG워너비 1집			104250		91835
//	보고싶었어							WSG워너비		WSG워너비 1집			83127		90805
//	LOVE DIVE							IVE(아이브)		LOVE DIVE					64590		174519
//	POP!									나연(TWICE)	IM NAYEON				58826		70313
	
//	요구사항
//	노래 제목, 가수, 앨범 정보는 반드시 설정되어야 합니다.
//	재생 수와 좋아요 수는 0 이상으로만 설정이 가능합니다.
//	재생 수가 10만이 넘어가면 제목 옆에 (베스트) 라고 출력하세요
//	좋아요 수가 10만이 넘어가면 제목 옆에 (인기곡)이라고 출력하세요
//	차트 랭킹 계산 공식이 다음과 같을 때 랭킹 포인트를 추가로 구하여 출력하세요
//	랭킹 점수 = 재생수 * 2 + 좋아요수 / 2

	
	String title;
	String name;
	String m;
	int play;
	int good;
	
	
	String getBest() {
		if(this.play>100000) {
			return "(베스트)";
		}
		else {
			return "";
		}
	}
	
	String getHot() {
		if(this.good>100000) {
			return "(인기곡)";
		}
		else {
			return "";
		}
	}
		
		
	Music(String title,String name,String m,int play,int good){
		
		
		this.title=title;	
		this.name=name;
		this.m=m;
		if(play>=0) {
		this.play=play;}
		if(good>=0) {
		this.good=good;}
	}
	
	int getRangking() {
		return this.play*2+good/2;
	}
	
	void show() {
		
		System.out.println("제목: "+this.title);
//		if(play>100000) {System.out.println("(베스트)");}
//		else {System.out.println();
//		}
//		if(good>100000) {System.out.println("(인기곡)");}
		System.out.println("가수: "+this.name+getBest()+getHot());
		System.out.println("앨범: "+this.m);
		System.out.println("재생 수: "+this.play);
		System.out.println("좋아요 수: "+this.good);
		System.out.println("랭킹 점수: "+getRangking());
		System.out.println();
	}
	
	
}
