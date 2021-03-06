package com.java8.interfaces;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;

public class Testing {

	public static void main(String[] args) {
		try ( // Using multiple resources
				FileOutputStream fileOutputStream = new FileOutputStream(
						"D:\\Eclipse Workspace\\J2EE\\Java8-Practice\\src\\abc1.txt");
				InputStream input = new FileInputStream("D:\\Eclipse Workspace\\J2EE\\Java8-Practice\\src\\abc.txt");
				DataInputStream inst = new DataInputStream(input)) {
			// -----------------------------Code to write data into
			// file--------------------------------------------//
			String msg = "Welcome to javaTpoint!";
			byte byteArray[] = msg.getBytes(); // Converting string into byte array
			fileOutputStream.write(byteArray); // Writing data into file
			System.out.println("------------Data written into file--------------");
			System.out.println(msg);
			// -----------------------------Code to read data from
			// file---------------------------------------------//
			// Creating input stream instance
			int data = input.available();
			// Returns an estimate of the number of bytes that can be read from this input
			// stream.
			byte[] byteArray2 = new byte[data];
			inst.read(byteArray2);
			String str = new String(byteArray2); // passing byte array into String constructor
			System.out.println("------------Data read from file--------------");
			System.out.println(str); // display file data
		} catch (Exception exception) {
			System.out.println(exception);
		}
	}
}