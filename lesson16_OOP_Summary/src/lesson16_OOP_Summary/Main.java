package lesson16_OOP_Summary;

import lesson16_OOP_Summary_class.KyleNoh;

public class Main {
	public static void main(String[] args) {
		/**
		 * kyle = kyle2�� ������ �ּҰ��� ������ �ֽ��ϴ�.
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
