package lession12_OOP_Package_Import;

public class Product {
	public String name;
	public int price;

	public Product() {
		// TODO Auto-generated constructor stub
	}

	public Product(String name, int price) {
		super();
		this.name = name;
		this.price = price;
	}

	public void print() {
		System.out.println(name);
		System.out.println(price);
	}
}
