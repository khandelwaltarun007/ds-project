package com.java8.interfaces;

import java.util.HashMap;
import java.util.Map;

public class HashMapClassTest {
	public static void main(String[] args) {
		Map<String,String> map = new HashMap<>();
		map.put("Tarun", "Pune");
		map.put(new String("Tarun"), "Gwalior");
		System.out.println(map.get(new String("Tarun")));
	}
}