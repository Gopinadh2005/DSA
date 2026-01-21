package com.dsa.arrays;

import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {

	public static void main(String[] args) {
		int[] nums= {2,7,11,15};
		System.out.println(Arrays.toString(twoSum(nums,9)));
	}
	public static int[] twoSum(int[] nums,int target) {
		HashMap<Integer,Integer> h=new HashMap<>();
		for(int i=0;i<nums.length;i++) {
			int req_num=target-nums[i];
			if(h.containsKey(req_num)) {
				int[] arr= {h.get(req_num),i};
				return arr;
			}
			h.put(nums[i], i);
		}
		return null;
	}
}
