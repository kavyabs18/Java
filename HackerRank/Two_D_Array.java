package com.kodnest.hackerrank;

import static java.util.stream.Collectors.toList;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Two_D_Array {

	public static void main(String[] args) throws IOException {
//		print the largest sum among all the hourglasses in the array.
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

		List<List<Integer>> arr = new ArrayList<>();

		System.out.println("Enter Array Elements in hourglass");
		IntStream.range(0, 6).forEach(i -> {
			try {
				arr.add(Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" ")).map(Integer::parseInt)
						.collect(toList()));
			} catch (IOException ex) {
				throw new RuntimeException(ex);
			}
		});
		int max_sum = Integer.MIN_VALUE;
		for (int a = 0; a < arr.size() - 2; a++) {
			for (int b = 0; b < arr.size() - 2; b++) {
				int sum = arr.get(a).get(b) + arr.get(a).get(b + 1) + arr.get(a).get(b + 2) + arr.get(a + 1).get(b + 1)
						+ arr.get(a + 2).get(b) + arr.get(a + 2).get(b + 1) + arr.get(a + 2).get(b + 2);
				if (sum > max_sum) {
					max_sum = sum;
				}
			}
		}
		System.out.println("Sum of  elements in hourglass : "+max_sum);

		bufferedReader.close();
	}
}
