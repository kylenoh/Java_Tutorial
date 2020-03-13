package lession03_PrintWithCharacter;

import java.util.Scanner;

public class Main_Version3 {
	public static void main(String[] args) {
		// 콘솔창에 키보드 입력 받을 준비
		Scanner keyboard = new Scanner(System.in);
		
		// 상품명(String)을 입력받아서 임시 저장
		System.out.print("상품명 : ");
		String name = keyboard.next(); // String용
		
		System.out.print("제조사 : ");
		String maker = keyboard.next();
		
		System.out.print("가격 : ");
		int price = keyboard.nextInt(); // int용
		
		System.out.print("무게 : ");
		double weight = keyboard.nextDouble(); // double용
		
		double pricePerGram = price / weight;
		
		System.out.printf("상품명\t: %s\n", name);
		System.out.printf("제조사\t: %s\n", maker);
		System.out.printf("가격\t: %d원\n", price);
		System.out.printf("무게\t: %.3fg\n", weight);
		System.out.printf("g당\t: %.2f원", pricePerGram);
				
		keyboard.close();
	}
}
