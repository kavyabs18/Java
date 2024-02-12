package com.kodnest;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import com.kodnest.entity.Bike;
import com.kodnest.entity.Student;

public class App 
{
    public static void main( String[] args )
    {
    	Configuration cfg = new Configuration();
    	cfg.configure();
    	
    	SessionFactory factory = cfg.buildSessionFactory();
    	Session session = factory.openSession();
    	Transaction tr = session.beginTransaction();
    	
    	Bike bike = new Bike("KTM",3);
    	Student s = new Student(1, "John", bike);
    	
    	session.saveOrUpdate(bike);
    	session.saveOrUpdate(s);
    	
//    	Student s = new Student(2,"Jack");
//    	session.save(s);
//    	session.update(s);
//    	session.delete(s);
    	
    	List<Student> stud = session.createQuery("from Student where Id>1").list();
//    	System.out.println(stud+"\n");
//    	for (Student student : stud) {
//    		System.out.println(student);
//    	}
    	
//    	Student student = session.get(Student.class, 1);
//    	System.out.println("By using get()");
//    	System.out.println(student.getId()+">>>>"+student.getName());
//    	System.out.println("-----------------\n"+"By using toString()");
//    	System.out.println(student);

    	tr.commit();
    	session.close();
    	factory.close();
    }
}
