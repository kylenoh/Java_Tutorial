package snifflingGame;
import java.util.Random;

public class Friend {
	// 멤버변수 : 이 객체가 가지는 자원
	int coin;
	Random scanner = new Random();
	int ans;

	// 지역변수 : 메소드 내부에서만 임시로 쓰고 버리는 존재
	public void shake(User user) {
		ans = scanner.nextInt(coin + 1);
		this.ask(user);
	}

	public void ask(User user) {
		System.out.print("홀수인지짝수인지 맞춰보세요 : ");
		String userAns = user.say();
		judge(userAns);
	}

	// public 리턴타입 메소드명(파라메터){ }
	// 리턴타입 : 호출한쪽으로 전달해줄거
	// 파라메터 : 이 메소드 수행하는데 필요한 재료(멤버변수는 빼고)
	public void judge(String userAns) {
		System.out.printf("동전 : %d개\n", ans);

		String hc = (ans % 2 == 0) ? "짝" : "홀";
		if (hc.equals(userAns)) {
			System.out.println("정답");
		} else {
			System.out.println("땡");
		}
	}

}
