package lession06_RepeatStatmt;

import java.util.Scanner;

public class Main_doWhile {
	public static void main(String[] args) {
//		do-while ��	������ 1�� do ������ , while�� ����˴ϴ�.
		Scanner keyBoard = new Scanner(System.in);
		String answer;
		do {
			System.out.print("1���� ������ ��µ˴ϴ�. : ");
			answer = keyBoard.next();
		} while (!answer.equals("EXIT"));
		{
			System.out.println("EXIT�� �ƴϸ� �ٽ� do�� �̵�");
		}
		keyBoard.close();
	}

}
