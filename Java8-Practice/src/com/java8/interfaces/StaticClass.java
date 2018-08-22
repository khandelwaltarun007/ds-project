package com.java8.interfaces;

public class StaticClass {

	static int i = 10;
	
	static {
		System.out.println("Static Block");
	}
	
	static void method() {
		System.out.println("static Method");
	}
	
	
	public static void main(String[] args) {
		StaticClass.method();
		System.out.println(i);
	}
}
