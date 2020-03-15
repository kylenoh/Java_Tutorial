package lesson16_OOP_Avengers;

public class CaptainAmerica extends Avengers {
	private int shieldPrice;

	public CaptainAmerica() {
		// TODO Auto-generated constructor stub
	}

	public CaptainAmerica(String name, int age, int shieldPrice) {
		super(name, age);
		this.shieldPrice = shieldPrice;
	}

	public int getShieldPrice() {
		return shieldPrice;
	}

	public void setShieldPrice(int shieldPrice) {
		this.shieldPrice = shieldPrice;
	}
//	추상클래스에 있는 메소드를 가져옵니다.
	public void attack() {
		System.out.println("방패던지기");
	}

	public void printInfo() {
		super.printInfo();	//상위(추상클래스)의 printInfo를 불러옵니다.
		System.out.println(shieldPrice);
	}

}
