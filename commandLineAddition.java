package com.kodnest.main;

public class commandLineAddition {
static public void main(String shiva[]) {
	System.out.println("Sum of : "+shiva[0]+" and "+shiva[1]);
	int a = Integer.parseInt(shiva[0]);
	int b = Integer.parseInt(shiva[1]);
	
	System.out.println(a+b);
		
	//length of array by command line arguments
	System.out.println("Length of Array : "+shiva.length);
	
	
	//advantage : you can run code without using main method
	//public static void main(String[] args)
	//static public void main(String args[])
	//static public void main(String shiva[])
	// valid identifier name (args): a_A, a$A, abcd, $, abc123, _$
	/* invalid args: only number, cannot start with number, only underscore, 
	other than _ and $ no special character is permitted*/
}
}
