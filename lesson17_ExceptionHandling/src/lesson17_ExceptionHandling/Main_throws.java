package lesson17_ExceptionHandling;

import java.util.Scanner;

import lesson17_ExceptionHandling_class.Calculator;

/**
 * Try-Catch 는 해당 장소에서 직접 처리하는 방식이고,
 * Throws 는 호출하는 곳에서 Try-Catch를 처리하도록 합니다.
 * */
public class Main_throws {
	public static void main(String[] args) {
		
		Calculator calculator = new Calculator();
		Scanner keyBoard = new Scanner(System.in);
		int x = keyBoard.nextInt();
		int y = keyBoard.nextInt();
		try {
			calculator.calculate2(x, y);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		keyBoard.close();
		
	}
}
