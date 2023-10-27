package com.kodnest.w3resource;

public class Q8 {
/* 8. Write a Java program to display the following pattern.
Sample Pattern :

   J    a   v     v  a                                                  
   J   a a   v   v  a a                                                 
J  J  aaaaa   V V  aaaaa                                                
 JJ  a     a   V  a     a   */
	public static void main(String[] args) {
		for(int i=1; i<=4; i++) {
			for(int j=1; j<=23; j++) {
				if(i==1&&j==5||i==2&&j==5||i==3&&j==4||i==3&&j==1||i==4&&j==2||i==4&&j==3) {
					System.out.print("J");
				}
				if(i==1&&j==12||i==1&&j==17||i==2&&j==13||i==2&&j==16||i==3&&j==13||i==3&&j==14||i==4&&j==14) {
					System.out.print("v");
				}
				if(i==1&&j==9||i==2&&j==8||i==2&&j==10||i==3&&j>=6&&j<=10||i==4&&j==5||i==4&&j==11) {
					System.out.print("a");
				}
				else {
					System.out.print(" ");
				}
				if(i==1&&j==18||i==2&&j==17||i==2&&j==18||i==3&&j>=15&&j<=17||i==4&&j==15||i==4&&j==20) {
					System.out.print("a");
				}
			}
			System.out.println();
		}
	}
}
