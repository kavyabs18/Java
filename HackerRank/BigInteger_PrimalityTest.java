package com.kodnest.hackerrank;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class BigInteger_PrimalityTest {
	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter an Integer");
		String n = bufferedReader.readLine();
		BigInteger num = new BigInteger(n);
		if (num.isProbablePrime(1)) {
			System.out.println("Prime");
		} else {
			System.out.println("Not Prime");
		}
		bufferedReader.close();
	}
}
