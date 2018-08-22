package com.java8.interfaces;

import java.text.DecimalFormat;

public class Test1 {
	public static void main(String[] args) {
		int[] arr = new int[] {-4,3,-9,0,4,1};
		double p=0,n=0,z=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==0)
				z++;
			else if(arr[i]>0)
				p++;
			else
				n++;
		}
		System.out.println(p+" "+n+" "+z);
		DecimalFormat df = new DecimalFormat("#0.000000");
		System.out.println(df.format((double)p/arr.length));
		System.out.println(df.format((double)n/arr.length));
		System.out.println(df.format((double)z/arr.length));
		
	}
}
