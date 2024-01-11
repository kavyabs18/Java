package com.kodnest.Collections_Framework;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedList_Display {
	public static void main(String[] args) {
		LinkedList ll = new LinkedList();
		ll.add(10);
		ll.add(20);
		ll.add(30);
		ll.add(40);
		ll.add(50);
		ll.iterator();
		
		for(int i=0; i<ll.size(); i++) {
			System.out.print(ll.get(i)+" ");
		}
		
		System.out.println();
		for(Object j : ll) {
			System.out.print(j+" ");
		}
		
		System.out.println();
		Iterator iterator = ll.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
	}
}
