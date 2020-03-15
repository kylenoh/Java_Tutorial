package lesson21_Socket;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.util.Scanner;

public class Main_clientRSP {
	public static void main(String[] args) {
		Socket client = null;
		Scanner keyBoard = null;
		try {
			client = new Socket("����Ip�ּ�", 7667);
			String[] hand = { "", "����", "����", "��" };
			for (int i = 1; i < hand.length; i++) {
				System.out.printf("%d) %s\n", i, hand[i]);
			}
			OutputStream os = client.getOutputStream();
			OutputStreamWriter osw = new OutputStreamWriter(os);
			BufferedWriter bw = new BufferedWriter(osw);
			InputStream is = client.getInputStream();
			InputStreamReader isr = new InputStreamReader(is);
			BufferedReader br = new BufferedReader(isr);

			keyBoard = new Scanner(System.in);
			int win = 0;
			int lose = 0;
			int myHand = 0;
			int friendHand = 0;
			int result = 0;
			for (int i = 0; i < 5; i++) {
				friendHand = Integer.parseInt(br.readLine());

				System.out.print("�� : ");
				myHand = keyBoard.nextInt();
				bw.write(myHand + "\r\n");
				bw.flush();

				result = myHand - friendHand;
				if (result == 0) {
					System.out.println("���º�");
				} else if (result == -1 || result == 2) {
					System.out.println("��");
					lose++;
				} else {
					System.out.println("��");
					win++;
				}
			}
			System.out.printf("%d��%d��", win, lose);

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				client.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			keyBoard.close();
		}
	}
}
