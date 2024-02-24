package com.kodnest.data_structures;

import java.util.ArrayList;
import java.util.Stack;

public class Demonstaration_of_Stack {
	public static void main(String[] args) {
//			Legacy class
		Stack<Integer> stack = new Stack<Integer>();
		stack.push(10);
		stack.push(20);
		stack.push(30);
		System.out.println(stack);
		stack.pop();
		System.out.println(stack);
		System.out.println(stack.peek());
		System.out.println(stack);

//			Demo
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		al.add(50);
		al.add(60);
		System.out.println(al);
		al.remove(al.size() - 1);
		System.out.println(al);
		System.out.println(al.get(al.size() - 1));
	}
}
