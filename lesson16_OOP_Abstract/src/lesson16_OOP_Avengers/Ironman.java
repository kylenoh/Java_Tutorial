package lesson16_OOP_Avengers;

import lesson16_OOP_Attribute.Ingan;
import lesson16_OOP_Attribute.Scientist;

// Ironman is a Avengers
// Ironman is a Ingan
// Ironman is a Scientist
// ���߻��(x) - �䳻
public class Ironman extends Avengers implements Ingan, Scientist{
	private String comName;
	
	public Ironman() {
		// TODO Auto-generated constructor stub
	}

	public Ironman(String name, int age, String comName) {
		super(name, age);
		this.comName = comName;
	}

	public String getComName() {
		return comName;
	}

	public void setComName(String comName) {
		this.comName = comName;
	}
	
	@Override
	public void attack() {
		System.out.println("�� �߻�");
	}
	
	@Override
	public void printInfo() {
		super.printInfo();
		System.out.println(comName); 
	}

	@Override
	public void eat() {
		System.out.println("��Ա�");
	}

	@Override
	public void research() {
		System.out.println("�����ϱ�");
	}
}












