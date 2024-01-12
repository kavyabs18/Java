package com.kodnest.Collections_Framework;

import java.util.TreeSet;

public class Tree_Set {
	public static void main(String[] args) {
		TreeSet ts = new TreeSet();
		ts.add(20);
		ts.add(40);
		ts.add(50);
		ts.add(29);
		ts.add(50);
		System.out.println(ts);
		
		TreeSet ts1 = new TreeSet();
		ts1.add("Virat");
		ts1.add("Rohit");
		ts1.add("Dhoni");
		ts1.add("ABD");
		ts1.add("Sachin");
		System.out.println(ts1);
	}
}
