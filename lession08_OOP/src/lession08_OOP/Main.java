package lession08_OOP;

public class Main {
	public static void main(String[] args) {
/**
 * 		��ü�������α׷���(Object Oriented Programming)
 * 		��ü : �ǻ�Ȱ�� �����ϴ� ����, ������ ��� ��
 * 		Ŭ������? : ��ü ���� Ʋ
 * 		Main ���� class�� ����������� , public static void main(String[]args) �� ǥ���մϴ�.
 * 		���α׷��� ���۵ɶ� ���� ���� ã�� �Ǵ� ��
 * */
//		������ ��ü
		Book book = new Book();		//Ŭ������ ȣ���� ��ü�� ����ϴ�.
		book.title = "�Ҽ������ڹ�";	//��ü �Ӽ��� ���� �־��ݴϴ�.
		book.price =5000;
		book.publisher = "������";
		book.showInfo();
		System.out.println(book); 	//��ü�� �ּҰ��� ����ֽ��ϴ�.
		
		System.out.println("-----------------------------------------");
		
//		������ ��ü
		Vehicle vehicle = new Vehicle();	//Ŭ������ ȣ���� ��ü�� ����ϴ�.
		vehicle.classification = "�ڵ���";	//��ü �Ӽ��� ���� �־��ݴϴ�.
		vehicle.VehicleName = "�ҳ�Ÿ";
		vehicle.price  = 1000;
		vehicle.showInfo();
		System.out.println(vehicle); 		//��ü�� �ּҰ��� ����ֽ��ϴ�.
		
		
		vehicle.classification = "�������";	//��ü�� ���ο� ���� �־��� �� �ֽ��ϴ�.
		vehicle.VehicleName = "����Ű";
		vehicle.price  = 5000;
		vehicle.showInfo();
		System.out.println(vehicle);		//���� �ٸ�����, �ϳ��� �ּҰ��� ���� ���� Ȯ�� �� ���ֽ��ϴ�.
	}
}
