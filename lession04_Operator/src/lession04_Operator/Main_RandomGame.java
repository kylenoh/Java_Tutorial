package lession04_Operator;

import java.util.Random;
import java.util.Scanner;

public class Main_RandomGame {
	public static void main(String[] args) {
		/**홀짝게임*/ 

		// 랜덤 뽑을 준비
		Random random = new Random(); 
		// 컴퓨터가 랜덤하게 0 ~ 9개까지 동전
		int coinCount = random.nextInt(10);

		// 동전갯수가 짝수면 "짝", 홀수면 "홀"
		String ans = (coinCount % 2 == 0) ? "짝" : "홀";
		
		Scanner keyBoard = new Scanner(System.in);
		System.out.print("숫자를 입력하세요 : ");
		String myAns = keyBoard.next();
		
		// 정답이라면 "정답", 틀렸으면	"오답"
		String result = (myAns.equals(ans)) ? "정답" : "오답";
		System.out.println("--------------");
		System.out.printf("동전갯수\t: %d개\n", coinCount);
		System.out.printf("정답\t: %s\n", ans);
		System.out.printf("내 답\t: %s\n", myAns);
		System.out.println(result);
		
		keyBoard.close();
		
		
	}
}
