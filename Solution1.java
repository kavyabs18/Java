package com.kodnest.access_modifier_1;

public class Solution1 {
	public int a=10;
	protected void display() {
		System.out.println(a);
	}
}


//private is a class level AM
//default is package level AM
//protected is package level Access, and can access to subclasses present in different package
//public is project level AM