package lesson18_UsefulClass;

import java.util.StringTokenizer;

public class Main_string {
	public static void main(String[] args) {
		String str = new String("������ String�� �̷��Լ����մϴ�");

		// str�� '��'�ڷ� �����ϴ��� Ȯ���մϴ�. => true/false
		System.out.println(  str.startsWith("��")   );
		
		// str�� '��'�ڷ� �������� Ȯ���մϴ�. true/false
		System.out.println(  str.endsWith("��")  );
		
		// str���� '����' -> '�ۼ�'���� �ٲߴϴ�.
		System.out.println( str.replace("����", "�ۼ�")   );
		
		// str 3��°���ڸ� ����մϴ�.
		System.out.println( str.charAt(2)  );
		
		System.out.println("----------------------------------");
		
		String str2 = "�ȳ��ϼ���";
		// str2�� '�ȳ��ϼ���'��� ���ִ��� ���θ� Ȯ���մϴ�. true/false

		System.out.println( str2.equals("�ȳ�")  );
		
		System.out.println("----------------------------------");
		
		// String�� ����µ� ���� ������ �� �ֽ��ϴ�. �Ҽ��� 1�ڸ�����
		String str3 = String.format("%.1f", 123.456); 
		System.out.println(str3);
		
		System.out.println("----------------------------------");
		
		// String�и�
		String str4 = "20181030,1ȣ��,���￪,12334,32442";
		// ","�� �������� ������ �迭�� ��� �ݴϴ�. String[]
		String[] subway = str4.split(",");
		System.out.println(subway[2]);
		
		// ���ʴ�� ó�� ������ ���·�
		StringTokenizer st = new StringTokenizer(str4, ",");
		while (  st.hasMoreTokens()  ) {
			System.out.println(st.nextToken());
		}

		System.out.println("----------------------------------");

		// String ��ġ�� synchronized
		StringBuffer buffer = new StringBuffer("Hello");
		buffer.append("Java");
		buffer.append("World");
		buffer.insert(buffer.length(), "!!");
		String str5 = buffer.toString();
		System.out.println(str5);
		
		//	Asynchronized
		StringBuilder builder = new StringBuilder();
		builder.append("Hello");
		builder.append("Java");
		builder.append("World");
		builder.delete(5, 9);
		String str6 = builder.toString();
		System.out.println(str6);
		
	}
}
