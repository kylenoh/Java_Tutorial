package lession15_OOP_Interface;

public class robot implements Toy{

	@Override
	public void walk() {
		System.out.println("�κ��� ���� �� �����ϴ�.");
		
	}

	@Override
	public void move() {
		System.out.println("�κ��� ���� �ϼ� �����ϴ�.");
		
	}

	@Override
	public void alarm() {
		System.out.println("�κ��� �˶������ �ֽ��ϴ�");
		
	}

	@Override
	public void light() {
		System.out.println("�κ��� ���� ������ ������ֽ��ϴ�.");
		
	}

}
