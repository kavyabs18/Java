package com.kodnest.queue_collectionframework;

import java.util.LinkedList;
import java.util.Scanner;

public class MyQueue_LinkedList {
	Scanner scan = new Scanner(System.in);
	LinkedList<Integer> ll  = new LinkedList<Integer>();
	void enque() {
		System.out.println("Enter an Element to Push");
		int a = scan.nextInt();
		ll.add(a);
		System.out.println("Push Success");
	}
	void deque() {
		if(ll.isEmpty()) {
			System.out.println("Queue is Empty, Pop not Possible");
		}
		else{
			System.out.println("Popped element is : "+ll.get(0));
			ll.remove(0);
		}
	}
	void peek() {
		if(ll.isEmpty()) {
			System.out.println("Queue is Empty, Peek not Possible");
		}
		else {
			System.out.println("The First added Element is : "+ll.get(0));			
		}
	}
	void display() {
		if(ll.isEmpty()) {
			System.out.println("Queue is Empty : "+ll);
		}
		else {
			System.out.println(ll);			
		}
	}
}
