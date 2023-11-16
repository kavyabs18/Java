package com.kodnest.Questions;

public class Solution12 {
public static void main(String[] args) {
//wajp convert hello java program to olleh avaj margorp
	String s = "hello java program";
	String []split = s.split(" ");
	for(int i=0; i<split.length; i++) {
		for(int j=split[i].length()-1; j>=0; j--) {
			System.out.print(split[i].charAt(j)+"");			
		}
		System.out.print(" ");
	}
	
	
	
//or String []split = s.split(" ");
	System.out.println();
	for(int i=0; i<split.length; i++) {
		StringBuffer str = new StringBuffer(split[i]);
		System.out.print(str.reverse()+" ");
	}
}
}
