package com.apnacollege;

import java.util.Scanner;

public class Strings {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Print name with space");
		String st = scan.nextLine();   //Tony Stark
		String s = scan.next();		//Tony
		System.out.println(st);
		System.out.println(s);
		
		//Concatination
		String firstname = "Tony";
		String lastname = "Stark";
		String fullname = firstname+" "+lastname;
		System.out.println(fullname);
		
		//Access characters of string
		for(int i=0; i<fullname.length(); i++) {
			System.out.print(fullname.charAt(i)+" ");
		}
		System.out.println();
		
		//compareTo()
		String a = "Apple";
		String b = "Bpple";
		System.out.println(a.compareTo(b));		//A<B so ans=-1
		
		//compare 2 strings
		String name1 = "Tony";
		String name2 = "Tony";
		System.out.println(name1==name2);		//true
		System.out.println(new String("Tony")==name1);		//false
		System.out.println(new String("Tony").equals(name1));		//true
		
		System.out.println(fullname.substring(0, 3));		//Ton(index 3 is not included)
		
		//parseInt() and toString()
		String str = "123";
		int n = Integer.parseInt(str);
		String num = Integer.toString(n);
		
	}
}
