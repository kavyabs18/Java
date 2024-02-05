package com.kodnest.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.kodnest.bean.Student;
import com.kodnest.bean.University;

public class App {
public static void main(String[] args) {
	ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("application-context.xml");
	
	Student bean = (Student) context.getBean("S1");
	System.out.println(bean);
	
	University bean1 = (University) context.getBean("U1");
	System.out.println(bean1);
}
}
