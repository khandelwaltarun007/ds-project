package com.java8.interfaces;

interface Messages{
	void getMessage(String msg);
}

class Message{
	Message(String msg) {
		System.out.println(msg);
	}
}
public class MethodReference5 {
	
	public static void main(String[] args) {
		Messages messages = Message::new;
		messages.getMessage("Message constructor using constructor reference using Java 8");
	}
}