package com.kodnest.constructor;

public class infiniteRecursion {
public static void main(String[] args) {
	fact();
}
public static void fact() {
	System.out.println("Expression!");
	fact();
}
}
