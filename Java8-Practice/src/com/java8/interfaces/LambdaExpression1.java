package com.java8.interfaces;

import java.util.HashMap;
import java.util.Map;

public class LambdaExpression1 {
	public static void main(String[] args) {
		Map<String, String> map1 = new HashMap<>();
		map1.put("C", "c");
        map1.put("B", "b");
        map1.put("Z", "z");
        map1.forEach((k,v) -> System.out.println("Key : "+k+" value : "+v));
        for(Map.Entry<String, String> entry : map1.entrySet()) {
        	System.out.println("Key : "+entry.getKey()+" \t Value : "+entry.getValue());
        }
		
	}
}
