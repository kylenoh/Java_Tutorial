package lession12_OOP_Static;

public class Bank {
	//	static 속성
	String name;
	static String bankName = "자바은행";
	static int deposit;
	
	public Bank() {
		// TODO Auto-generated constructor stub
	}
	
	public void showInfo() {
		System.out.println("성명\t"+name);
		System.out.println("은행이름\t"+bankName);
		System.out.println("예금액\t"+deposit);
	}
	public void addDeposit(int cost) {
		deposit += cost;
	}
	
	
	// static Method
	public static void bankInfo() {
		System.out.println("자바은행 정보조회에 동의하신걸 환영합니다.");
	}
	
	
}
