package lession12_OOP_Static;

public class Bank {
	//	static �Ӽ�
	String name;
	static String bankName = "�ڹ�����";
	static int deposit;
	
	public Bank() {
		// TODO Auto-generated constructor stub
	}
	
	public void showInfo() {
		System.out.println("����\t"+name);
		System.out.println("�����̸�\t"+bankName);
		System.out.println("���ݾ�\t"+deposit);
	}
	public void addDeposit(int cost) {
		deposit += cost;
	}
	
	
	// static Method
	public static void bankInfo() {
		System.out.println("�ڹ����� ������ȸ�� �����ϽŰ� ȯ���մϴ�.");
	}
	
	
}
