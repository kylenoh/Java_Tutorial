package lession07_Array;

import java.util.Scanner;

public class Main_GradeManagement {
	public static void main(String[] args) {
//		���� ����
		String name = "kyleNoh";
		int[] score = new int[5];
//		KeyBoard  �Է��غ�
		Scanner keyBoard = new Scanner(System.in);

//		name[0]������ ������ �Է��մϴ�.
		System.out.printf("%s�� ���������� �Է��Ͻÿ� : " ,name);
		score[0] = keyBoard.nextInt();

		System.out.printf("%s�� ���������� �Է��Ͻÿ� : " ,name);
		score[1] = keyBoard.nextInt();

		System.out.printf("%s�� ���������� �Է��Ͻÿ� : " ,name);
		score[2] = keyBoard.nextInt();

		System.out.printf("%s�� ���������� �Է��Ͻÿ� : " ,name);
		score[3] = keyBoard.nextInt();

		System.out.printf("%s�� ���������� �Է��Ͻÿ� : " ,name);
		score[3] = keyBoard.nextInt();
//		������ ����� ����մϴ�.	�Ҽ����� ����Ϸ��� �Ǽ����� ���ԵǾ�� �մϴ�.
		double average = (double)(score[0]+score[1]+score[2]+score[3]+score[4])/5;
		System.out.printf("%s ������� : \t%.2f\n", name ,average);


		keyBoard.close();
	}
}
