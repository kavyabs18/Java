package com.kodnest.Collections_Framework;

import java.util.LinkedList;

public class Min_and_Max_Values {
	public static void main(String[] args) {
		LinkedList ll = new LinkedList();
		ll.add(30);
		ll.add(40);
		ll.add(10);
		ll.add(50);
		ll.add(78);
		ll.sort(null);
		System.out.println(ll.get(0));
		System.out.println(ll.getLast());
	}
}
