package com.kodnest.methods1;

public class Application {

public static void main(String[] args) {
	Employee e=new Employee();
	e.name="Kavya";
	e.age=21;
	e.id="4JD19CV028";
	e.salary=30000;
	System.out.println(e.name);
	System.out.println(e.age);
	System.out.println(e.id);
	System.out.println(e.salary);
	e.work();
	e.meeting();
	Employee a=new Employee();
	a.name="Neela";
	a.age=21;
	a.id="4JD19CV046";
	a.salary=35000;
	System.out.println(a.name);
	System.out.println(a.age);
	System.out.println(a.id);
	System.out.println(a.salary);
	a.work();
	a.meeting();
}
}
