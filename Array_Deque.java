package com.kodnest.Collections_Framework;

import java.util.ArrayDeque;

public class Array_Deque {
	public static void main(String[] args) {
		ArrayDeque ad = new ArrayDeque();
		ad.add(20);
		ad.add(30);
		ad.addFirst(60);
		ad.addLast(80);
		System.out.println(ad);
	}
}
