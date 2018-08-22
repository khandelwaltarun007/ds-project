package com.java8.interfaces;

public class Test {

	public static void main(String[] args) {
		Hello hello = str1 -> {
			System.out.println("Hello "+str1);
			System.out.println("How are you ?  "+str1);
		};
		
		Bye bye = str1 -> System.out.println("Bye "+str1); 
		hello.sayHello("Tarun");
		bye.sayBye("Tarun");
		
		Hi hi  = () -> System.out.println("Hi Tarun"); 
		hi.sayHi();
	}
}
// args -> action;

// (args1, args2) -> action

// (args1, args2) -> {action}

/** void sayHello (String str1){
	System.out.println("Hello "+str1);
	System.out.println("How are you ?  "+str1);
}
*/
interface Hello {
	void sayHello(String str);
}

interface Bye{
	void sayBye(String str);
}

interface Hi{
	void sayHi();
}
