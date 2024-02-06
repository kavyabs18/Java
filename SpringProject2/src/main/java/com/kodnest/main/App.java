package com.kodnest.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.kodnest.bean.Laptop;

public class App {
public static void main(String[] args) {
	ClassPathXmlApplicationContext context = 
			new ClassPathXmlApplicationContext("application-context.xml");
	Laptop bean1 = (Laptop) context.getBean("L1");
	System.out.println(bean1);
	Laptop bean2 = (Laptop) context.getBean("L2");
	System.out.println(bean2);
}
}
