package com.kodnest.Collections_Framework;

import java.util.LinkedList;

public class Linked_List {
	public static void main(String[] args) {
		LinkedList ll1 = new LinkedList();
		ll1.add(20);
		ll1.add(30);
		
		LinkedList ll2 = new LinkedList();
		ll2.add(20);
		ll2.add(30);
		
		LinkedList ll4 = new LinkedList();
		ll4.add(ll1);
		ll4.add(ll2);
		System.out.println(ll4);
		
		LinkedList ll3 = new LinkedList();
		ll3.addAll(ll1);
		ll3.addAll(ll2);
		System.out.println(ll3);
	}
}
