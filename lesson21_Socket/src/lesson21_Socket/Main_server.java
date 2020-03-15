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
			server = new ServerSocket(3423); // ���� ����
			
			Socket serverSocket = server.accept(); // Ŭ���̾�Ʈ�� ������ ���
			System.out.println("����");
			
			OutputStream ouputStream = serverSocket.getOutputStream();
			OutputStreamWriter outputWriter = new OutputStreamWriter(ouputStream);
			BufferedWriter bufferedWriter = new BufferedWriter(outputWriter);
			
			keyBoard = new Scanner(System.in);
			for (int i = 0; i < 5; i++) {
				System.out.print("���� ���� : ");
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





