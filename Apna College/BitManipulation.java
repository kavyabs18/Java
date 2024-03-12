package com.apnacollege;

import java.util.Scanner;

public class BitManipulation {
	static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		int n = 5;		//0101
		System.out.println("Press - 1    get bit");
		System.out.println("Press - 2    set bit");
		System.out.println("Press - 3    clear bit");
		System.out.println("Press - 4    update bit");
		System.out.println("Enter your choice");
		int choice = scan.nextInt();
		System.out.println("Enter the Position");
		int pos = scan.nextInt();
		int bitMask = 1;
		bitMask = bitMask<<pos;
		switch(choice) {
			case 1 : getBit(n,bitMask);
					 break;
					 
			case 2 : setBit(n,bitMask);
					 break;
					 
			case 3 : clearBit(n,bitMask);
					 break;
					 
			case 4 : updateBit(n,bitMask);
					 break;
					 
			default : System.out.println("Ivalid Input");
		}
	}
	
	public static void getBit(int n, int bitMask) {
		int result = n & bitMask;
		if(result!=0) {
			System.out.println("Bit was 1");
		}else {
			System.out.println("Bit was 0");
		}
	}

	public static void setBit(int n, int bitMask) {
		int result = n | bitMask;
		System.out.println("Number after Bit Manipulation is : "+result);
	}
	
	public static void clearBit(int n, int bitMask) {
		int result = n ^ bitMask;
		System.out.println("Number after Bit Manipulation is : "+result);
	}
	
	public static void updateBit(int n, int bitMask) {
		int result = n & bitMask;
		if(result!=0) {
			clearBit(n, bitMask);
		}else {
			setBit(n, bitMask);
		}
	}
}
