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
			System.out.print("1~10중 머리속에 생각나는값을 입력해주세요 : ");
			myAns = keyBoard.nextInt();
			if (ans == myAns) {
				System.out.println("정답");
				System.out.printf("%d턴만에 정답", turn);
				break;
			} else if (ans > myAns) {
				System.out.println("정답이 더 큽니다.");
			} else {
				System.out.println("정답이 더 작습니다.");
			}
		}
		keyBoard.close();
	}
}
