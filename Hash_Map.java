package com.kodnest.Collections_Framework;

import java.util.HashMap;
import java.util.Iterator;

public class Hash_Map {
	public static void main(String[] args) {
		HashMap<Integer, String> hm = new HashMap<Integer, String>();
		hm.put(15, "Java");
		hm.put(15, "HTML");
		hm.put(3, "CSS");
		hm.put(7, "JS");
		hm.put(null, null);
		System.out.println(hm);
	}
}
