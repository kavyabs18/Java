package com.kodnest.loopingpractice;

public class Q9 {
public static void main(String[] args) {
	for(int i=1; i<=5; i++)
	{
		for(int j=1; j<=5; j++)
		{
			if(j%2==0&&i%2==0||j==3&&i==5||j==3&&i==1||i==3&&j==1||i==3&&j==5)
			{
				System.out.print("*");
			}
			else {
				System.out.print(" ");
			}
		}
		System.out.println();
	}
}
}
