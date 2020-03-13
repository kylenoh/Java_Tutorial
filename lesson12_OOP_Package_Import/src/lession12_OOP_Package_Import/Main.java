package lession12_OOP_Package_Import;

import java.util.Random;

import lession12_OOP_Package_Import_DAO.Vehicle;

/**ctrl + shift + o : import 정리*/
public class Main {
	public static void main(String[] args) {
		
		Random random = new Random();
		random.nextInt();
		
		// 해당 클래스 외 다른패키지에서 만든 것을 가져다쓰려면 위와 같이
		
		Product product = new Product();
		product.name="같은 패키지에 있는 클래스틑 사용할 경우 패키지명 생략이 가능 합니다.";
		
		Vehicle vehicle = new Vehicle();
		vehicle.name = "다른 패키지에 있는 클래스를 사용할 경우, 상단에 import 패키지가 됩니다.";
		
		java.util.Scanner scanner = new java.util.Scanner(System.in);
		scanner.close();
		
	}
}
