package com.kodnest.Collections_Framework;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayList_Display {
	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		al.add(50);
		System.out.println(al.size());
//		System.out.println(al);
		
		Iterator iterator = al.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
		
		System.out.println("for Loop");
		for(int i=0; i<al.size(); i++) {
			System.out.print(al.get(i)+" ");
		}
		
		System.out.println();
		System.out.println("while Loop");
		int i=0;
		while(i<al.size()) {
			System.out.print(al.get(i)+" ");
			i++;
		}
		
		System.out.println();
		System.out.println("do-while Loop");
		i=0;
		do {
			System.out.print(al.get(i)+" ");
			i++;
		}while(i<al.size());
		
		System.out.println();
		System.out.println("for-each Loop");
		for(Object j: al) {
			System.out.print(j+" ");
		}
	}
}
