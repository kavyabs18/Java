package com.kodnest.queue_collectionframework;

import java.util.ArrayList;
import java.util.Scanner;

public class MyQueue_ArrayList {
	Scanner scan = new Scanner(System.in);
	ArrayList<Integer> al  = new ArrayList<Integer>();
	void enque() {
		System.out.println("Enter an Element to Push");
		int a = scan.nextInt();
		al.add(a);
		System.out.println("Push Success");
	}
	void deque() {
		if(al.isEmpty()) {
			System.out.println("Queue is Empty, Pop not Possible");
		}
		else{
			System.out.println("Popped element is : "+al.get(0));
			al.remove(0);
		}
	}
	void peek() {
		if(al.isEmpty()) {
			System.out.println("Queue is Empty, Peek not Possible");
		}
		else {
			System.out.println("The First added Element is : "+al.get(0));			
		}
	}
	void display() {
		if(al.isEmpty()) {
			System.out.println("Queue is Empty : "+al);
		}
		else {
			System.out.println("Queue Elements are : "+al);			
		}
	}
}
