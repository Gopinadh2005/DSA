package com.dsa.arrays;

import java.util.Arrays;

public class ProductOfArrayExceptitself {

	public static void main(String[] args) {
		int[] nums= {1,2,3,4};
		System.out.println(Arrays.toString(productOfArray(nums)));
	}
	public static int[] productOfArray(int[] nums) {
		int n=nums.length;
		int[] arr=new int[n];
		int prodR=1;
		int prodL=1;
		for(int i=n-1;i>=0;i--) {
			arr[i]=prodR;
			prodR=prodR*nums[i];
		}
		for(int i=0;i<n;i++) {
			arr[i]=arr[i]*prodL;
			prodL=prodL*nums[i];
		}
		return arr;
	}
}
