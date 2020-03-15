package lesson19_Collection;

import java.util.HashSet;

public class Main_hashSet {
	public static void main(String[] args) {
		HashSet<String> hashset = new HashSet<>();
		hashset.add("A");
		hashset.add("D");
		hashset.add("C");
		hashset.add("B");
		hashset.add("F");
		hashset.add("E");
		hashset.add("F");
		System.out.println("HashSet 크기\t"+hashset.size()); // 7개를 넣었지만 1건 중복되어 제거됩니다.
		
		for (String string : hashset) {
			System.out.println(string);
		}
	}
}
