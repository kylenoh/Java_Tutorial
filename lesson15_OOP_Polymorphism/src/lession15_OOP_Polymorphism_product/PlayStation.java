package lession15_OOP_Polymorphism_product;

public class PlayStation extends Product implements GameDevice {
	private double weight;

	public PlayStation() {
		// TODO Auto-generated constructor stub
	}

	public PlayStation(double weight) {
		super();
		this.weight = weight;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}
	
	
	@Override
	public void playGame() {
		System.out.println("Interface 에서 가져온 print입니다.");

	}

}
