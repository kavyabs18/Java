package com.kodnest.w3resource;

import java.util.Scanner;

public class Q27 {
public static void main(String[] args) {
	/*Write a Java program to convert a octal number to a hexadecimal number.
Input Data:
Input a octal number : 100,  15
Expected Output

Equivalent hexadecimal number: 40,  D*/
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter the octal number");
	int a = scan.nextInt();
	int i=0;
	int sum=0;
	while(a!=0) {
		sum=(int) (sum+Math.pow(8, i)*(a%10));
		a=a/10;
		i++;
	}
	System.out.println("In Decimal: "+sum);
	i=0;
	int n[] = new int[20];
	while(sum!=0) {
		n[i]=sum%16;
		sum=sum/16;
		i++;
	}
	System.out.print("In Hexadecimal: ");
	for(int j=i-1; j>=0; j--) {
		if(n[j]>9) {
			System.out.print((char)(n[j]+55));
		}
		else {
			System.out.print(n[j]);
		}
	}
}
}
