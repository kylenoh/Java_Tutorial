package lession03_PrintWithCharacter;

import java.util.Scanner;

public class Main_Version2 {
	public static void main(String[] args) {
		// ������ ��������� ���� �ְ�(�ʱ�ȭ) ����ؾ�
		// Ű���� �Է¹��� �غ�
		Scanner keyboard = new Scanner(System.in);
		
		// �̸� �Է¹ޱ�
		System.out.print("�̸� : ");
		String name = keyboard.next(); 
		
		// ���� �Է¹ޱ�
		System.out.print("���� : ");
		int age = keyboard.nextInt();
		
		// Ű �Է¹ޱ�
		System.out.print("Ű : ");
		double height = keyboard.nextDouble();
		
		// ������ �Է¹ޱ�
		System.out.print("������ : ");
		double weight = keyboard.nextDouble();
		
		// �� ���
		System.out.println("--------------");
		
		// �̸� ���
		System.out.printf("�̸�\t: %s\n", name);
		
		// ���� ���
		System.out.printf("����\t: %d��\n", age);
		
		// Ű ���(�Ҽ��� ���ڸ�)
		System.out.printf("Ű\t: %.1fcm\n", height);
		
		// ������ ���(�Ҽ��� ���ڸ�)
		System.out.printf("������\t: %.2fkg\n", weight);
		
		keyboard.close();
	}
}
