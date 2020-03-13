package lession03_PrintWithCharacter;

import java.util.Scanner;

public class Main_Version2 {
	public static void main(String[] args) {
		// 변수는 만들었으면 값을 넣고(초기화) 사용해야
		// 키보드 입력받을 준비
		Scanner keyboard = new Scanner(System.in);
		
		// 이름 입력받기
		System.out.print("이름 : ");
		String name = keyboard.next(); 
		
		// 나이 입력받기
		System.out.print("나이 : ");
		int age = keyboard.nextInt();
		
		// 키 입력받기
		System.out.print("키 : ");
		double height = keyboard.nextDouble();
		
		// 몸무게 입력받기
		System.out.print("몸무게 : ");
		double weight = keyboard.nextDouble();
		
		// 줄 출력
		System.out.println("--------------");
		
		// 이름 출력
		System.out.printf("이름\t: %s\n", name);
		
		// 나이 출력
		System.out.printf("나이\t: %d살\n", age);
		
		// 키 출력(소수점 한자리)
		System.out.printf("키\t: %.1fcm\n", height);
		
		// 몸무게 출력(소수점 두자리)
		System.out.printf("몸무게\t: %.2fkg\n", weight);
		
		keyboard.close();
	}
}
