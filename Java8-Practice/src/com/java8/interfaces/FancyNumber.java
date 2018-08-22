package com.java8.interfaces;

public class FancyNumber {

	public static void main(String[] args) {
		String s = "987456321";
		char[] arr = s.toCharArray();
		boolean flag = false;
		for (int i = 0; i < arr.length - 3;i++) {
			System.out.print(arr[i]);
			if ((arr[i] == arr[i + 1]) && (arr[i] == arr[i + 2])) {
				flag = true;
			}
			if ((arr[i] == arr[i + 1] + 1) && (arr[i] == arr[i + 2] + 1)) {
				flag = true;
			}
			if ((arr[i] == arr[i + 1] - 1) && (arr[i] == arr[i + 2] - 2)) {
				flag = true;
			}
			

		}
		if (!flag)
			System.out.println("This is not a fancy number.");
		else
			System.out.println("This is a fancy number.");
	}

}
