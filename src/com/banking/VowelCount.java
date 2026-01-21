package com.banking;

public class VowelCount {

	public static void main(String[] args) {
		
		String name="gopinadh";
		int count=0;
		for(int i=0;i<name.length();i++) {
			if("aeiou".indexOf(name.charAt(i))==-1) {
				count++;
			}
//			else {
//				count++;
//			}
		}
		System.out.println("count="+count);
	}
}
