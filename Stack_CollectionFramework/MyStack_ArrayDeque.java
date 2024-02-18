package com.kodnest.stack_collectionframework;

import java.util.ArrayDeque;
import java.util.Scanner;

public class MyStack_ArrayDeque {
	Scanner scan = new Scanner(System.in);
	ArrayDeque<Integer> ad = new ArrayDeque<Integer>();
	void push() {
		System.out.println("Enter an Element to Push");
		int a = scan.nextInt();
		ad.add(a);
		System.out.println(a+" is Pushed");
	}
	void pop() {
		if(ad.isEmpty()) {
			System.out.println("Stack is Empty, Pop not Possible");
		}
		else {
			System.out.println("Element poped is : "+ad.removeLast());
		}
	}
	void peek() {
		if(ad.isEmpty()) {
			System.out.println("Stack is Empty, Peek not Possible");
		}
		else {
			System.out.println("The Last added Element is : "+ad.getLast());			
		}
	}
	void display() {
		if(ad.size()==0) {
			System.out.println("Stack is Empty : "+ad);
		}
		else {
			System.out.println("Stack Elements are : "+ad);			
		}
	}
}
