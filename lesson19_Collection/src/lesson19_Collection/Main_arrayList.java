package lesson19_Collection;

import java.util.ArrayList;

public class Main_arrayList {
	public static void main(String[] args) {
		// <> : Generic, 자료형을 제한합니다 객체만 사용할 수 있습니다.
		ArrayList<String> arrayList = new ArrayList<>();
		arrayList.add("Hello");				//0 번 인덱스에 값을 넣습니다.
		arrayList.add("Java");				//1 번 인덱스에 값을 넣습니다.
		arrayList.add("World");				//2 번 인덱스에 값을 넣습니다.
		arrayList.add(1, "안녕하세요");		//1 번 인덱스에 값을 추가합니다. [ 기존 1,2 번이 -> 2,3번으로 밀립니다]
		arrayList.set(2, "잘 부탁드립니다.");	//2 번 인덱스 값을 변경합니다. [2번이된 Java가 잘 부탁드립니다로 변경]
		arrayList.remove(0);

		for (String str1 : arrayList) {
			System.out.println(str1);
		}
		

	}
}
