package lession05_ConditionalStatmt;

import java.util.Scanner;

public class Main_ifWithgetArea {
	public static void main(String[] args) {
		System.out.println("-----------");
		System.out.println("넓이 구하기");
		System.out.println("-----------");
		System.out.println("1. 원");
		System.out.println("2. 삼각형");
		System.out.println("3. 사각형");
		System.out.println("-----------");
		System.out.print("숫자로 입력해주세요 : ");

		Scanner keyBoard = new Scanner(System.in);
		int what = keyBoard.nextInt();
		if (what == 1) {
			System.out.print("반지름 : ");
			int r = keyBoard.nextInt();
			double size = r * r * 3.14;
			System.out.printf("넓이 : %.1f", size);
		} else if (what == 2) {
			System.out.print("밑변 : ");
			int w = keyBoard.nextInt();
			System.out.print("높이 : ");
			int h = keyBoard.nextInt();
			double size = w * h / 2.0;
			System.out.printf("넓이 : %.1f", size);
		} else {
			System.out.print("가로 : ");
			int w = keyBoard.nextInt();
			System.out.print("세로 : ");
			int h = keyBoard.nextInt();
			double size = w * h;
			System.out.printf("넓이 : %.1f", size);
		}
		keyBoard.close();
	}
}
