package lession14_OOP_Extends;

public class Main {
	public static void main(String[] args) {
		/**
		 * Ctrl+t �� �̿��� ��ӵǴ� Object�� Ȯ���� �� �ֽ��ϴ�.
		 * */
		FatherShop fatherShop = new FatherShop();
		fatherShop.showMenu();
		
		System.out.println("-------------------------");
		
		SonShop sonShop = new SonShop();
		sonShop.showMenu();

		System.out.println("-------------------------");

		sonShop.addMenu="���߶�����";
		sonShop.showMenu();
		
		System.out.println("-------------------------");
		
		sonShop.getFatherShopName();
		sonShop.getSonShopName();
	}
}
