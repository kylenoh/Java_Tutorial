package lession07_Array;

import java.util.Scanner;

public class Main_GradeManagement {
	public static void main(String[] args) {
//		변수 선언
		String name = "kyleNoh";
		int[] score = new int[5];
//		KeyBoard  입력준비
		Scanner keyBoard = new Scanner(System.in);

//		name[0]번지의 점수를 입력합니다.
		System.out.printf("%s의 국어점수를 입력하시오 : " ,name);
		score[0] = keyBoard.nextInt();

		System.out.printf("%s의 수학점수를 입력하시오 : " ,name);
		score[1] = keyBoard.nextInt();

		System.out.printf("%s의 영어점수를 입력하시오 : " ,name);
		score[2] = keyBoard.nextInt();

		System.out.printf("%s의 과학점수를 입력하시오 : " ,name);
		score[3] = keyBoard.nextInt();

		System.out.printf("%s의 연기점수를 입력하시오 : " ,name);
		score[3] = keyBoard.nextInt();
//		점수의 평균을 출력합니다.	소수점을 출력하려면 실수형이 포함되어야 합니다.
		double average = (double)(score[0]+score[1]+score[2]+score[3]+score[4])/5;
		System.out.printf("%s 평균점수 : \t%.2f\n", name ,average);


		keyBoard.close();
	}
}
