package com.kodnest.Collections_Framework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Comparator_interface_type2 {
	public static void main(String[] args) {
		Students s1 = new Students(63, "John");
		Students s2 = new Students(20, "Jack");
		Students s3 = new Students(18, "Ria");
		Students s4 = new Students(28, "Thor");
		Students s5 = new Students(12, "Ryan");
		
		ArrayList<Students> al = new ArrayList<Students>();
		al.add(s1);
		al.add(s2);
		al.add(s3);
		al.add(s4);
		al.add(s5);
		System.out.println(al);
		Collections.sort(al, new Comparator<Students>(){

			@Override
			public int compare(Students o1, Students o2) {
//				if(o1.name.compareTo(o2.name)>0) {
//					return 1;
//				}
//				else if(o1.name.compareTo(o2.name)<0) {
//					return -1;
//				}
//				return 0;
				
				if(o1.id>o2.id) {
					return 1;
				}
				else if(o1.id<o2.id) {
					return -1;
				}
				return 0;
			}
			
		});
		System.out.println(al);
	}
}

class Students {
	int id;
	String name;
	
	public Students(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
	@Override
	public String toString() {
		return id+"-"+name;
	}
}
