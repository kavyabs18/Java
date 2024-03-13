package com.kodnest.hackerrank;

import static java.util.stream.Collectors.toList;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import java.util.stream.Stream;
public class Mini_Max_Sum {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        
        System.out.println("Enter array elements with spaces");
        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        MiniMaxSum.miniMaxSum(arr);

        bufferedReader.close();
    }
}


class MiniMaxSum {

    /*
     * Complete the 'miniMaxSum' function below.
     *
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static void miniMaxSum(List<Integer> arr) {
    // Write your code here
    long min = 0;
    long max = 0;
    arr.sort(null);
    for(int i=0; i<arr.size(); i++){
        if(i<(arr.size()-1)){
            min += arr.get(i);
        }
        if(i>0){
            max += arr.get(i);
        }
    }
    System.out.println(min+" "+max);

    }

}