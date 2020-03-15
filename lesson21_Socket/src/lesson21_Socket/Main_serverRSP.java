package lesson21_Socket;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Main_serverRSP {
	public static void main(String[] args) {
		ServerSocket server = null;
		Scanner keyBoard = null;
		try {
			server = new ServerSocket(7667);
			Socket serverSocket = server.accept();
			String[] hand = { "", "∞°¿ß", "πŸ¿ß", "∫∏" };
			for (int i = 1; i < hand.length; i++) {
				System.out.printf("%d) %s\n", i, hand[i]);
			}
			OutputStream os = serverSocket.getOutputStream();
			OutputStreamWriter osw = new OutputStreamWriter(os);
			BufferedWriter bw = new BufferedWriter(osw);
			InputStream is = serverSocket.getInputStream();
			InputStreamReader isr = new InputStreamReader(is);
			BufferedReader br = new BufferedReader(isr);

			keyBoard = new Scanner(System.in);
			int win = 0;
			int lose = 0;
			int myHand = 0;
			int friendHand = 0;
			int result = 0;
			for (int i = 0; i < 5; i++) {
				System.out.print("ππ : ");
				myHand = keyBoard.nextInt();
				bw.write(myHand + "\r\n");
				bw.flush();
				friendHand = Integer.parseInt(br.readLine());

				result = myHand - friendHand;
				if (result == 0) {
					System.out.println("π´Ω¬∫Œ");
				} else if (result == -1 || result == 2) {
					System.out.println("∆–");
					lose++;
				} else {
					System.out.println("Ω¬");
					win++;
				}
			}
			System.out.printf("%dΩ¬%d∆–", win, lose);

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				server.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			keyBoard.close();
		}
	}
}
