package com.kodnest.Collections_Framework;

import java.util.Dictionary;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Properties;
import java.util.Stack;
import java.util.Vector;

public class Main {
	public static void main(String[] args) {
		Stack s = new Stack();
		s.add(10);
		s.add(20);
		System.out.println(s);

		Vector v = new Vector();
		v.add(10);
		v.add(20);
		System.out.println(v);

		Hashtable ht = new Hashtable();
		ht.put(1, 10);
		ht.put(5, 50);
		System.out.println(ht);

		Properties p = new Properties();
		p.put(5, 50);
		p.put(3, 30);
		System.out.println(p);
		
//		Enumeration e = new Enumeration();		error
//		Dictionary d = new Dictionary();		error 
//because it is abstract class so by extending we can create an OBJECT of it.
		
	}
}
