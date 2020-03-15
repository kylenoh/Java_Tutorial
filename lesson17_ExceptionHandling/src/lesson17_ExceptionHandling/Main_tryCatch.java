package lesson17_ExceptionHandling;

import java.util.Scanner;


/**
 * Error
 * 자바 문법게 맞지 않는것 => 컴파일(기계어로 번역)을 못하는 상황
 * 개발자가 잘못 했거나 프로그램이 완성되지 않아 발생 됩니다.
 * 
 * Warning
 * 코드가 지저분한 상태
 * 개발자가 잘못하였으나, 프로그램은 문제없이 수행 됩니다.
 * 
 * Exception
 * 프로그램은 완성되었으나, 의외의 상황이 발생하여 제대로 작동하지 않을때 발생합니다.
 * 
 * */

public class Main_tryCatch {
	public static void main(String[] args) {
/**
 * Try - Catch - finally
 * Try 속의 소스를 실행 중 문제가 발생하면 Catch로 이동합니다.
 * 마지막 finally는 문제 발생 여부를 떠나 무조건 실행됩니다.
 * */
		Scanner keyBoard = new Scanner(System.in);
		try {
			System.out.print("x : ");
			int x = keyBoard.nextInt();
			
			System.out.print("y : ");
			int y = keyBoard.nextInt();
			
			System.out.println("Try 구문 실행입니다.");
			System.out.println(x / y);
			System.out.println("a");
			System.out.println("b");
		} catch (ArithmeticException e) {
			System.out.println("y에 0 쓰면 안됩니다.");
		} finally {
			System.out.println("무조건 실행합니다.");
			keyBoard.close();
		}
		
	}
}
