package snifflingGame;
import java.util.Scanner;

public class User {
	Scanner scanner = new Scanner(System.in);

	// public 리턴타입 메소드명(파라메터){    }
	// 리턴타입 : 호출한쪽으로 전달해줄거
	// 파라메터 : 이 메소드 수행하는데 필요한 재료(멤버변수는 빼고)
	public String say() {
		String what = scanner.next();
		return what;
	}
	
}
