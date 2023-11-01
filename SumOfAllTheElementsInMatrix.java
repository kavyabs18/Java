package com.kodnest.array;

public class SumOfAllTheElementsInMatrix {
public static void main(String[] args) {
	//declare and initialize an Array
	int a[][] = {{10,20,30},{40,50,60},{70,80,90}};
	
	//display the sum of all the elements
	int sum = 0;
	for(int i=0; i<a.length; i++) {
		for(int j=0; j<a[i].length; j++) {
			sum = sum + a[i][j];
		}
	}
	System.out.println("The Sum of Matrix is : "+sum);
}
}
