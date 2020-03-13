package lession15_OOP_Polymorphism;

import lession15_OOP_Polymorphism_product.Book;
import lession15_OOP_Polymorphism_product.PlayStation;
import lession15_OOP_Polymorphism_product.Product;

public class Main {
	public static void main(String[] args) {
		
		//	일반 객체를 생성하였습니다.
		Product product = new Product();
		product.setName("닌텐도");
		product.setPrice(1000);
		product.print();
		
		System.out.println("-------------------------");
		
		Book book = new Book();
		book.setName("만화책");
		book.setPrice(200);
		book.setAuthor("홍길동");
		book.print();
		
		System.out.println("-------------------------");
		
		PlayStation station = new PlayStation();
		station.setName("플스4");
		station.setPrice(8000);
		station.setWeight(2);
		station.print();
		station.playGame();
	}
}
