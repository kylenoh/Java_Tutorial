package lesson20_InputOutput;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main_fileWriter {
	public static void main(String[] args) {
		Scanner keyBoard = new Scanner(System.in);
		System.out.print("������ ������ �Է����ּ��� : ");
		String str = keyBoard.next();

		BufferedWriter buffWriter = null;
		try {
			FileWriter fileWriter = new FileWriter("F:\\KyleNoh\\WriteTest.txt", true);
			buffWriter = new BufferedWriter(fileWriter);
			buffWriter.write(str + "\r\n"); // \r : Ŀ�� �� ������
											// \n : �� �ٲٱ�
			buffWriter.flush(); // �뷮 �� ���� �ʾƵ� ������ ����
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				buffWriter.close(); // �ܺ� ���ҽ��� ������ ���� �ݾƾ� �մϴ�.
			} catch (IOException e) {
				e.printStackTrace();
			}
			// fileWriter.close(); // �����Ȱ͵��� �ϳ��� ������ �������� ���� �����ϴ�.
			keyBoard.close();
		}
	}
}
