package lession06_RepeatStatmt;

import java.util.Scanner;

public class Main_while {
	public static void main(String[] args) {
//		while 문	반복문의 조건이 정해진 경우 주로 사용합니다.
		int intValue = 0;
		while (intValue<10) {
				intValue++;
				System.out.println("inValue : " + intValue);
		}
		System.out.println("--------------------------------");
/////////////////////////////////////////////////////////////////////////////////////		
//		조건 : 입력값이 EXIT가 아닐경우 반복진행
		Scanner keyBoard = new Scanner(System.in);
		System.out.println("EXIT 입력시 종료됩니다.");
		String answer =	keyBoard.next();
		while (!answer.equals("EXIT")) {
			System.out.println("EXIT 입력시 종료됩니다.");
			answer = keyBoard.next();
		}
		keyBoard.close();
/////////////////////////////////////////////////////////////////////////////////////
		Scanner repeatKeyBoard = new Scanner(System.in);
		int no;
		while (true) {
			System.out.print("짝수일경우 무한반복합니다. : ");
			no = repeatKeyBoard.nextInt();
			
			if (no % 2 == 0) {
				break;
			}
		}
		repeatKeyBoard.close();
	}
}
