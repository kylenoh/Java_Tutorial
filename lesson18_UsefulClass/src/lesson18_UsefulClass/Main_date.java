package lesson18_UsefulClass;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.StringTokenizer;

public class Main_date {
	public static void main(String[] args) throws ParseException {
		// Date Ÿ���� -> String Ÿ������ ��ȭ [ ���� ������ ���� �մϴ�. ]
		Date date = new Date(); // �⺻�����ϸ� ����ð���¥
		System.out.println("��¥ ��ü ���� �� �⺻ ��� \t"+date);
		
		SimpleDateFormat dateformat = new SimpleDateFormat("yyyyMMddHHmmss");
		String str1 = dateformat.format(date);
		System.out.println("String����Ÿ�� ��ȭ �� ���� ����\t"+str1);

		System.out.println("----------------------------------");
		
		// String Ÿ���� -> Date Ÿ������ ��ȭ
		String str2 = "2000/01-01";
		SimpleDateFormat dateformat2 = new SimpleDateFormat("yyyy/MM-dd");
		try {
			Date date2 = dateformat2.parse(str2);
			System.out.println("Date��Ÿ�� ��ȭ\t"+date2);

		} catch (ParseException e) {
			e.printStackTrace();
		}
		
		System.out.println("----------------------------------");

		// ���� Date��ü�� ���� ���
		String data = "20010101/20020202/20030303/20040404/20050505";
		StringTokenizer st = new StringTokenizer(data, "/");
		String str3 = null;
		SimpleDateFormat dateformat3 = new SimpleDateFormat("yyyyMMdd");
		Date date3 = null;
		while (st.hasMoreTokens()) {
			str3 = st.nextToken();
			date3 = dateformat3.parse(str3);
			System.out.println(date3);
		}
	}
}
