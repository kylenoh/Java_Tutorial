package lession06_RepeatStatmt;

import java.util.Random;
import java.util.Scanner;

public class Main_forWithRandomGame {
	public static void main(String[] args) {
		Scanner keyBoard = new Scanner(System.in);
		Random randomValue = new Random();
		int ans = randomValue.nextInt(10) + 1;
		int myAns = 0;

		for (int turn = 1; true; turn++) {
			System.out.print("1~10�� �Ӹ��ӿ� �������°��� �Է����ּ��� : ");
			myAns = keyBoard.nextInt();
			if (ans == myAns) {
				System.out.println("����");
				System.out.printf("%d�ϸ��� ����", turn);
				break;
			} else if (ans > myAns) {
				System.out.println("������ �� Ů�ϴ�.");
			} else {
				System.out.println("������ �� �۽��ϴ�.");
			}
		}
		keyBoard.close();
	}
}
