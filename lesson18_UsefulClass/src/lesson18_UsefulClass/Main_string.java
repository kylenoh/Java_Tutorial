package lesson18_UsefulClass;

import java.util.StringTokenizer;

public class Main_string {
	public static void main(String[] args) {
		String str = new String("원래는 String도 이렇게선언합니다");

		// str이 '원'자로 시작하는지 확인합니다. => true/false
		System.out.println(  str.startsWith("원")   );
		
		// str이 '다'자로 끝나는지 확인합니다. true/false
		System.out.println(  str.endsWith("다")  );
		
		// str에서 '선언' -> '작성'으로 바꿉니다.
		System.out.println( str.replace("선언", "작성")   );
		
		// str 3번째글자를 출력합니다.
		System.out.println( str.charAt(2)  );
		
		System.out.println("----------------------------------");
		
		String str2 = "안녕하세요";
		// str2에 '안녕하세요'라고 써있는지 여부를 확인합니다. true/false

		System.out.println( str2.equals("안녕")  );
		
		System.out.println("----------------------------------");
		
		// String을 만드는데 형식 지정할 수 있습니다. 소수점 1자리까지
		String str3 = String.format("%.1f", 123.456); 
		System.out.println(str3);
		
		System.out.println("----------------------------------");
		
		// String분리
		String str4 = "20181030,1호선,서울역,12334,32442";
		// ","를 기준으로 나눠서 배열에 담아 줍니다. String[]
		String[] subway = str4.split(",");
		System.out.println(subway[2]);
		
		// 차례대로 처리 가능한 형태로
		StringTokenizer st = new StringTokenizer(str4, ",");
		while (  st.hasMoreTokens()  ) {
			System.out.println(st.nextToken());
		}

		System.out.println("----------------------------------");

		// String 합치기 synchronized
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
