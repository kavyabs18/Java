package com.kodnest.programing;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class Collection3 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Elements");
		String al1 = scan.nextLine();
		String[] al1list = al1.split(" ");
		
		ArrayList al = new ArrayList();
		for (Object object : al1list) {
			al.add(object);
		}
		
		HashSet hs = new HashSet();
		hs.addAll(al);
		al.clear();
		al.addAll(hs);
		al.sort(null);
		System.out.println("Sorted ArrayList:");
		for (Object object : al) {
			System.out.println(object);
		}
		
//		Solution
//		Enter Elements
//		elephant dog cat dog rabbit
//		Sorted ArrayList:
//		cat
//		dog
//		elephant
//		rabbit
	}
}
