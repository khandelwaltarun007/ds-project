package com.java8.interfaces;

import java.util.function.BiFunction;

class Additions{
	public int add(int a, int b) {
		return a+b;
	}
}
public class MethodReference4 {
	
	public static void main(String[] args) {
		BiFunction<Integer, Integer, Integer> function = new Additions()::add;
		int result = function.apply(7, 8);
		System.out.println(result);
	}
}