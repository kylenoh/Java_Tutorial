package lesson20_InputOutput;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main_fileWriter {
	public static void main(String[] args) {
		Scanner keyBoard = new Scanner(System.in);
		System.out.print("내보낼 문장을 입력해주세요 : ");
		String str = keyBoard.next();

		BufferedWriter buffWriter = null;
		try {
			FileWriter fileWriter = new FileWriter("F:\\KyleNoh\\WriteTest.txt", true);
			buffWriter = new BufferedWriter(fileWriter);
			buffWriter.write(str + "\r\n"); // \r : 커서 맨 앞으로
											// \n : 줄 바꾸기
			buffWriter.flush(); // 용량 다 차지 않아도 강제로 전송
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				buffWriter.close(); // 외부 리소스를 가져다 쓰면 닫아야 합니다.
			} catch (IOException e) {
				e.printStackTrace();
			}
			// fileWriter.close(); // 연관된것들은 하나만 닫으면 나머지도 같이 닫힙니다.
			keyBoard.close();
		}
	}
}
