package rspGameWithReferee;

public class Referee {
	User user;
	Enemy enemy;
	int userHand;
	int enemyHand;

	public void printHand() {
		String[] hand = { "", "����", "����", "��" };
		System.out.printf("���� : %s\n", hand[userHand]);
		System.out.printf("��ǻ�� : %s\n", hand[enemyHand]);
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
				System.out.printf("%d����", win);
				break;
			} else if(judgeResult == 3) {
				win++;
			}
		}
	}
	public int judge() {
		int result = userHand - enemyHand;
		if (result == 0) {
			System.out.println("���º�");
			return 1;
		} else if (result == -1 || result == 2) {
			System.out.println("�й�");
			return 2;
		} else {
			System.out.println("�¸�");
			return 3;
		}
	}

	public void showHelp() {
		System.out.println("1. ����");
		System.out.println("2. ����");
		System.out.println("3. ��");
		System.out.print("�� : ");
	}

	public void enemyFire() {
		enemyHand = enemy.fire();
	}

	public void userFire() {
		userHand = user.fire();
	}

}
