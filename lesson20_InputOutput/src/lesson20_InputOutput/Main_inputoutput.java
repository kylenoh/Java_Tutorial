package lesson20_InputOutput;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class Main_inputoutput {
	public static void main(String[] args) {
		InputStream inputStream = null;
		OutputStream outputStream = null;
		DataInputStream datainputStream = null;
		DataOutputStream dataoutputStream = null;
		try {
			inputStream = new FileInputStream("F:\\inputStream.txt");
			datainputStream = new DataInputStream(inputStream);

			String str = datainputStream.readUTF();

			outputStream = new FileOutputStream("F:\\outputStream.txt");
			dataoutputStream = new DataOutputStream(outputStream);

			dataoutputStream.writeUTF(str);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				inputStream.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try {
				outputStream.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}
}
