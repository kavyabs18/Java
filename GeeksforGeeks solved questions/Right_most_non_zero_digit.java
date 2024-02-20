package com.kodnest.geeksforgeeks;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Right_most_non_zero_digit {
	public static void main(String args[]) throws IOException {
		BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(read.readLine());
		while (t-- > 0) {
			int n = Integer.parseInt(read.readLine());
			int[] A = new int[n];
			String S[] = read.readLine().split(" ");
			for (int i = 0; i < n; i++)
				A[i] = Integer.parseInt(S[i]);

			Solution3 ob = new Solution3();
			System.out.println(ob.rightmostNonZeroDigit(n, A));
		}
	}
}

//User function Template for Java
class Solution3 {
	static int rightmostNonZeroDigit(int N, int[] A) {
		int c5 = 0;
		for (int i = 0; i < N; i++) {
			while (A[i] > 0 && A[i] % 5 == 0) {
				A[i] /= 5;
				c5++;
			}
		}
		for (int i = 0; i < N; i++) {
			while (c5 != 0 && A[i] > 0 && (A[i] & 1) == 0) {
				A[i] >>= 1;
				c5--;
			}
		}
		int ans = 1;
		for (int i = 0; i < N; i++) {
			ans = (ans * A[i] % 10) % 10;
		}

		if (c5 != 0)
			ans = (ans * 5) % 10;

		if (ans != 0)
			return ans;

		return -1;
	}
}