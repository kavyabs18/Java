package com.kodnest;

import java.util.ArrayList;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.kodnest.entity.Customers;
import com.kodnest.entity.Products;

public class App2 {
	public static void main(String[] args) {
		Configuration cfg = new Configuration();
    	cfg.configure();
    	
    	SessionFactory factory = cfg.buildSessionFactory();
    	Session session = factory.openSession();
    	
    	try {
//    		Begin Transaction
    		Transaction tr = session.beginTransaction();
    		
    		Products p1 = new Products();
    		p1.setP_Id(1);
    		p1.setP_Name("Prod-1");
    		
    		Products p2 = new Products();
    		p2.setP_Id(2);
    		p2.setP_Name("Prod-2");
    		
    		ArrayList<Products> al = new ArrayList<Products>();
    		al.add(p1);
    		al.add(p2);
    		
    		Customers c1 = new Customers(1, "Akash", al);
    		Customers c2 = new Customers(2, "Ajay", al);
    		
    		ArrayList<Customers> c = new ArrayList<Customers>();
    		c.add(c1);
    		c.add(c2);
    		p1.setC(c);
    		p2.setC(c);
    		session.saveOrUpdate(p1);
    		session.saveOrUpdate(p2);
    		session.saveOrUpdate(c1);
    		session.saveOrUpdate(c2);
    		
    		session.saveOrUpdate(c1);
    		session.saveOrUpdate(c2);

    		
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
