package com.kodnest.hackerrank;

import java.util.Scanner;

public class Inter_face {

	    public static void main(String []args){
	        MyCalculator my_calculator = new MyCalculator();
	        System.out.print("I implemented: ");
	        ImplementedInterfaceNames(my_calculator);
	        Scanner sc = new Scanner(System.in);
	        System.out.println("Enter an Integer");
	        int n = sc.nextInt();
	        System.out.print("Sum of Divisors : "+my_calculator.divisor_sum(n) + "\n");
	      	sc.close();
	    }
	    /*
	     *  ImplementedInterfaceNames method takes an object and prints the name of the interfaces it implemented
	     */
	    static void ImplementedInterfaceNames(Object o){
	        Class[] theInterfaces = o.getClass().getInterfaces();
	        for (int i = 0; i < theInterfaces.length; i++){
	            String interfaceName = theInterfaces[i].getName();
	            System.out.println(interfaceName);
	        }
	    }

}
interface AdvancedArithmetic{
  int divisor_sum(int n);
}

//Write your code here
class MyCalculator implements AdvancedArithmetic{
    public int divisor_sum(int n){
        int sum=0;
        for(int i=1; i<=n; i++){
            if(n%i==0){
                sum+=i;
            }
        }
        return sum;
    }
}