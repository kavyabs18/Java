package com.kodnest.exception_handling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Demo {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int size=0;
		try {
			System.out.println("User please enter the size of the array");
			size=scan.nextInt();
			int []a = new int[size];
			System.out.println("Enter the elements");
			
			for(int i=0; i<a.length; i++) {
				a[i]=scan.nextInt();
			}
			
			System.out.println("User enter the index value");
			int x = scan.nextInt();
			System.out.println(a[x]);
		}
		catch(NegativeArraySizeException e1) {
			System.out.println("Enter a positive number for Array size");
		}
		catch(InputMismatchException e2) {
			System.out.println("Enter only the digits");
		}
		catch(ArrayIndexOutOfBoundsException e3) {
			System.out.println("Enter the index value in the range of 0 to "+(size-1));
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
}

//NegativeArraySizeException
//ArrayIndexOutOfBoundsException
//InputMismatchException