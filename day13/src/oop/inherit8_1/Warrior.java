package oop.inherit8_1;
public class Warrior extends Player{

	public Warrior(String id) {
		super(id);
	}

	@Override
	public void attack() {
		System.out.println("전사가 칼로 공격합니다!");
	}
	@Override
	public void move() {
		System.out.println("전사가 뛰어서 이동합니다!");
	}
	@Override
	public void store() {
		System.out.println("전사가 상점을 개설합니다!");
	}

}