package lession13_OOP_Encapsulation;

// ĸ��ȭ(encapsulation)
//		�������� ������ ó���� ����
public class Dog {
	private String name;
	private int age; // �ܺ��� ���� ������ ����

	public Dog() {
		// TODO Auto-generated constructor stub
	}

	public Dog(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	////////////////////////
	// ������ ������ �� �ִ� ������ ���
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		if (age < 0) {
			age *= -1;
		}
		this.age = age;
	}

	/////////////////////////
	public void print() {
		System.out.println(name);
		System.out.println(age);
	}

}
