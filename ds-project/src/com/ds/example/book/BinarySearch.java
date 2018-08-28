package com.ds.example.book;

public class BinarySearch {
	
	public static int search(int[] array, int lowerBound, int upperBound, int key) {
		int pivot;
		while(true) {
			pivot = (lowerBound+upperBound)/2;
			if(array[pivot] == key) {
				return key;
			}else if(lowerBound>upperBound) {
				System.out.println(key+" is not present");
				return 0;
			}else {
				if(array[pivot] < key) {
					lowerBound = pivot+1;
				}else {
					upperBound = pivot-1;
				}
			}
		}
	}
	
	public static void main(String[] args) {
		int[] array = new int[] {1,2,3,4,5,6,7,23};
		int lowerBound = array[0];
		int upperBound = array.length-1;
		int key = 23;
		int returnvalue = BinarySearch.search(array, lowerBound, upperBound, key);
		System.out.println(returnvalue);
		
	}
}
