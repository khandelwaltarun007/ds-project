package com.java8.interfaces;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UniqueNumber {
	public static void main(String[] args) {
		Integer a[] = { 12, 11, 12, 9, 7, 9, 11, 10 };
		List<Integer> arr = Arrays.asList(a);
		Map<Integer, Integer> map = new HashMap<>();
		for (Integer ar : arr) {
			if (map.containsKey(ar)) {
				int val = map.get(ar);
				map.put(ar, val + 1);
			} else {
				// System.out.println(ar);
				map.put(ar, 1);
			}
		}
		for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
			if (entry.getValue() <= 1)
				System.out.println(entry.getKey());
		}
	}
}
