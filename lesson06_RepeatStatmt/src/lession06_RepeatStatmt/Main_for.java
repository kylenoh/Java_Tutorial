package lession06_RepeatStatmt;

public class Main_for {
	public static void main(String[] args) {
//		for ��	�ݺ����� Ƚ���� ������ ��� �ַ� ����մϴ�.
		
		for (int i = 0; i < args.length; i++) {
			
		}
		String[]stringArray = {"Hello","Java","World"};
//		for �� Version2	���� : ������ũ�⸸ŭ �ݺ���ŵ�ϴ�.
		for (String j : stringArray) {
			System.out.println(j);
		}
/////////////////////////////////////////////////////////////////////////////////////
		// *****
		// *****
		// *****
		// *****
		// *****
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= 5; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
/////////////////////////////////////////////////////////////////////////////////////
		System.out.println("------------------------------");
		// *
		// **
		// ***
		// ****
		// *****
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
/////////////////////////////////////////////////////////////////////////////////////
		System.out.println("------------------------------");
		// *****
		// ****
		// ***
		// **
		// *
		for (int i = 5; i >= 1; i--) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
/////////////////////////////////////////////////////////////////////////////////////
		// *
		// @@
		// ***
		// @@@@
		// *****
		System.out.println("------------------------------");
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j < i * 2; j++) {
				if (i % 2 == 0) {
					System.out.print("@");
				} else {
					System.out.print("*");
				}
			}
			System.out.println();
		}
/////////////////////////////////////////////////////////////////////////////////////
		// ���� Ȧ���ϋ� �Ⱥ��̴� ������
		System.out.println("------------------------------");
		for (int i = 0; i <= 9; i++) {
			for (int dan = 2; dan <= 9; dan++) {
				if (i == 0) {
					System.out.printf("%d��\t\t", dan);
				} else if ((dan * i) % 2 == 1) {
					System.out.print("\t\t");
				} else {
					System.out.printf("%d x %d = %d\t", dan, i, (dan * i));
				}
			}
			System.out.println();
		}

	}
}
