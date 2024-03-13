package com.kodnest.hackerrank;

import static java.util.stream.Collectors.toList;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import java.util.stream.Stream;

public class plusMinus {
	public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter array size");
        int n = Integer.parseInt(bufferedReader.readLine().trim());

        System.out.println("Enter array elements with spaces");
        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        Result.plusMinus(arr);

        bufferedReader.close();
    }
}

	class Result {

	    /*
	     * Complete the 'plusMinus' function below.
	     *
	     * The function accepts INTEGER_ARRAY arr as parameter.
	     */

	    public static void plusMinus(List<Integer> arr) {
	    // Write your code here
	    float pos = 0;
	    float neg = 0;
	    float zero = 0;
	    for(int i=0; i<arr.size(); i++){
	        if(arr.get(i)>0){
	            pos+=1;
	        }else if(arr.get(i)<0){
	            neg+=1;
	        }else{
	            zero+=1;
	        }
	    }
	    System.out.println(pos/arr.size());
	    System.out.println(neg/arr.size());
	    System.out.println(zero/arr.size());
	    }

	}
