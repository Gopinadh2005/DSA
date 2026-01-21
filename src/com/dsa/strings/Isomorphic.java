package com.dsa.strings;

import java.util.HashMap;

public class Isomorphic {

	public static void main(String[] args) {
		String s="egg";
		String t="add";
		System.out.println(isomorphic(s,t));

	}
	public static boolean isomorphic(String s,String t) {
		HashMap<Character,Character> h=new HashMap<>();
		for(int i=0;i<s.length();i++) {
			if(h.containsKey(s.charAt(i))) {
				if(!h.get(s.charAt(i)).equals(t.charAt(i))) {
					return false;
				}else {
					if(h.containsValue(t.charAt(i))) {
						return false;
					}
					h.put(s.charAt(i), t.charAt(i));
				}
			}
		}
		return true;
	}
}
