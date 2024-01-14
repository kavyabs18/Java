package com.kodnest.Collections_Framework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.TreeSet;

public class sorting {
	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		al.add(10);
		al.add(30);
		al.add(50);
		al.add(50);
		System.out.println(al);
		
		//retain duplicates
		Collections.sort(al);
		System.out.println(al);
		
		//removal of duplicates
		//ctrl+shift+o to remove or add import statements
		TreeSet ts = new TreeSet(al);
		System.out.println(ts);
	}
}
