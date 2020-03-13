package lession03_PrintWithCharacter;

public class Main {
	public static void main(String[] args) {
	
		/**
		 * @author Kyle
		 * 특수문자 출력
		 * 
		 * \t 	탭
		 * \n 	줄바꿈
		 * \r	커서를 맨 앞으로 (carriage return)
		 * \'   작은따옴표
		 * \"	큰따옴표
		 * \\ 	역슬래시
		 * 
		 * 서식문자 출력
		 * %d  10진수
		 * %o  8진수
		 * %x  16진수
		 * %c  문자
		 * %s  문자열
		 * %f  실수
		 * 
		 * */

		// Console창에 출력 (특수문자)
		System.out.println("특수문자 출력입니다----------------------");
		System.out.println("안녕\t하세요");	// 내용 출력하고 줄 바꿈
		System.out.println("안녕\n하세요");	// 줄 바꿈
		System.out.println("안녕\'하세요");
		System.out.println("안녕\"하세요");
		System.out.println("안녕\\하세요");
		System.out.println("-----------------------------------");

		// Console창에 출력 (서식문자)
		System.out.println("서식문자 출력입니다----------------------");
		System.out.printf("%d\n", 100);
		System.out.printf("%5d\n", 100);	//5칸만들어 놓고 오른쪽정렬함
		System.out.printf("%5d\n", 100);
		System.out.printf("%f\n", 1.0);    //1.000000
		System.out.printf("%.0f\n", 1.00);  //1
		System.out.printf("%.1f\n", 1.00);  //1.0
		System.out.println("-----------------------------------");

	}
}
