package com.kodnest.Collections_Framework;

import java.util.Iterator;
import java.util.*;		//fail-fast
import java.util.concurrent.*;		//fail-safe
import java.util.concurrent.CopyOnWriteArrayList;

public class Concurrent_Modification {
	public static void main(String[] args) {
		CopyOnWriteArrayList al = new CopyOnWriteArrayList();
		al.add(20);
		al.add(30);
		al.add(40);
		
//		for (Object object : al) {
//			System.out.println(object);
//			al.add(99);
//		}
		
		Iterator iterator = al.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
			al.add(99);
		}
		System.out.println(al);
	}
}
