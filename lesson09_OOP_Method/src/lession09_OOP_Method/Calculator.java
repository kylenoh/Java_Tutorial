package lession09_OOP_Method;

public class Calculator {
	
	public void showInfo() {
		System.out.println("�� ����� �Ʒ��� ���� ������մϴ�.");
		System.out.println("1.���ϱ�");
		System.out.println("2.����");
		System.out.println("3.���ϱ�");
		System.out.println("4.������");
	}
	
	public int add(int x, int y) {
		int addValue = x + y;
		return addValue;
	}
	public int minus(int x, int y) {
		int minusValue = x - y;
		return minusValue;
	}
	public int multi(int x, int y) {
		int multiValue = x * y;
		return multiValue;
	}
	public int division(int x, int y) {
		int divisionValue = x / y;
		return divisionValue;
	}
}
