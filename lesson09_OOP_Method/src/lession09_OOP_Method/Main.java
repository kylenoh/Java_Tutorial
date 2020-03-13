package lession09_OOP_Method;

public class Main {
	public static void main(String[] args) {
/**
 * 		Method란?
 * 		기능을 수행할 수 있도록 만든 집합체
 * */
		
		Calculator calculate = new Calculator();	//객체 생성
		//return이 없는 Method
		calculate.showInfo();						
		System.out.println("-------------------------------------");
		//return이 있는 Method
		System.out.println("더하기:\t"+calculate.add(20, 10));
		System.out.println("빼기:\t"+calculate.minus(20, 10));
		System.out.println("곱하기:\t"+calculate.multi(20, 10));
		System.out.println("나누기:\t"+calculate.division(20, 10));
		System.out.println("-------------------------------------");
		//OverLoading Test
		OverLoading overLoading = new OverLoading();
		overLoading.overLodingTest();
		overLoading.overLodingTest(100);
		overLoading.overLodingTest(100,100);
		
	}
}
