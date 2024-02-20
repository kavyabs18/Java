package com.kodnest.geeksforgeeks;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Count_Squares {
	public static void main(String args[]) throws IOException {
		BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(read.readLine());
		while (t-- > 0) {
			int N = Integer.parseInt(read.readLine());

			Solution1 ob = new Solution1();
			System.out.println(ob.countSquares(N));
		}
	}
}

//User function Template for Java
class Solution1 {
	static int countSquares(int N) {
		int count = 0;
		for (int i = 1; i * i < N; i++) {
			if (Math.sqrt(i) < N) {
				count++;
			}
		}
		return count;
	}
}