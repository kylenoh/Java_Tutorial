package lession15_OOP_Interface;

public class Airplane implements Toy{

	@Override
	public void walk() {
		System.out.println("������ ���� �� �����ϴ�.");
		
	}

	@Override
	public void move() {
		System.out.println("������ �� �� �ֽ��ϴ�.");
		
	}

	@Override
	public void alarm() {
		System.out.println("������ �˶��� �����ϴ�.");
		
	}

	@Override
	public void light() {
		System.out.println("������ ���� �� �� �����ϴ�.");
		
	}

}
