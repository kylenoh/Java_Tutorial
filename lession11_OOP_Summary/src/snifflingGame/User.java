package snifflingGame;
import java.util.Scanner;

public class User {
	Scanner scanner = new Scanner(System.in);

	// public ����Ÿ�� �޼ҵ��(�Ķ����){    }
	// ����Ÿ�� : ȣ���������� �������ٰ�
	// �Ķ���� : �� �޼ҵ� �����ϴµ� �ʿ��� ���(��������� ����)
	public String say() {
		String what = scanner.next();
		return what;
	}
	
}
