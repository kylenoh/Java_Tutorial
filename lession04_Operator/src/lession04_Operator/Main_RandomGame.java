package lession04_Operator;

import java.util.Random;
import java.util.Scanner;

public class Main_RandomGame {
	public static void main(String[] args) {
		/**Ȧ¦����*/ 

		// ���� ���� �غ�
		Random random = new Random(); 
		// ��ǻ�Ͱ� �����ϰ� 0 ~ 9������ ����
		int coinCount = random.nextInt(10);

		// ���������� ¦���� "¦", Ȧ���� "Ȧ"
		String ans = (coinCount % 2 == 0) ? "¦" : "Ȧ";
		
		Scanner keyBoard = new Scanner(System.in);
		System.out.print("���ڸ� �Է��ϼ��� : ");
		String myAns = keyBoard.next();
		
		// �����̶�� "����", Ʋ������	"����"
		String result = (myAns.equals(ans)) ? "����" : "����";
		System.out.println("--------------");
		System.out.printf("��������\t: %d��\n", coinCount);
		System.out.printf("����\t: %s\n", ans);
		System.out.printf("�� ��\t: %s\n", myAns);
		System.out.println(result);
		
		keyBoard.close();
		
		
	}
}
