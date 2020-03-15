package lesson17_ExceptionHandling;

import java.util.Scanner;

import lesson17_ExceptionHandling_class.Calculator;

/**
 * Try-Catch �� �ش� ��ҿ��� ���� ó���ϴ� ����̰�,
 * Throws �� ȣ���ϴ� ������ Try-Catch�� ó���ϵ��� �մϴ�.
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
