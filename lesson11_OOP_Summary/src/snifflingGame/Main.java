package snifflingGame;

public class Main {
	public static void main(String[] args) {
		Friend friend = new Friend();
		User user = new User();
		friend.coin = 10;
		friend.shake(user);
	}
}
