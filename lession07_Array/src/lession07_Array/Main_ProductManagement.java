package lession07_Array;

import java.util.Scanner;

public class Main_ProductManagement {
	public static void main(String[] args) {
		Scanner keyBoard = new Scanner(System.in);

		int menu = 0;
		int no = -1;
		String[] name = new String[10];
		int[] price = new int[10];
		double[] weight = new double[10];
		int sum = 0;
		int tNo = 0;
		while (true) {
			System.out.println("---------------------------");
			System.out.println("��ǰ����");
			System.out.println("---------------------------");
			System.out.println("1.��ǰ���");
			System.out.println("2.��ǰ�����ȸ");
			System.out.println("3.Ư����ǰ��ȸ");
			System.out.println("4.��ϻ�ǰ����");
			System.out.println("---------------------------");
			System.out.print("��ȣ�� �Է����ּ��� : ");
			menu = keyBoard.nextInt();
			if (menu == 1) {
				no++;
				System.out.print("��ǰ�� : ");
				name[no] = keyBoard.next();
				System.out.print("���� : ");
				price[no] = keyBoard.nextInt();
				System.out.print("���� : ");
				weight[no] = keyBoard.nextDouble();
			} else if (menu == 2) {
				sum = 0;
				for (int i = 0; i <= no; i++) {
					sum += price[i];
					System.out.printf("%d) \t %s \t %d�� \t %.1fg \t %.1f�� \n", (i + 1), name[i], price[i], weight[i],
							(price[i] / weight[i]));
				}
				System.out.printf("��� : %d��\n", sum / (no + 1));

			} else if (menu == 3) {
				System.out.print("��ȣ : ");
				tNo = keyBoard.nextInt() - 1;
				System.out.printf("%d) \t %s \t %d�� \t %.1fg \t %.1f�� \n", (tNo + 1), name[tNo], price[tNo],
						weight[tNo], (price[tNo] / weight[tNo]));
			} else if (menu == 4) {
				System.out.print("��ȣ : ");
				tNo = keyBoard.nextInt() - 1;
				System.out.print("�̸� : ");
				name[tNo] = keyBoard.next();
				System.out.print("���� : ");
				price[tNo] = keyBoard.nextInt();
				System.out.print("���� : ");
				weight[tNo] = keyBoard.nextDouble();
			} else {
				break;
			}
		}
		keyBoard.close();
	}
}
