package lesson16_OOP_Avengers;

/**
 * �߻� Ŭ���� : �̿ϼ��� �޼ҵ尡 �ֱ� ������ ��ü�� ���� �� �����ϴ�.
 * 
 * */

// �߻�޼ҵ带 �ϳ��� ������ Ŭ������ �߻�Ŭ����������
public abstract class Avengers {
//	��� ����
	private String name;
	private int age;

//	�⺻ ������
	public Avengers() {
		// TODO Auto-generated constructor stub
	}
//	Ŀ���� ������
	public Avengers(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
//	Getter Setter
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
		this.age = age;
	}
//	�Ϲݸ޼ҵ�
	public void printInfo() {
		System.out.println(name);
		System.out.println(age);
	}

//	�߻�޼ҵ�: �ݵ�� �������̵� �ؾ��ϴ� �޼ҵ�
	public abstract void attack();


}
