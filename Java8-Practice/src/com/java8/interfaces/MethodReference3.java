package com.java8.interfaces;


interface Say{
	void sayHello();
}

class HelloWorld{
	public void helloWorld() {
		System.out.println("Hello World.. This is the instance method reference using java 8");
	}
}
public class MethodReference3 {
	
	public static void main(String[] args) {
		Sayable sayable = new HelloWorld()::helloWorld;
		sayable.sayHello();
	}
}