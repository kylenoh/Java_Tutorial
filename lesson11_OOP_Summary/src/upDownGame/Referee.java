package upDownGame;
public class Referee {
	Friend friend;
	Player player;
	int ans;
	int playerAns;

	public void play() {
		friend = new Friend();
		player = new Player();
		getGameAns();

		boolean isOver = false;

		for(int turn = 1; true ; turn++) {
		//while (true) {
			askToPlayer();
			isOver = judge();
			if (isOver) {
				System.out.printf("%d�� �ɸ�", turn);
				break;
			}
		}
	}

	public void getGameAns() {
		ans = friend.whisper();
	}

	public void askToPlayer() {
		System.out.print("���ڸ��ٽ��Է����ּ��� : ");
		playerAns = player.tell();
	}

	// ���� ������ true
	// ���� �ȳ����� false
	public boolean judge() {
		if (ans == playerAns) {
			System.out.println("����");
			return true;
		} else if (ans > playerAns) {
			System.out.println("������ ŭ");
			return false;
		} else {
			System.out.println("������ ����");
			return false;
		}
	}

}
