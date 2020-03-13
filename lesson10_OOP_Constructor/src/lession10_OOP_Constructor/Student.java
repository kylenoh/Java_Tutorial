package lession10_OOP_Constructor;
/**
 * ������(Constructor)
 * ��ü�� ���鶧 ����ϴ� ���� ���� ȣ��Ǵ� �κ��Դϴ�.
 * �����ڴ� Ŭ���� ��� �����ϰ� �����մϴ�.
 * �⺻�����ڴ� Ctrl + Space�� �ڵ� �ϼ��� �� �ֽ��ϴ�.
 * */
public class Student {
	// ������� : �ش� Ŭ���� �������� ����� �� �ִ� ����
	String name;
	int age;
	
	/*	
	 * 	�⺻ ������ : ��ü�� ������ ȣ��� �̺κ��� ������� ȣ��˴ϴ�.
	 *	�����ڸ� ���� �۾��� ���ϸ� �ڵ����� �⺻������ �������
	 * */
	public Student() { 
		System.out.println("�⺻�����ڰ� ȣ��˴ϴ�.");
	}
	
	/*
	 * 	��ü�� ����鼭 �Ӽ��� ���� => �����ε��� ������
	 * 	this.�� �ǹ̴� ��������� �ǹ��մϴ�. ( ���������� ��������� �����ϴٴ� �ǹ��Դϴ�. )
	 * */ 
	public Student(String name, int age) {
		super();
		this.name = name;
		this.age = age;
		System.out.println("Ŀ���һ����ڰ� ȣ��˴ϴ�.");
	}
		
	public void showInfo() {
		System.out.println(name);
		System.out.println(age);
	}
	
	@Override
	protected void finalize() throws Throwable {
		System.out.println("�Ҹ��ڰ� ����Ǿ����ϴ�..");
		super.finalize();
	}


}
