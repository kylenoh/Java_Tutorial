package lession12_OOP_Static;

public class Main {
	public static void main(String[] args) {
		
		// 객체를 생성하지 않았지만, Static Attribute 를 호출 할 수있습니다.
		System.out.println(Bank.bankName);
		System.out.println(Bank.deposit);
		// 객체를 생성하지 않았지만, Static Method 를 호출 할 수 있습니다.
		Bank.bankInfo();
		
		// 서로 다른 객체를 생성하여 입금을 한다고 했을때, Deposit 속성을 공유하여 사용하게 됩니다. (예시: 커플통장 )
		Bank bank = new Bank();
		bank.name = "홍길동";
		bank.addDeposit(1000);
		bank.showInfo();
		
		System.out.println("------------------------------");

		Bank bank2 = new Bank();
		bank2.name = "성춘향";
		bank2.addDeposit(2000);
		bank2.showInfo();
		
		System.out.println("------------------------------");
		
		System.out.println(Bank.deposit);
	}
}
