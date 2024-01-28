package com.kodnest.w3resource;

import java.util.Scanner;

public class Q23 {
public static void main(String[] args) {
	/* Write a Java program to convert a binary number to a hexadecimal number.
Input Data:
Input a Binary Number: 1101
Expected Output

HexaDecimal value: D*/
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter the binary number");
	int a = scan.nextInt();
	int i=0;
	int sum=0;
	while(a>0) {
		sum=(int) (sum+Math.pow(2, i)*(a%10));
		a=a/10;
		i++;
	}
	System.out.println("In Decimal: "+sum);
	int []n = new int[20];
	i=0;
	while(sum!=0) {
		n[i]=sum%16;
		sum=sum/16;
		i++;
	}
	System.out.print("In Hexadecimal: ");
	for (int j = i - 1; j >= 0; j--) {
        if (n[j] > 9) {
            System.out.print((char)(n[j] + 55));
        } else {
            System.out.print(n[j]);
        }
    }
}
}
