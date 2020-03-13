package upDownGame;
import java.util.Random;

public class Friend {
	Random scanner = new Random();
	//int ans; // 멤버변수 : 속성 => 계속 간직
	
	public int whisper() {
		// 지역변수 : 이 메소드에서 임시로 쓰고 버리는거
		int ans = scanner.nextInt(10) + 1;
		return ans;
	}
}









