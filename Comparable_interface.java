package com.kodnest.Collections_Framework;

import java.util.ArrayList;
import java.util.Collections;

public class Comparable_interface {
	public static void main(String[] args) {
		Stu s1 = new Stu(63, "John");
		Stu s2 = new Stu(20, "Jack");
		Stu s3 = new Stu(18, "Ria");
		Stu s4 = new Stu(28, "Thor");
		Stu s5 = new Stu(12, "Ryan");
		
		ArrayList<Stu> al = new ArrayList<Stu>();
		al.add(s1);
		al.add(s2);
		al.add(s3);
		al.add(s4);
		al.add(s5);
		System.out.println(al);
		Collections.sort(al);
		System.out.println(al);
	}
}

class Stu implements Comparable<Stu> {
	int id;
	String name;
	
	public Stu(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
	@Override
	public String toString() {
		return id+"-"+name;
	}

	@Override
	public int compareTo(Stu o) {
		if(this.id>o.id) {
			return 1;
		}
		else if(this.id<o.id) {
			return -1;
		}
		return 0;
		
//		if(this.name.compareTo(o.name)>0) {
//			return -1;
//		}
//		else if(this.name.compareTo(o.name)<0) {
//			return 1;
//		}
//		return 0;
//	}
}
}