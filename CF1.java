package com.kodnest.programing;

import java.util.ArrayList;
import java.util.HashMap;

public class CF1 {
public static void main(String[] args) {
	ArrayList<String> al = new ArrayList<String>();
	al.add("apple");
	al.add("banana");
	al.add("apple");
	al.add("grape");
	al.add("apple");
	HashMap<String, Integer> hm = new HashMap<String, Integer>();
	for(String str:al) {
		hm.put(str, hm.getOrDefault(str, 0) + 1);
		
//		or
//		if(!(hm.containsKey(str))) {
//			hm.put(str, 1);			
//		}
//		else {
//			hm.put(str, hm.get(str)+1);
//		}
	}
	System.out.println(hm);
}
}
