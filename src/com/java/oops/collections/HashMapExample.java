package com.java.oops.collections;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapExample {

	public static void main(String[] args) {

		// K:V | keys are unique

		HashMap<Integer, String> map = new HashMap();
		map.put(3, "John");
		map.put(13, "Tony");
		map.put(343, "Peter");
		map.put(4, "Jane");
		map.put(3, "Venom");
		
		System.out.println(map);
		System.out.println(map.containsKey(13));
		
		Set<Entry<Integer, String>> entrySet = map.entrySet();
	
		for (Entry<Integer, String> entry : entrySet) {
			System.out.println(entry.getKey() + " | " + entry.getValue());
		}
		
		
		

	}

}
