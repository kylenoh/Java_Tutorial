package lession13_OOP_Encapsulation;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
			Dog dog = new Dog("�ǻ�", 3);
			
			Scanner keyBoard = new Scanner(System.in);
			System.out.print("���� : ");
			int a = keyBoard.nextInt();
			//d.age = a;
			dog.setAge(a);
			
			dog.print();
			
			keyBoard.close();
		
		
	}
}
