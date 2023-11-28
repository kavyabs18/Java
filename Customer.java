package com.kodnest.banking;

public class Customer {
public static void main(String[] args) {
	Bank b = new Bank();
	System.out.println(b.getHeromoney());
	b.setHeromoney(15000);
	System.out.println(b.getHeromoney());
}
}
