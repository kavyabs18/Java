package com.kodnest.Collections_Framework;

import java.util.ArrayList;

public class Array_List_1 {
	public static void main(String[] args) {
		ArrayList cpl = new ArrayList();
		cpl.add("Virat");
		cpl.add("Rohit");
		cpl.add("Dhoni");
		
		ArrayList fpl = new ArrayList();
		fpl.add("Messi");
		fpl.add("Ronaldo");
		
		ArrayList player = new ArrayList();
		player.add(cpl);
		player.add(fpl);
		System.out.println(player);
		
		ArrayList players = new ArrayList();
		players.addAll(cpl);
		players.addAll(fpl);
		System.out.println(players);
		
		System.out.println();
		System.out.println("Difference b/w add(), set()");
		System.out.println(cpl);
		cpl.add(0,"Sachin");
		System.out.println(cpl);
		cpl.set(2, "Sachin");
		System.out.println(cpl);
		
		System.out.println();
		System.out.println("remove() usage");
		System.out.println(cpl);
		cpl.remove("Sachin");
		System.out.println(cpl);
		cpl.remove(0);
		System.out.println(cpl);
	}
}
