package com.kodnest.programing;

import java.util.Scanner;

class Zoo {
 public static void main(String args[] )  
 {
	 // check 2x=y or not
     Scanner scan = new Scanner(System.in);
     System.out.println("User please enter z's and o's");
     String s = scan.nextLine();
     s = s.toLowerCase();
     int x=0;
     int y=0;
     for(int i=0; i<s.length(); i++){
         if(s.charAt(i)=='z'){
             x++;
         }
         if(s.charAt(i)=='o'){
             y++;
         }
     }
     if(2*x==y){
         System.out.println("Yes");
     }
     else{
         System.out.println("No");
     }
 }
}