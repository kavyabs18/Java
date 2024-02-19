package com.kodnest.queue_collectionframework;

import java.util.ArrayDeque;
import java.util.Scanner;

public class MyQueue_ArrayDeque {
	Scanner scan = new Scanner(System.in);
	ArrayDeque<Integer> ad = new ArrayDeque<Integer>();
	void enque() {
		System.out.println("Enter an Element to Push");
		int a = scan.nextInt();
		ad.add(a);
		System.out.println("Push Success");
	}
	void deque() {
		if(ad.isEmpty()) {
			System.out.println("Queue is Empty, Pop not Possible");
		}
		else{
			System.out.println("Popped element is : "+ad.getFirst());
			ad.removeFirst();
		}
	}
	void peek() {
		if(ad.isEmpty()) {
			System.out.println("Queue is Empty, Peek not Possible");
		}
		else {
			System.out.println("The First added Element is : "+ad.getFirst());			
		}
	}
	void display() {
		if(ad.isEmpty()) {
			System.out.println("Queue is Empty : "+ad);
		}
		else {
			System.out.println(ad);			
		}
	}
}
