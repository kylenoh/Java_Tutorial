package lession12_OOP_Package_Import;

import java.util.Random;

import lession12_OOP_Package_Import_DAO.Vehicle;

/**ctrl + shift + o : import ����*/
public class Main {
	public static void main(String[] args) {
		
		Random random = new Random();
		random.nextInt();
		
		// �ش� Ŭ���� �� �ٸ���Ű������ ���� ���� �����پ����� ���� ����
		
		Product product = new Product();
		product.name="���� ��Ű���� �ִ� Ŭ�����z ����� ��� ��Ű���� ������ ���� �մϴ�.";
		
		Vehicle vehicle = new Vehicle();
		vehicle.name = "�ٸ� ��Ű���� �ִ� Ŭ������ ����� ���, ��ܿ� import ��Ű���� �˴ϴ�.";
		
		java.util.Scanner scanner = new java.util.Scanner(System.in);
		scanner.close();
		
	}
}
