package com.kodnest.w3resource;

public class Q39 {
public static void main(String[] args) {
	/*Write a Java program to create and display a unique three-digit number using 1, 2, 3, 4. Also count how many three-digit numbers are there.
Expected Output

123                                                      
124                                                      
...                                            
                                                   
431                                                      
432                                                      
Total number of the three-digit-number is 24*/
	int count=0;
	for(int i=1; i<5; i++) {
		for(int j=1; j<5 ;j++) {
			for(int k=1; k<5; k++) {
				if(i!=j&&i!=k&&j!=k) {
					System.out.println(i+""+j+""+k);
					count++;
				}
			}
		}
	}
	System.out.println("Total number of the three-digit-number is "+count);
}
}
