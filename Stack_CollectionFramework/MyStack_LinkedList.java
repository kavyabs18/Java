package com.kodnest.stack_collectionframework;

import java.util.LinkedList;
import java.util.Scanner;

public class MyStack_LinkedList {
	Scanner scan = new Scanner(System.in);
	LinkedList<Integer> l = new LinkedList<Integer>();

	void push() {
		System.out.println("Enter an Element to Push");
		int a = scan.nextInt();
		l.add(a);
		System.out.println(a + " is Pushed");
	}

	void pop() {
		if (l.isEmpty()) {
			System.out.println("Stack is Empty, Pop not Possible");
		} else {
			System.out.println("Element poped is : " + l.remove(l.size() - 1));
		}
	}

	void peek() {
		if (l.isEmpty()) {
			System.out.println("Stack is Empty, Peek not Possible");
		} else {
			System.out.println("The Last added Element is : " + l.get(l.size() - 1));
		}
	}

	void display() {
		if (l.size() == 0) {
			System.out.println("Stack is Empty : " + l);
		} else {
			System.out.println("Stack Elements are : " + l);
		}
	}
}
