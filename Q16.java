package com.kodnest.w3resource;

public class Q16 {
/* Write a Java program to print a face.
Expected Output

 +'''''+                                                 
[| o o |]                                                
 |  ^  |                                                 
 | '-' |                                                 
 +-----+
*/
	public static void main(String[] args) {
		for(int i=1; i<=5; i++) {
			for(int j=1; j<=9; j++) {
				if(i==1 && j==2 || i==1 && j==8) {
					System.out.print("+");
				}
				else if(i==1 && j>2 &&j <8) {
					System.out.print("'");
				}
				else if(i==2 && j==1) {
					System.out.print("[");
				}
				else if(i==2 && j==9) {
					System.out.print("]");
				}
				else if(i>1 && i<5 && j==2 || i>1 && i<5 && j==8) {
					System.out.print("|");
				}
				else if(i==5 && j==2 || i==5 && j==8) {
					System.out.print("+");
				}
				else if(i==5 && j>2 &&j <8) {
					System.out.print("-");
				}
				else if(i==2 && j==4 || i==2 && j==6) {
					System.out.print("o");
				}
				else if(i==3 && j==5) {
					System.out.print("^");
				}
				else if(i==4 && j==4 || i==4 && j==6) {
					System.out.print("'");
				}
				else if(i==4 && j==5) {
					System.out.print("-");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}
