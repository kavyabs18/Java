package com.kodnest.hackerrank;

import static java.util.stream.Collectors.toList;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;
import java.io.FileWriter;
import java.io.IOException;

public class Diagonal_Difference {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("output.txt"));

        System.out.println("Enter square matrix size");
        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<List<Integer>> arr = new ArrayList<>();

        System.out.println("Enter array elements");
        IntStream.range(0, n).forEach(i -> {
            try {
                arr.add(
                    Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                        .map(Integer::parseInt)
                        .collect(toList())
                );
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        int result = DiagDiff.diagonalDifference(arr);
        System.out.println("Difference in diagonals : "+result);

        bufferedReader.close();
        bufferedWriter.close();
    }
}


class DiagDiff {

    /*
     * Complete the 'diagonalDifference' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts 2D_INTEGER_ARRAY arr as parameter.
     */

    public static int diagonalDifference(List<List<Integer>> arr) {
    // Write your code here
    int sum = 0;
    int add = 0;
    for(int i=0; i<arr.size(); i++){
        for(int j=0; j<arr.get(i).size(); j++){
            if(i==j){
                sum += arr.get(i).get(j);
            }
            if((i+j)==arr.size()-1){
                add += arr.get(i).get(j);
            }
        }
    }
    if(sum>add){
        return (sum-add);
    }
    return (add-sum);
    }

}
