package lession05_ConditionalStatmt;

import java.util.Scanner;

public class Main_If {
	public static void main(String[] args) {
//		if - else if - else
		Scanner keyBoard = new Scanner(System.in);
		System.out.print("�Է����ּ��� : ");
		int number = keyBoard.nextInt();
		
//////////////////////////////////////////////////////////////////////////////
//		if
//		��Ʈ������ �̿��� if ����
//		�Է��� ���ڰ� 1<<3���� ũ�ų� ������ ������ ���

		if (number >= (1 << 3)) {				//1 << 3 = 1000bit = 8
			System.out.println("������");
			number -= (1 << 3);
		}
		if (number >= (1 << 2)) {				//1 << 2 = 0100 = 4
			System.out.println("24�ð�");
			number -= (1 << 2);
		}
		if (number >= (1 << 1)) {				//1 << 1 = 0010 = 2
			System.out.println("����");
			number -= (1 << 1);
		}
		if (number >= (1 << 0)) {				//1 << 0 = 0001 = 1
			System.out.println("��������");
			number -= (1 << 0);
		}
//////////////////////////////////////////////////////////////////////////////
//		if - else
//		�Է��� ���ڰ� ¦���� "¦��"��� ���
//		Ȧ���߿� 10���� ũ�� "10���� ū Ȧ��"��� ���
//		Ȧ���߿� 10���� ������ "10���� ���� Ȧ��"��� ���
		System.out.println("-----------------------------------");
		if (number % 2 == 0) {
			System.out.println("¦��");
		} else {
			if (number > 10) {
				System.out.println("10���� ū Ȧ��");
			} else {
				System.out.println("10���� ���� Ȧ��");
			}
		}
//////////////////////////////////////////////////////////////////////////////
//		if - elseif - else
//		���� >= 90 : ��
// 		80 <= ���� < 90 : ��
		System.out.println("-----------------------------------");
		System.out.print("�������Է����ּ��� : ");
		int score = keyBoard.nextInt();
		if (score >= 90) {
			System.out.println("��");
		} else if (score >= 80) {
			System.out.println("��");
		} else if (score >= 70) {
			System.out.println("��");
		} else if (score >= 60) {
			System.out.println("��");
		} else {
			System.out.println("��");
		}

		keyBoard.close();

	}
}
