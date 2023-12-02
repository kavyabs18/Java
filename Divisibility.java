package com.kodnest.programing;

import java.util.Scanner;

class Divisibility {
 public static void main(String args[] )  
 {
	 // to check weather last element is divisible by 10 or not
     Scanner scan = new Scanner(System.in);
     System.out.println("User please enter the size of the array");
     int n = scan.nextInt();
     System.out.println("User please enter the array elements");
     int []a = new int[n];
     for(int i=0; i<a.length; i++){
         a[i] = scan.nextInt();
     }
     if(a[a.length-1]%10==0){
         System.out.println("Yes");
     }
     else{
         System.out.println("No");
     }
 }
}