package com.kodnest.Questions;

public class Solution18 {
public static void main(String[] args) {
	//wajp to find the frequency of a character
	int count=0;
	int m=0;
	int c=0;
	String s = "mathematics";
	char [] str = s.toCharArray();

	for(int i=0; i<s.length(); i++) {
		for(int j=0; j<s.length(); j++) {
			if(str[i]==s.charAt(j)) {
				count++;
			}
		}
		if(i==0) {
			System.out.println("Frequency of "+str[i]+"="+count);
		}
		if(i>0) {
			for(int k=0;k<s.length();k++) {
				if(c<s.length()-1) {
					if(str[i]==str[c]) {
						c++;
						m++;
					}
				}
			}
			if(m==0) {
				System.out.println("Frequency of "+str[i]+"="+count);				
			}
			m=0;
		}
		count=0;
	}
}
}
