package com.kodnest.Collections_Framework;

import java.util.PriorityQueue;

public class Priority_Queue {
	public static void main(String[] args) {
		PriorityQueue pq = new PriorityQueue();
		pq.add(20);
		pq.add(10);
		pq.add(50);
		pq.add(70);
		System.out.println(pq);
		
		PriorityQueue pq1 = new PriorityQueue();
		pq1.add("docker");
		pq1.add("jenkins");
		pq1.add("kubernates");
		pq1.add("devops");
		pq1.add("git");
		System.out.println(pq1);
		
		PriorityQueue pq2 = new PriorityQueue();
//		pq2.add(10);
//		pq2.add("git");
//		System.out.println(pq2);	//ClassCastException
	}
}
