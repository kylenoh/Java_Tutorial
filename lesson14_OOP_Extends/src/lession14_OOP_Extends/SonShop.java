package lession14_OOP_Extends;

public class SonShop extends FatherShop {
	String addMenu;

	// �����ڴ� 
	public SonShop() {
		// TODO Auto-generated constructor stub
	}
	
	
	//	@Override ������ �޼ҵ带 �ҷ��� �߰��� �� �ֽ��ϴ�.
	@Override
	public void showMenu() {
		super.showMenu();
		// super : ����Ŭ������ ���� �����ɴϴ�.
		System.out.println("�߰��ȸ޴�\t"+addMenu);
	}
	
	public void getSonShopName() {
		System.out.println("�Ƶ�ո�");
	}
}
