package lession12_OOP_Static;

public class Main {
	public static void main(String[] args) {
		
		// ��ü�� �������� �ʾ�����, Static Attribute �� ȣ�� �� ���ֽ��ϴ�.
		System.out.println(Bank.bankName);
		System.out.println(Bank.deposit);
		// ��ü�� �������� �ʾ�����, Static Method �� ȣ�� �� �� �ֽ��ϴ�.
		Bank.bankInfo();
		
		// ���� �ٸ� ��ü�� �����Ͽ� �Ա��� �Ѵٰ� ������, Deposit �Ӽ��� �����Ͽ� ����ϰ� �˴ϴ�. (����: Ŀ������ )
		Bank bank = new Bank();
		bank.name = "ȫ�浿";
		bank.addDeposit(1000);
		bank.showInfo();
		
		System.out.println("------------------------------");

		Bank bank2 = new Bank();
		bank2.name = "������";
		bank2.addDeposit(2000);
		bank2.showInfo();
		
		System.out.println("------------------------------");
		
		System.out.println(Bank.deposit);
	}
}
