package snifflingGame;
import java.util.Random;

public class Friend {
	// ������� : �� ��ü�� ������ �ڿ�
	int coin;
	Random scanner = new Random();
	int ans;

	// �������� : �޼ҵ� ���ο����� �ӽ÷� ���� ������ ����
	public void shake(User user) {
		ans = scanner.nextInt(coin + 1);
		this.ask(user);
	}

	public void ask(User user) {
		System.out.print("Ȧ������¦������ ���纸���� : ");
		String userAns = user.say();
		judge(userAns);
	}

	// public ����Ÿ�� �޼ҵ��(�Ķ����){ }
	// ����Ÿ�� : ȣ���������� �������ٰ�
	// �Ķ���� : �� �޼ҵ� �����ϴµ� �ʿ��� ���(��������� ����)
	public void judge(String userAns) {
		System.out.printf("���� : %d��\n", ans);

		String hc = (ans % 2 == 0) ? "¦" : "Ȧ";
		if (hc.equals(userAns)) {
			System.out.println("����");
		} else {
			System.out.println("��");
		}
	}

}
