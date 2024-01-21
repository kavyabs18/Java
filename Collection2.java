package com.kodnest.programing;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.TreeSet;

public class Collection2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Numbers");
		String al1 = scan.nextLine();
		String[] al1list = al1.split(" ");
		
		System.out.println("Enter Numbers");
		String al2 = scan.nextLine();
		String[] al2list = al2.split(" ");
		
		ArrayList al = new ArrayList();
		for (Object object : al1list) {
			al.add(object);
		}
		for (Object object : al2list) {
			al.add(object);
		}
		
		TreeSet ts = new TreeSet();
		ts.addAll(al);
		System.out.println(ts);
		
	}
}
