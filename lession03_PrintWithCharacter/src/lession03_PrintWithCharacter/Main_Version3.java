package lession03_PrintWithCharacter;

import java.util.Scanner;

public class Main_Version3 {
	public static void main(String[] args) {
		// �ܼ�â�� Ű���� �Է� ���� �غ�
		Scanner keyboard = new Scanner(System.in);
		
		// ��ǰ��(String)�� �Է¹޾Ƽ� �ӽ� ����
		System.out.print("��ǰ�� : ");
		String name = keyboard.next(); // String��
		
		System.out.print("������ : ");
		String maker = keyboard.next();
		
		System.out.print("���� : ");
		int price = keyboard.nextInt(); // int��
		
		System.out.print("���� : ");
		double weight = keyboard.nextDouble(); // double��
		
		double pricePerGram = price / weight;
		
		System.out.printf("��ǰ��\t: %s\n", name);
		System.out.printf("������\t: %s\n", maker);
		System.out.printf("����\t: %d��\n", price);
		System.out.printf("����\t: %.3fg\n", weight);
		System.out.printf("g��\t: %.2f��", pricePerGram);
				
		keyboard.close();
	}
}
