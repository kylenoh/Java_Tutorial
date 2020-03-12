package lession09_OOP_Method;

public class Calculator {
	
	public void showInfo() {
		System.out.println("이 계산기는 아래와 같은 기능을합니다.");
		System.out.println("1.더하기");
		System.out.println("2.빼기");
		System.out.println("3.곱하기");
		System.out.println("4.나누기");
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
