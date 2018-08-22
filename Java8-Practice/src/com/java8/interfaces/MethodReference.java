package com.java8.interfaces;

public class MethodReference {

	public static void sayHello() {
		System.out.println("Hello Ajinkya");
	}
	
	public static void main(String[] args) {
		HelloHi helloHi = MethodReference::sayHello;
		helloHi.sayHi();
	}
}

interface HelloHi{
	void sayHi();
}
