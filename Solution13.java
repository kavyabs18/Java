package com.kodnest.Questions;

public class Solution13 {
public static void main(String[] args) {
//wajp convert hello java program to margorp avaj olleh
	String s = "hello java program";
	String []split = s.split(" ");
	for(int i=split.length-1; i>=0; i--) {
		for(int j=split[i].length()-1; j>=0; j--) {
			System.out.print(split[i].charAt(j)+"");			
		}
		System.out.print(" ");
	}
	
	
	
	
	
	
	//or String []split = s.split(" ");
		System.out.println();
		for(int i=split.length-1; i>=0; i--) {
			StringBuffer str = new StringBuffer(split[i]);
			System.out.print(str.reverse()+" ");
		}
		
		
		
	//or String []split = s.split(" ");
		System.out.println();
		String [] str = s.split("");
		for(int i=str.length-1; i>=0; i--) {
			System.out.print(str[i]+"");
		}
}
}
