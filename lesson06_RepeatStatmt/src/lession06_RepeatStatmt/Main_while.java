package lession06_RepeatStatmt;

import java.util.Scanner;

public class Main_while {
	public static void main(String[] args) {
//		while ��	�ݺ����� ������ ������ ��� �ַ� ����մϴ�.
		int intValue = 0;
		while (intValue<10) {
				intValue++;
				System.out.println("inValue : " + intValue);
		}
		System.out.println("--------------------------------");
/////////////////////////////////////////////////////////////////////////////////////		
//		���� : �Է°��� EXIT�� �ƴҰ�� �ݺ�����
		Scanner keyBoard = new Scanner(System.in);
		System.out.println("EXIT �Է½� ����˴ϴ�.");
		String answer =	keyBoard.next();
		while (!answer.equals("EXIT")) {
			System.out.println("EXIT �Է½� ����˴ϴ�.");
			answer = keyBoard.next();
		}
		keyBoard.close();
/////////////////////////////////////////////////////////////////////////////////////
		Scanner repeatKeyBoard = new Scanner(System.in);
		int no;
		while (true) {
			System.out.print("¦���ϰ�� ���ѹݺ��մϴ�. : ");
			no = repeatKeyBoard.nextInt();
			
			if (no % 2 == 0) {
				break;
			}
		}
		repeatKeyBoard.close();
	}
}
