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
		System.out.println("HashSet ũ��\t"+hashset.size()); // 7���� �־����� 1�� �ߺ��Ǿ� ���ŵ˴ϴ�.
		
		for (String string : hashset) {
			System.out.println(string);
		}
	}
}
