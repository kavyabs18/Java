package com.kodnest.main;

public class mainMethodOverloading {
	public static void main(String[] args) {
		System.out.println("Hello");
		main();
		main(2);
	}
	public static void main() {
		main(3);
		System.out.println("1");
	}
	static void main(int a) {
		System.out.println(a);
	}
}
