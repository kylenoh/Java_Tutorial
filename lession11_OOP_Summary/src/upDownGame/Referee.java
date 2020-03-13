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
				System.out.printf("%d턴 걸림", turn);
				break;
			}
		}
	}

	public void getGameAns() {
		ans = friend.whisper();
	}

	public void askToPlayer() {
		System.out.print("숫자를다시입력해주세요 : ");
		playerAns = player.tell();
	}

	// 게임 끝나면 true
	// 게임 안끝나면 false
	public boolean judge() {
		if (ans == playerAns) {
			System.out.println("정답");
			return true;
		} else if (ans > playerAns) {
			System.out.println("정답이 큼");
			return false;
		} else {
			System.out.println("정답이 작음");
			return false;
		}
	}

}
