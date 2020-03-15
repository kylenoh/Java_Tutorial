package lesson16_OOP_Summary;

import lesson16_OOP_Summary_class.KyleNoh;

public class Main {
	public static void main(String[] args) {
		/**
		 * kyle = kyle2는 동일한 주소값을 가지고 있습니다.
		 * */
		
		KyleNoh kyle = KyleNoh.getKyle();
		kyle.print();
		System.out.println(kyle);
		
		System.out.println("------------------------");
		
		KyleNoh kyle2 = KyleNoh.getKyle();
		kyle2.print();
		System.out.println(kyle2);
	}
}
