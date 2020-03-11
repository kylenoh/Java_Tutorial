package lession06_RepeatStatmt;

import java.util.Random;
import java.util.Scanner;

public class Main_whileWithRSP {
	public static void main(String[] args) {
		String[] hand = {"", "가위", "바위", "보"};
		// 키보드 입력받을 준비
		Scanner keyBoard = new Scanner(System.in);
		// 랜덤 뽑을 준비
		Random randomValue = new Random();

		// 지역변수는 값을 넣고 사용해야
		int myHand = 0;
		int comHand = 0;
		int result = 0;
		// 연승횟수 카운트
		int win = 0;
		while (true) {
			System.out.println("가위바위보---");
			for (int i = 1; i < hand.length; i++) {
				System.out.printf("%d. %s\n", i, hand[i]);
			}
			System.out.println("-------------");			
			System.out.print("가위바위보 : ");
			myHand = keyBoard.nextInt();		
			comHand = randomValue.nextInt(3) + 1;

			System.out.printf("나 : %s\n", hand[myHand]);
			System.out.printf("컴 : %s\n", hand[comHand]);
			result = myHand - comHand;
			if (result == 0) {
				System.out.println("무승부");
			} else if (result == -1 || result == 2) {
				System.out.println("패배");
				System.out.printf("총 %d연승", win);
				break;
			} else {
				System.out.println("승리");
				win++;
			}
			
		}
		
		keyBoard.close();
	}
}
