package oop.multi2_1;

public class Drone implements Electronic, Transportation, Flyable{
	@Override
	public void fly() {
		System.out.println("드론 비행");
	}
	@Override
	public void move() {
		System.out.println("드론 이동");
	}
	@Override
	public void on() {
		System.out.println("드론 전원 ON");
	}
	@Override
	public void off() {
		System.out.println("드론 전원 OFF");
	}
}