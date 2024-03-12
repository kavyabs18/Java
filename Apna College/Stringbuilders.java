package com.apnacollege;

public class Stringbuilders {
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder("he");
		sb.append("l");
		sb.append("l");
		sb.append("o");
		System.out.println(sb);
		
		//Insert @ some index
		sb.insert(1, 'a');
		System.out.println(sb);
		
		//Delete @ some index
		sb.delete(1, 2);
		System.out.println(sb);
		
		//Replace @ some index a character
		sb.setCharAt(0, 'P');
		System.out.println(sb);
		
		//Delete @ some index a String
		sb.replace(0, 1, "John H");
		System.out.println(sb);
	}
}
