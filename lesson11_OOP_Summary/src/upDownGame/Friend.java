package upDownGame;
import java.util.Random;

public class Friend {
	Random scanner = new Random();
	//int ans; // ������� : �Ӽ� => ��� ����
	
	public int whisper() {
		// �������� : �� �޼ҵ忡�� �ӽ÷� ���� �����°�
		int ans = scanner.nextInt(10) + 1;
		return ans;
	}
}









