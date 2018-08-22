package com.java8.interfaces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CalculatorTest {

	public int calculations(int a,int b, Calculator calculator) {
		return calculator.calculations(a, b);
	}
	
	Calculator addition = (a,b) -> a+b;
	Calculator subtraction = (a,b) -> a-b;
	Calculator division = (a,b) -> a/b;
	Calculator multiplication = (a,b) -> a*b;
	
	public static void main(String[] args) throws NumberFormatException, IOException {		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter First Number : ");
		int first = Integer.parseInt(br.readLine());
		System.out.print("Enter Second Number : ");
		int second = Integer.parseInt(br.readLine());
		System.out.println("Operations - ");
		System.out.println("1. Addition");
		System.out.println("2. Subtraction");
		System.out.println("3. Division");
		System.out.println("4. Multiplication");
		System.out.println("Choose Operation: ");
		int choice = Integer.parseInt(br.readLine());
		CalculatorTest t = new CalculatorTest();
		switch(choice) {
			case 1:
				System.out.println("Addition is "+t.calculations(first,second,t.addition));
				break;
			case 2:
				System.out.println("Subtraction is "+t.calculations(first,second,t.subtraction));
				break;
			case 3:
				if(second == 0) {
					System.out.println("Can't Divide by 0");
					break;
				}
				System.out.println("Division is "+t.calculations(first,second,t.division));
				break;
			case 4:
				System.out.println("Multiplication is "+t.calculations(first,second,t.multiplication));
				break;
		}
	}

}
