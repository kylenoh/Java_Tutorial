package lession14_OOP_Extends;

public class SonShop extends FatherShop {
	String addMenu;

	// 생성자는 
	public SonShop() {
		// TODO Auto-generated constructor stub
	}
	
	
	//	@Override 상위의 메소드를 불러서 추가할 수 있습니다.
	@Override
	public void showMenu() {
		super.showMenu();
		// super : 상위클래스의 값을 가져옵니다.
		System.out.println("추가된메뉴\t"+addMenu);
	}
	
	public void getSonShopName() {
		System.out.println("아들손맛");
	}
}
