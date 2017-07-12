package com.java.assignsnew;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class CountDupsHashMap {

	public static void main(String[] args) {

		String[] stringArray = { "a", "b", "a", "e", "b", "a", "e", "c", "d", "e", "e" };

		Map<String, Integer> map = new HashMap<String, Integer>();

		for (String s : stringArray) {

			if (map.containsKey(s)) {
				map.put(s, map.get(s) + 1);
			} else {
				map.put(s, 1);
			}

		}

		Set<Map.Entry<String, Integer>> entries = map.entrySet();

		for (Map.Entry<String, Integer> me : entries) {

			System.out.println("letter" + ":" + "counts");
			System.out.println(me.getKey() + " : " + me.getValue());

		}

	}

}
