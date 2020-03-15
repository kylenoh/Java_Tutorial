package lesson21_Socket;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Main_server {
	public static void main(String[] args) {
		ServerSocket server = null;
		Scanner keyBoard = null;
		try {
			server = new ServerSocket(3423); // 서비스 시작
			
			Socket serverSocket = server.accept(); // 클라이언트의 접속을 허용
			System.out.println("성공");
			
			OutputStream ouputStream = serverSocket.getOutputStream();
			OutputStreamWriter outputWriter = new OutputStreamWriter(ouputStream);
			BufferedWriter bufferedWriter = new BufferedWriter(outputWriter);
			
			keyBoard = new Scanner(System.in);
			for (int i = 0; i < 5; i++) {
				System.out.print("보낼 내용 : ");
				String str = keyBoard.next();
				bufferedWriter.write(str + "\r\n");
				bufferedWriter.flush();
			}
			
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





