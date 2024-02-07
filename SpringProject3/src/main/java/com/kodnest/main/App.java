package com.kodnest.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.kodnest.bean.Employee;

public class App {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("application-context.xml");
		Employee bean = (Employee) context.getBean("E1");
		System.out.println(bean);
	}
}
