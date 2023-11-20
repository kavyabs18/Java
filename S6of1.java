package com.kodnest.stringQuestionsinkodnest;

public class S6of1 {
public static void main(String[] args) {
	String str = "Hello World Java is Fun";
	//Fun is Java World Hello
	
	String []s = str.split(" ");
	String x= "";
	for(int i=s.length-1;i>=0; i--) {
		x = x+s[i]+" ";
	}
	System.out.println(x);//output as string
	
	
	
	for(int i=s.length-1;i>=0; i--) {
		System.out.print(s[i]+" ");//display
	}
	System.out.println();
	
	
	
	//olleH dlroW avaJ si nuF
	String a="";
	for(int i=0; i<s.length; i++) {
		StringBuffer buf = new StringBuffer(s[i]);
		a = a+buf.reverse()+" ";
	}
	System.out.print(a);
}
}
