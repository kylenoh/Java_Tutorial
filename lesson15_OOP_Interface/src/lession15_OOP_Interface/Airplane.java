package lession15_OOP_Interface;

public class Airplane implements Toy{

	@Override
	public void walk() {
		System.out.println("비행기는 걸을 수 없습니다.");
		
	}

	@Override
	public void move() {
		System.out.println("비행기는 날 수 있습니다.");
		
	}

	@Override
	public void alarm() {
		System.out.println("비행기는 알람이 없습니다.");
		
	}

	@Override
	public void light() {
		System.out.println("비행기는 빛을 낼 수 없습니다.");
		
	}

}
