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
//	�߻�Ŭ������ �ִ� �޼ҵ带 �����ɴϴ�.
	public void attack() {
		System.out.println("���д�����");
	}

	public void printInfo() {
		super.printInfo();	//����(�߻�Ŭ����)�� printInfo�� �ҷ��ɴϴ�.
		System.out.println(shieldPrice);
	}

}
