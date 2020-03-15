package lesson17_ExceptionHandling;

import java.util.Scanner;


/**
 * Error
 * �ڹ� ������ ���� �ʴ°� => ������(����� ����)�� ���ϴ� ��Ȳ
 * �����ڰ� �߸� �߰ų� ���α׷��� �ϼ����� �ʾ� �߻� �˴ϴ�.
 * 
 * Warning
 * �ڵ尡 �������� ����
 * �����ڰ� �߸��Ͽ�����, ���α׷��� �������� ���� �˴ϴ�.
 * 
 * Exception
 * ���α׷��� �ϼ��Ǿ�����, �ǿ��� ��Ȳ�� �߻��Ͽ� ����� �۵����� ������ �߻��մϴ�.
 * 
 * */

public class Main_tryCatch {
	public static void main(String[] args) {
/**
 * Try - Catch - finally
 * Try ���� �ҽ��� ���� �� ������ �߻��ϸ� Catch�� �̵��մϴ�.
 * ������ finally�� ���� �߻� ���θ� ���� ������ ����˴ϴ�.
 * */
		Scanner keyBoard = new Scanner(System.in);
		try {
			System.out.print("x : ");
			int x = keyBoard.nextInt();
			
			System.out.print("y : ");
			int y = keyBoard.nextInt();
			
			System.out.println("Try ���� �����Դϴ�.");
			System.out.println(x / y);
			System.out.println("a");
			System.out.println("b");
		} catch (ArithmeticException e) {
			System.out.println("y�� 0 ���� �ȵ˴ϴ�.");
		} finally {
			System.out.println("������ �����մϴ�.");
			keyBoard.close();
		}
		
	}
}
