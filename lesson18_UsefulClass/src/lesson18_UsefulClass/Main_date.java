package lesson18_UsefulClass;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.StringTokenizer;

public class Main_date {
	public static void main(String[] args) throws ParseException {
		// Date 타입을 -> String 타입으로 변화 [ 패턴 지정도 가능 합니다. ]
		Date date = new Date(); // 기본생성하면 현재시간날짜
		System.out.println("날짜 객체 생성 시 기본 출력 \t"+date);
		
		SimpleDateFormat dateformat = new SimpleDateFormat("yyyyMMddHHmmss");
		String str1 = dateformat.format(date);
		System.out.println("String으로타입 변화 후 패턴 지정\t"+str1);

		System.out.println("----------------------------------");
		
		// String 타입을 -> Date 타입으로 변화
		String str2 = "2000/01-01";
		SimpleDateFormat dateformat2 = new SimpleDateFormat("yyyy/MM-dd");
		try {
			Date date2 = dateformat2.parse(str2);
			System.out.println("Date로타입 변화\t"+date2);

		} catch (ParseException e) {
			e.printStackTrace();
		}
		
		System.out.println("----------------------------------");

		// 각자 Date객체로 만들어서 출력
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
