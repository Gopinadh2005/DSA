package com.dsa.arrays;

public class AscOrNot {

	public static void main(String[] args) {
		int[] arr= {11,13,23,27,33};
		
		boolean isSorted=true;
		for(int i=0;i<arr.length-1;i++) {
			if(arr[i]>arr[i+1]) {
				isSorted=false;
				break;
			}
		}
		if(isSorted)
			System.out.println("Array is in Asc order");
		else
			System.out.println("Array is not in Asc order");
	}

}
