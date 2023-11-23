package com.kodnest.constructor;

public class finiteRecursion {
public static void main(String[] args) {
	int n=5;
	fact(n);
}
public static void fact(int n) {
	if(n==0) {
		return;
	}
	System.out.println("Executing "+n);
	n--;
	fact(n);
}
}
