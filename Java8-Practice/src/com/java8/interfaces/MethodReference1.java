package com.java8.interfaces;

import java.util.function.BiFunction;

class Arithmetic {
	public static boolean add(int a, int b) {
		return a > b;
	}
	
	public static boolean lesser(int a, int b) {
		return a < b;
	}
}

public class MethodReference1 {
	public static void main(String[] args) {
		BiFunction<Integer, Integer, Boolean> adder = Arithmetic::add;
		BiFunction<Integer, Integer, Boolean> lesser = Arithmetic::lesser;
		boolean result = adder.apply(10, 20);
		boolean result1 = lesser.apply(10, 20);
		
		System.out.println(result);
		System.out.println(result1);
	}
}