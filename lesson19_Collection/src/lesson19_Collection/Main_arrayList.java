package lesson19_Collection;

import java.util.ArrayList;

public class Main_arrayList {
	public static void main(String[] args) {
		// <> : Generic, �ڷ����� �����մϴ� ��ü�� ����� �� �ֽ��ϴ�.
		ArrayList<String> arrayList = new ArrayList<>();
		arrayList.add("Hello");				//0 �� �ε����� ���� �ֽ��ϴ�.
		arrayList.add("Java");				//1 �� �ε����� ���� �ֽ��ϴ�.
		arrayList.add("World");				//2 �� �ε����� ���� �ֽ��ϴ�.
		arrayList.add(1, "�ȳ��ϼ���");		//1 �� �ε����� ���� �߰��մϴ�. [ ���� 1,2 ���� -> 2,3������ �и��ϴ�]
		arrayList.set(2, "�� ��Ź�帳�ϴ�.");	//2 �� �ε��� ���� �����մϴ�. [2���̵� Java�� �� ��Ź�帳�ϴٷ� ����]
		arrayList.remove(0);

		for (String str1 : arrayList) {
			System.out.println(str1);
		}
		

	}
}
