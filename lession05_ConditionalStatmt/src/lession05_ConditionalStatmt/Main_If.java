package lession05_ConditionalStatmt;

import java.util.Scanner;

public class Main_If {
	public static void main(String[] args) {
//		if - else if - else
		Scanner keyBoard = new Scanner(System.in);
		System.out.print("입력해주세요 : ");
		int number = keyBoard.nextInt();
		
//////////////////////////////////////////////////////////////////////////////
//		if
//		비트연산을 이용한 if 구문
//		입력한 숫자가 1<<3보다 크거나 같으면 주차장 출력

		if (number >= (1 << 3)) {				//1 << 3 = 1000bit = 8
			System.out.println("주차장");
			number -= (1 << 3);
		}
		if (number >= (1 << 2)) {				//1 << 2 = 0100 = 4
			System.out.println("24시간");
			number -= (1 << 2);
		}
		if (number >= (1 << 1)) {				//1 << 1 = 0010 = 2
			System.out.println("흡연실");
			number -= (1 << 1);
		}
		if (number >= (1 << 0)) {				//1 << 0 = 0001 = 1
			System.out.println("와이파이");
			number -= (1 << 0);
		}
//////////////////////////////////////////////////////////////////////////////
//		if - else
//		입력한 숫자가 짝수면 "짝수"라고 출력
//		홀수중에 10보다 크면 "10보다 큰 홀수"라고 출력
//		홀수중에 10보다 작으면 "10보다 작은 홀수"라고 출력
		System.out.println("-----------------------------------");
		if (number % 2 == 0) {
			System.out.println("짝수");
		} else {
			if (number > 10) {
				System.out.println("10보다 큰 홀수");
			} else {
				System.out.println("10보다 작은 홀수");
			}
		}
//////////////////////////////////////////////////////////////////////////////
//		if - elseif - else
//		숫자 >= 90 : 수
// 		80 <= 숫자 < 90 : 우
		System.out.println("-----------------------------------");
		System.out.print("점수를입력해주세요 : ");
		int score = keyBoard.nextInt();
		if (score >= 90) {
			System.out.println("수");
		} else if (score >= 80) {
			System.out.println("우");
		} else if (score >= 70) {
			System.out.println("미");
		} else if (score >= 60) {
			System.out.println("양");
		} else {
			System.out.println("가");
		}

		keyBoard.close();

	}
}
