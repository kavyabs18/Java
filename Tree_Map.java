package com.kodnest.Collections_Framework;

import java.util.Collection;
import java.util.Set;
import java.util.TreeMap;

public class Tree_Map {
	public static void main(String[] args) {
		TreeMap<Integer, String> tm = new TreeMap<Integer, String>();
		tm.put(1, "Java");
		tm.put(5, null);
		tm.put(3, null);
		tm.put(7, "JS");
		System.out.println(tm);
		Set<Integer>keySet = tm.keySet();
		System.out.println(keySet);
		Collection<String>values = tm.values();
		System.out.println(values);
	}
}
