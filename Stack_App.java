package com.kodnest.data_structures;

import java.util.Scanner;

public class Stack_App {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("User Enter Stack Size");
		int n = scan.nextInt();
		Stack stack = new Stack(n);
		while(true) {
			System.out.println("ENTER YOUR CHOICE");
			System.out.println("=============================");
			System.out.println("Press 1 ---------> Push/Insert");
			System.out.println("Press 2 ---------> Pop/Delete");
			System.out.println("Press 3 ---------> Display");
			System.out.println("Press any other number to STOP");
			System.out.println("=============================");
			int choice = scan.nextInt();
			switch(choice) {
			case 1 : stack.push();
					 break;
			case 2 : stack.pop();
					 break;
			case 3 : stack.display();
					 break;
			default: System.exit(0);
			}
		}
	}
}

class Stack{
	protected Scanner scan = new Scanner(System.in);
	private int s[];
	private int size;
	private int top = -1;
	public Stack(int n){
		s = new int[n];
		size = s.length;
	}
	
	public void push() {
		int elem;
		if(top==size-1) {
			System.out.println("Stack is Full");
			System.out.println("Push Not Possible");
		}
		else {
			System.out.println("User please enter the element");
			elem = scan.nextInt();
			top++;
			s[top] = elem;
		}
	}
	
	public void pop() {
		if(top==-1) {
			System.out.println("Stack is Empty");
			System.out.println("Pop Not Possible");
		}
		else {
			System.out.println("The element deleted is : "+s[top]);
			--top;
		}
	}
	
	public void display() {
		if(top==-1) {
			System.out.println("Display Not Possible");
		}
		else {
			for(int i=top; i>=0; i--) {
				System.out.println(s[i]);
			}
		}
	}
}