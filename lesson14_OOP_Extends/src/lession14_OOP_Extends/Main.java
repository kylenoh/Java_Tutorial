package lession14_OOP_Extends;

public class Main {
	public static void main(String[] args) {
		/**
		 * Ctrl+t 를 이용해 상속되는 Object를 확인할 수 있습니다.
		 * */
		FatherShop fatherShop = new FatherShop();
		fatherShop.showMenu();
		
		System.out.println("-------------------------");
		
		SonShop sonShop = new SonShop();
		sonShop.showMenu();

		System.out.println("-------------------------");

		sonShop.addMenu="궁중떡볶이";
		sonShop.showMenu();
		
		System.out.println("-------------------------");
		
		sonShop.getFatherShopName();
		sonShop.getSonShopName();
	}
}
