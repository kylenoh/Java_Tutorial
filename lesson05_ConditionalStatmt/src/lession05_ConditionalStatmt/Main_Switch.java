package lession05_ConditionalStatmt;

import java.util.Scanner;

public class Main_Switch {
	public static void main(String[] args) {
//		switch-case
		Scanner keyBoard = new Scanner(System.in);
		System.out.print("����� �Է��ϼ��� : ");
		String grade = keyBoard.next();
//////////////////////////////////////////////////////////////////////////////
//		������ ���, �̵�� �Ӽ��� ��� �������ϴ�. Break ������
		switch (grade) { // üũ�� ��
		case "����":
			System.out.println("Ưȭ\t:��ũ ���÷�");
		case "��":
			System.out.println("Ưȭ\t:����������");
		case "�Ϻ�":
			System.out.println("Ưȭ\t:����ȭ�۱�");
		case "�̺�": // ��(���ǽ� x)
			System.out.println("Ưȭ\t:��ġ����");
			break;
		default: // else	- �ɼ� �� case�� ��� �ƴҰ��, �⺻���� ��µ˴ϴ�.
			System.out.println("����");
			System.out.println("Ưȭ\t:���� ã��");
			break;
		}
		
//////////////////////////////////////////////////////////////////////////////
//		DBA�� ���, �ش� �Ӽ��� �����ϴ�. case �ȿ� Break�� �����մϴ�.
		System.out.println("-----------------------------------");
		System.out.print("� DB ������ ������ ��Ű��� : ");
		// ���Ѱ���
		String role = keyBoard.next();
		switch (role) {
		case "DBA":
			System.out.println("��Ȱ\t:��������");
			System.out.println("��Ȱ\t:���/����");
			System.out.println("��Ȱ\t:����ڰ���");
			break;
		case "DBP":
			System.out.println("��Ȱ\t:CRUD");
			break;
		default:
			System.out.println("�����");
			System.out.println("��Ȱ\t:���");
			break;
		}
		
//////////////////////////////////////////////////////////////////////////////

		keyBoard.close();
	}
}
