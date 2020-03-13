package rspGameWithReferee;

public class Referee {
	User user;
	Enemy enemy;
	int userHand;
	int enemyHand;

	public void printHand() {
		String[] hand = { "", "가위", "바위", "보" };
		System.out.printf("유저 : %s\n", hand[userHand]);
		System.out.printf("컴퓨터 : %s\n", hand[enemyHand]);
	}
	public void play() {
		user = new User();
		enemy = new Enemy();
		int judgeResult = 0;
		int win = 0;
		while (true) {
			showHelp();	
			enemyFire();
			userFire();
			printHand();
			judgeResult = judge();
			if (judgeResult == 2) {
				System.out.printf("%d연승", win);
				break;
			} else if(judgeResult == 3) {
				win++;
			}
		}
	}
	public int judge() {
		int result = userHand - enemyHand;
		if (result == 0) {
			System.out.println("무승부");
			return 1;
		} else if (result == -1 || result == 2) {
			System.out.println("패배");
			return 2;
		} else {
			System.out.println("승리");
			return 3;
		}
	}

	public void showHelp() {
		System.out.println("1. 가위");
		System.out.println("2. 바위");
		System.out.println("3. 보");
		System.out.print("뭐 : ");
	}

	public void enemyFire() {
		enemyHand = enemy.fire();
	}

	public void userFire() {
		userHand = user.fire();
	}

}
