package lesson21_Socket;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.Socket;

public class Main_client {
	public static void main(String[] args) {
		Socket client = null;
		try {
			client = new Socket("������", 3423); // �����ϱ�
			System.out.println("���ӵ�");
			
			InputStream inputStream = client.getInputStream();
			InputStreamReader inputReader = new InputStreamReader(inputStream);
			BufferedReader bufferedReader = new BufferedReader(inputReader);
			
			for (int i = 0; i < 5; i++) {
				System.out.println(bufferedReader.readLine());
			}
						
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				client.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}




