package com.kodnest;

import java.util.ArrayList;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.kodnest.entity.Customer;
import com.kodnest.entity.Product;

public class App1 {
	public static void main(String[] args) {
		Configuration cfg = new Configuration();
    	cfg.configure();
    	
    	SessionFactory factory = cfg.buildSessionFactory();
    	Session session = factory.openSession();
    	
    	try {
//    		Begin Transaction
    		Transaction tr = session.beginTransaction();
    		
    		Product p1 = new Product();
    		p1.setP_Id(3);
    		p1.setP_Name("Prod-3");
    		session.saveOrUpdate(p1);
    		
    		Product p2 = new Product();
    		p2.setP_Id(4);
    		p2.setP_Name("Prod-4");
    		session.save(p2);
    		
    		ArrayList<Product> al = new ArrayList<Product>();
    		al.add(p1);
    		al.add(p2);
    		
    		Customer c = new Customer(2, "John", al);
    		session.saveOrUpdate(c);

    		
//    		Complete the Transaction
    		tr.commit();
    	}catch (Exception e) {
			e.printStackTrace();
		}finally {
//			Close the session and factory
			session.close();
			factory.close();
		}
    	
    	
	}
}
