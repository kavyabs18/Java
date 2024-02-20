package com.kodnest.geeksforgeeks;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Divisible_Numbers {
	public static void main(String args[]) throws IOException {
		BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(read.readLine());
		while (t-- > 0) {
			String S[] = read.readLine().split(" ");
			long A = Long.parseLong(S[0]);
			long B = Long.parseLong(S[1]);
			Solution2 ob = new Solution2();
			System.out.println(ob.find(A, B));
		}
	}
}

//User function Template for Java
class Solution2 {
	static long find(long A, long B) {
		long i = A;
		while (i < A + B) {
			if (++i % B == 0) {
				break;
			}
		}
		return i;
	}
}