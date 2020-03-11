package lession06_RepeatStatmt;

import java.util.Scanner;

public class Main_doWhile {
	public static void main(String[] args) {
//		do-while 문	무조건 1번 do 실행후 , while이 실행됩니다.
		Scanner keyBoard = new Scanner(System.in);
		String answer;
		do {
			System.out.print("1번은 무조건 출력됩니다. : ");
			answer = keyBoard.next();
		} while (!answer.equals("EXIT"));
		{
			System.out.println("EXIT가 아니면 다시 do로 이동");
		}
		keyBoard.close();
	}

}
