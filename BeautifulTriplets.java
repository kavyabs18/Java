package com.kodnest.programing;

import java.util.Scanner;

class BeautifulTriplets {
 public static void main(String args[] )  
 {
	 
	 // 7 3
	 // 1 2 4 5 7 8 10       3
	 
	 // 5 2
	 // 1 2 4 5 7      0
     Scanner scan = new Scanner(System.in);
     System.out.println("User please enter the size of the array");
     int n = scan.nextInt();
     System.out.println("User please enter difference");
     int d = scan.nextInt();
     System.out.println("User please enter array elemants");
     int []a = new int[n];
     for(int i=0; i<a.length; i++){
         a[i] = scan.nextInt();
     }
     int count=0;
     for(int i=0; i<a.length; i++){
         for(int j=i+1; j<a.length; j++){
             if(a[j]-a[i]==d){
                 for(int k=j+1; k<a.length; k++){
                     if(a[k]-a[j]==d){
                         count++;
                     }
                 }
             }
         }
     }
     System.out.println("Number of triplets : "+count);
 }
}