package lession05_ConditionalStatmt;

import java.util.Scanner;

public class Main_ifWithgetArea {
	public static void main(String[] args) {
		System.out.println("-----------");
		System.out.println("���� ���ϱ�");
		System.out.println("-----------");
		System.out.println("1. ��");
		System.out.println("2. �ﰢ��");
		System.out.println("3. �簢��");
		System.out.println("-----------");
		System.out.print("���ڷ� �Է����ּ��� : ");

		Scanner keyBoard = new Scanner(System.in);
		int what = keyBoard.nextInt();
		if (what == 1) {
			System.out.print("������ : ");
			int r = keyBoard.nextInt();
			double size = r * r * 3.14;
			System.out.printf("���� : %.1f", size);
		} else if (what == 2) {
			System.out.print("�غ� : ");
			int w = keyBoard.nextInt();
			System.out.print("���� : ");
			int h = keyBoard.nextInt();
			double size = w * h / 2.0;
			System.out.printf("���� : %.1f", size);
		} else {
			System.out.print("���� : ");
			int w = keyBoard.nextInt();
			System.out.print("���� : ");
			int h = keyBoard.nextInt();
			double size = w * h;
			System.out.printf("���� : %.1f", size);
		}
		keyBoard.close();
	}
}
