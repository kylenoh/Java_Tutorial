package lession15_OOP_Interface;

public class Main {
	public static void main(String[] args) {
		Toy robot = new robot();
		robot.alarm();
		robot.light();
		robot.move();
		robot.walk();
		
		System.out.println("----------------------");
		
		Toy airplane = new Airplane();
		airplane.alarm();
		airplane.light();
		airplane.move();
		airplane.walk();
		Toy toys[]= {robot,airplane};
		
		System.out.println("----------------------");
		
		for (int i = 0; i < toys.length; i++) {
			System.out.println("�峭������ �ּҰ��� ��µ˴ϴ�.\t"+toys[i]);
		}
	}
}
