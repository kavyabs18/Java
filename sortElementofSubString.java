package com.kodnest.Questions;

public class sortElementofSubString {
	public static String getSmallestAndLargest(String s, int k) {
		String smallest = "";
		String largest = "";
		String emp = "";
		for(int i=0; i<s.length(); i++) {
			for(int j=i+1; j<=s.length(); j++) {
				if(s.substring(i,j).length() == k) {
					emp = emp +s.substring(i,j)+" ";
				}
			}
		}
		String [] split = emp.split(" ");
		for(int i=0; i<split.length; i++) {
			for(int j=0; j<split.length-i-1; j++) {
				if(split[j].compareTo(split[j+1])>0) {
					String temp = split[j];
					split[j] = split[j+1];
					split[j+1] = temp;
				}
			}
		}
		smallest = split[0];
		largest = split[split.length-1];
		return smallest + "\n" + largest;
	}
public static void main(String[] args) {
}
}
