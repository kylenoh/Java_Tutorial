package lesson19_Collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

public class Main_hashMap {
	public static void main(String[] args) {
		HashMap<String, Integer> hashmap = new HashMap<>();
		hashmap.put("��Ʈ��", 150);
		hashmap.put("ź��ȭ��", 8);
		hashmap.put("����", 6);
		
		System.out.println(hashmap.get("��Ʈ��"));

		
		// Map���� Ű�� ���� => Set
		Set<String> keys = hashmap.keySet();
		ArrayList<String> keys2 = new ArrayList<>(keys);
		for (String string : keys2) {
			System.out.print(string + " ");
			System.out.println(hashmap.get(string));
		}
		
	}
}
