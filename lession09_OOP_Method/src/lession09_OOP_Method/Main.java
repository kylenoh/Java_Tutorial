package lession09_OOP_Method;

public class Main {
	public static void main(String[] args) {
/**
 * 		Method��?
 * 		����� ������ �� �ֵ��� ���� ����ü
 * */
		
		Calculator calculate = new Calculator();	//��ü ����
		//return�� ���� Method
		calculate.showInfo();						
		System.out.println("-------------------------------------");
		//return�� �ִ� Method
		System.out.println("���ϱ�:\t"+calculate.add(20, 10));
		System.out.println("����:\t"+calculate.minus(20, 10));
		System.out.println("���ϱ�:\t"+calculate.multi(20, 10));
		System.out.println("������:\t"+calculate.division(20, 10));
		System.out.println("-------------------------------------");
		//OverLoading Test
		OverLoading overLoading = new OverLoading();
		overLoading.overLodingTest();
		overLoading.overLodingTest(100);
		overLoading.overLodingTest(100,100);
		
	}
}
