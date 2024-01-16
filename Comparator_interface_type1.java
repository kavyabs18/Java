package com.kodnest.Collections_Framework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Comparator_interface_type1 {
	public static void main(String[] args) {
		Stud s1 = new Stud(63, "John");
		Stud s2 = new Stud(20, "Jack");
		Stud s3 = new Stud(18, "Ria");
		Stud s4 = new Stud(28, "Thor");
		Stud s5 = new Stud(12, "Ryan");
		
		ArrayList<Stud> al = new ArrayList<Stud>();
		al.add(s1);
		al.add(s2);
		al.add(s3);
		al.add(s4);
		al.add(s5);
		System.out.println(al);
		Collections.sort(al, new Sorting());
		System.out.println(al);
	}
}

class Stud {
	int id;
	String name;
	
	public Stud(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
	@Override
	public String toString() {
		return id+"-"+name;
	}
}

class Sorting implements Comparator<Stud>{

	@Override
	public int compare(Stud o1, Stud o2) {
//		if(o1.name.compareTo(o2.name)>0) {
//			return 1;
//		}
//		else if(o1.name.compareTo(o2.name)<0) {
//			return -1;
//		}
//		return 0;
		
		if(o1.id>o2.id) {
			return 1;
		}
		else if(o1.id<o2.id) {
			return -1;
		}
		return 0;
	}
	
}