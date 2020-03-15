package lesson20_InputOutput;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main_fileReader {
	public static void main(String[] args) {
		BufferedReader bufferedReader = null;
		try {
			FileReader fileReader = new FileReader("F:\\KyleNoh\\WriteTest.txt");
			bufferedReader = new BufferedReader(fileReader);
			String line = null;
			while ((line = bufferedReader.readLine()) != null) {
				System.out.println(line);
			}
		} catch (Exception e) {
		} finally {
			try {
				bufferedReader.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}
}
