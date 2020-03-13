package lession09_OOP_Method;

public class OverLoading {

	public void overLodingTest() {
		System.out.println("매개변수가 없습니다.");
	}

	public void overLodingTest(int a) {
		System.out.println("매개변수\t"+a);
	}

	public void overLodingTest(int a , double b) {
		System.out.println("매개변수\t"+a+","+"매개변수\t"+b );
	}


}
