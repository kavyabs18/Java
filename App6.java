package com.kodnest.methods1;

import java.util.Scanner;

public class App6 {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.println("User! please enter temperature in Farenheit");
		double farenheit=scan.nextDouble();
		
		Question6 q6= new Question6();
		double C = q6.convertFarenheitToCelcius(farenheit);
		
		System.out.println("The temperature converted to Celcius is "+C);
	}
}
