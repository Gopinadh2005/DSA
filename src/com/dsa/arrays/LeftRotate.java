package com.dsa.arrays;

import java.util.Arrays;

public class LeftRotate {
	public static void main(String[] args) {
		int[] arr= {1,2,3,4};
		int k=2;
		int n=arr.length;
		k=k%n;
		System.out.println("Before rotating : "+Arrays.toString(arr));
		rotate(0,k-1,arr);
		rotate(k,n-1,arr);
		rotate(0,n-1,arr);
		System.out.println("After rotating : "+Arrays.toString(arr));
	}
	public static void rotate(int start,int end,int[] arr) {
		while(start<end) {
			int temp=arr[start];
			arr[start]=arr[end];
			arr[end]=temp;
			start++;
			end--;
		}
	}
}
