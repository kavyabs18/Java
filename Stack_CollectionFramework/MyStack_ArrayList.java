package com.kodnest.stack_collectionframework;

import java.util.ArrayList;
import java.util.Scanner;

public class MyStack_ArrayList {
	Scanner scan = new Scanner(System.in);
	ArrayList<Integer> al = new ArrayList<Integer>();
	void push() {
		System.out.println("Enter an Element to Push");
		int a = scan.nextInt();
		al.add(a);
		System.out.println(a+" is Pushed");
	}
	void pop() {
		if(al.isEmpty()) {
			System.out.println("Stack is Empty, Pop not Possible");
		}
		else {
			System.out.println("Element poped is : "+al.remove(al.size()-1));	
		}
	}
	void peek() {
		if(al.isEmpty()) {
			System.out.println("Stack is Empty, Peek not Possible");
		}
		else {
			System.out.println("The Last added Element is : "+al.get(al.size()-1));			
		}
	}
	void display() {
		if(al.size()==0) {
			System.out.println("Stack is Empty : "+al);
		}
		else {
			System.out.println("Stack Elements are : "+al);			
		}
	}
}
