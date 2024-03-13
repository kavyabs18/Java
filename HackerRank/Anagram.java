package com.kodnest.hackerrank;
import java.util.Scanner;

public class Anagram {
    static boolean isAnagram(String a, String b) {
        // Complete the function
        a = a.toLowerCase();
        b = b.toLowerCase();
        char arr[] = a.toCharArray();
        char brr[] = b.toCharArray();
        
        java.util.Arrays.sort(arr);
        java.util.Arrays.sort(brr);
    
        return java.util.Arrays.equals(arr, brr);
    }

  public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}
