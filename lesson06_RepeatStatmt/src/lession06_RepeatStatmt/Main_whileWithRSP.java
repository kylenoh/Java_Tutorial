package lession06_RepeatStatmt;

import java.util.Random;
import java.util.Scanner;

public class Main_whileWithRSP {
	public static void main(String[] args) {
		String[] hand = {"", "����", "����", "��"};
		// Ű���� �Է¹��� �غ�
		Scanner keyBoard = new Scanner(System.in);
		// ���� ���� �غ�
		Random randomValue = new Random();

		// ���������� ���� �ְ� ����ؾ�
		int myHand = 0;
		int comHand = 0;
		int result = 0;
		// ����Ƚ�� ī��Ʈ
		int win = 0;
		while (true) {
			System.out.println("����������---");
			for (int i = 1; i < hand.length; i++) {
				System.out.printf("%d. %s\n", i, hand[i]);
			}
			System.out.println("-------------");			
			System.out.print("���������� : ");
			myHand = keyBoard.nextInt();		
			comHand = randomValue.nextInt(3) + 1;

			System.out.printf("�� : %s\n", hand[myHand]);
			System.out.printf("�� : %s\n", hand[comHand]);
			result = myHand - comHand;
			if (result == 0) {
				System.out.println("���º�");
			} else if (result == -1 || result == 2) {
				System.out.println("�й�");
				System.out.printf("�� %d����", win);
				break;
			} else {
				System.out.println("�¸�");
				win++;
			}
			
		}
		
		keyBoard.close();
	}
}
