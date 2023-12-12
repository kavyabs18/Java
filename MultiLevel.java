package com.kodnest.inheritance_in_interface;

class MultiLevel implements Demo {
	int password = 123;
	void display() {
		System.out.println(num);
	}
}

class Multi extends MultiLevel{
	void display() {
		System.out.println(password);
	}
}
