package lession03_PrintWithCharacter;

public class Main {
	public static void main(String[] args) {
	
		/**
		 * @author Kyle
		 * Ư������ ���
		 * 
		 * \t 	��
		 * \n 	�ٹٲ�
		 * \r	Ŀ���� �� ������ (carriage return)
		 * \'   ��������ǥ
		 * \"	ū����ǥ
		 * \\ 	��������
		 * 
		 * ���Ĺ��� ���
		 * %d  10����
		 * %o  8����
		 * %x  16����
		 * %c  ����
		 * %s  ���ڿ�
		 * %f  �Ǽ�
		 * 
		 * */

		// Consoleâ�� ��� (Ư������)
		System.out.println("Ư������ ����Դϴ�----------------------");
		System.out.println("�ȳ�\t�ϼ���");	// ���� ����ϰ� �� �ٲ�
		System.out.println("�ȳ�\n�ϼ���");	// �� �ٲ�
		System.out.println("�ȳ�\'�ϼ���");
		System.out.println("�ȳ�\"�ϼ���");
		System.out.println("�ȳ�\\�ϼ���");
		System.out.println("-----------------------------------");

		// Consoleâ�� ��� (���Ĺ���)
		System.out.println("���Ĺ��� ����Դϴ�----------------------");
		System.out.printf("%d\n", 100);
		System.out.printf("%5d\n", 100);	//5ĭ����� ���� ������������
		System.out.printf("%5d\n", 100);
		System.out.printf("%f\n", 1.0);    //1.000000
		System.out.printf("%.0f\n", 1.00);  //1
		System.out.printf("%.1f\n", 1.00);  //1.0
		System.out.println("-----------------------------------");

	}
}
