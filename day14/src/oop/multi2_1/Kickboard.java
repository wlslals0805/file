package oop.multi2_1;


public class Kickboard implements Electronic, Transportation {
	@Override
	public void move() {
		System.out.println("킥보드 이동");
	}
	@Override
	public void on() {
		System.out.println("킥보드 전원 ON");
	}
	@Override
	public void off() {
		System.out.println("킥보드 전원 OFF");
	}
}