package lesson19_Collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

public class Main_hashMap {
	public static void main(String[] args) {
		HashMap<String, Integer> hashmap = new HashMap<>();
		hashmap.put("나트륨", 150);
		hashmap.put("탄수화물", 8);
		hashmap.put("지방", 6);
		
		System.out.println(hashmap.get("나트륨"));

		
		// Map에서 키만 추출 => Set
		Set<String> keys = hashmap.keySet();
		ArrayList<String> keys2 = new ArrayList<>(keys);
		for (String string : keys2) {
			System.out.print(string + " ");
			System.out.println(hashmap.get(string));
		}
		
	}
}
