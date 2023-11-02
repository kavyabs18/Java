package com.kodnest.array;

public class PrintElementsInClockwise {
public static void main(String[] args) {
	//declaration and initialization
	int m[][] = {{1,2,3,4,5},{6,7,8,9,10},{11,12,13,14,15},{16,17,18,19,20},{21,22,23,24,25}};
	
	//Display the elements
	for(int i=0; i<m.length; i++) {
		for(int j=0; j<m.length; j++) {
			if(i==0||j==4&&i>0) {
			System.out.print(m[i][j]+" ");
			}
		}
		for(int j=m.length-2; j>=0; j--) {
			if(i==4) {
				System.out.print(m[i][j]+" ");
			}
		}
	}
	for(int i=m.length-2; i>0; i--) {
		for(int j=0; j<m.length-1; j++) {
			if(j==0) {
				System.out.print(m[i][j]+" ");
			}
			if(i==1&&j>0) {
				System.out.print(m[i][j]+" ");
			}
		}
	}
	for(int i=1; i<m.length-1; i++) {
		for(int j=m.length-1; j>0; j--) {
			if(j==3&&i>1&&i<m.length-1) {
				System.out.print(m[i][j]+" ");
			}
			if(i==3&&j<3&&j>0) {
				System.out.print(m[i][j]+" ");
			}
		}
	}
	System.out.print(m[2][1]+" ");
	System.out.print(m[2][2]+" ");
}
}
