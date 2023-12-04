package com.kodnest.main;

class passByValue {
	public static void main(String[] args) {
		int num = 50;
		System.out.println("Original num = "+num);
		modify(num);
		System.out.println("num after executing modify() = "+num);
	}

	public static void modify(int numCopy) {
		System.out.println("Original numCopy = "+numCopy);
		numCopy = 100;
		System.out.println("numCopy after modifications = "+numCopy);
	}
}
