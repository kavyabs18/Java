package com.kodnest.String;

import java.io.*;
import java.util.*;
public class regex {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("User please enter a sentence");
        String s = scan.nextLine();
        String []split = s.split("[^a-zA-Z]+");
        //String []split = s.split("[ ,'?]+");
        
        // Write your code here.
        scan.close();
        System.out.println("The substrings are "+(split.length));
        for(int i=0; i<split.length; i++){
            System.out.println(split[i]);
        }
    }
}

//He is a very very good boy, isn't he?
/*  10
	He
	is
	a
	very
	very
	good
	boy
	isn
	t
	he*/