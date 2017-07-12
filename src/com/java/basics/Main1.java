package com.java.basics;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Main1 {

	public static void main(String[] args) {

		Map<Double, String> map = new HashMap<Double, String>();

		map.put(53.3, "Hello");
		map.put(23.3, "Hello");
		map.put(33.3, "Hello");

		System.out.println(map.get(23.3));
		System.out.println(map.get(33.3));

		// duplicate key: hashCode, equals; key side only
		// new value overrides previous value

		// key will be sorted
		// you can change the order logic:
		System.out.println(map);

		Set<Double> keys = map.keySet();
		Collection<String> values = map.values();

		for (Double key : keys) {
			System.out.println(key);
		}

		for (String value : values) {
			System.out.println(value);
		}

		Set<Map.Entry<Double, String>> entries = map.entrySet();

		for (Map.Entry<Double, String> me : entries) {
			System.out.println(me.getKey() + ": " + me.getValue());

		}

		// Map.Enry<K, V>

	}

}
// serializable
// transfer data to network:
// Java 1: Java 2

// create an object, put object into a file, serializalbe interface used
// Serializable interface: