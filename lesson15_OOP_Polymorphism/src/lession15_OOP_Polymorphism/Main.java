package lession15_OOP_Polymorphism;

import lession15_OOP_Polymorphism_product.Book;
import lession15_OOP_Polymorphism_product.PlayStation;
import lession15_OOP_Polymorphism_product.Product;

public class Main {
	public static void main(String[] args) {
		
		//	�Ϲ� ��ü�� �����Ͽ����ϴ�.
		Product product = new Product();
		product.setName("���ٵ�");
		product.setPrice(1000);
		product.print();
		
		System.out.println("-------------------------");
		
		Book book = new Book();
		book.setName("��ȭå");
		book.setPrice(200);
		book.setAuthor("ȫ�浿");
		book.print();
		
		System.out.println("-------------------------");
		
		PlayStation station = new PlayStation();
		station.setName("�ý�4");
		station.setPrice(8000);
		station.setWeight(2);
		station.print();
		station.playGame();
	}
}
