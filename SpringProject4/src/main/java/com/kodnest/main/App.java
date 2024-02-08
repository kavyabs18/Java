package com.kodnest.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.kodnest.bean.Trainer;
import com.kodnest.bean.University;

public class App {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("application-context.xml");
		Trainer bean = (Trainer) context.getBean("Trainer");
		System.out.println(bean);
		University bean1 = (University) context.getBean("U1");
		System.out.println(bean1);
	}
}
