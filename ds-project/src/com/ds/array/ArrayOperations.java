package com.ds.array;

public class ArrayOperations {
	private int arrayLength;
	private long[] array;

	public ArrayOperations(int max) {
		array = new long[max];
		arrayLength = 0;
	}
	
	public void insert(long value) {
		array[arrayLength] = value;
		arrayLength++;
	}
	
	public boolean find(long value) {
		int i;
		for(i = 0; i < arrayLength;i++) {
			if(array[i] == value)
				break;
		}
		if(i==arrayLength)
			return false;
		else
			return true;
	}
	
	public void delete(long value) {
		int i;
		for(i = 0; i<arrayLength;i++) {
			if(array[i]==value)
				break;
		}
		if(i==arrayLength)
			System.out.println("Record is not present, cannot delete record");
		else {
			for(int j = i;j<arrayLength;j++)
				array[j] = array[j+1];
			arrayLength--;
		}
	}
	
	public void display() {
		for(int i = 0; i < arrayLength;i++) {
			System.out.print(array[i]+" ");
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		ArrayOperations operations = new ArrayOperations(100);
		operations.insert(12);
		operations.insert(1);
		operations.insert(2);
		operations.insert(3);
		operations.insert(32);
		operations.insert(62);
		operations.insert(72);
		operations.insert(82);
		operations.insert(42);
		operations.insert(16);
		operations.insert(14);
		operations.insert(18);
		operations.display();
		long searchKey = 16;
		if(operations.find(searchKey))
			System.out.println(searchKey+" is found");
		else
			System.out.println(searchKey+" is not found");
		operations.delete(14);
		operations.display();
	}

}
