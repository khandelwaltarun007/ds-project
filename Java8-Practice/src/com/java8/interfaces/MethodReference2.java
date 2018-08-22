package com.java8.interfaces;


interface Sayable{
	void sayHello();
}


public class MethodReference2 {
	
	public void helloWorld() {
		System.out.println("Hello World.. This is the instance method reference using java 8");
	}
	
	public static void main(String[] args) {
		MethodReference2 reference2 = new MethodReference2();
		Sayable sayable = reference2::helloWorld;
		sayable.sayHello();
	}
}