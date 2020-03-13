package lession15_OOP_Interface;

public class robot implements Toy{

	@Override
	public void walk() {
		System.out.println("로봇을 걸을 수 없습니다.");
		
	}

	@Override
	public void move() {
		System.out.println("로봇은 움직 일수 없습니다.");
		
	}

	@Override
	public void alarm() {
		System.out.println("로봇은 알람기능이 있습니다");
		
	}

	@Override
	public void light() {
		System.out.println("로봇은 빛이 나오는 기능이있습니다.");
		
	}

}
