package com.kodnest.thread;

public class ThreadSync {
	public static void main(String[] args) {
		Hospital task = new Hospital();
		
		Thread t1 = new Thread(task);
		t1.setName("Thor");
		
		Thread t2 = new Thread(task);
		t2.setName("Iron Man");
		
		t1.start();
		t2.start();
	}
}

class Hospital implements Runnable{
	
	@Override
	public synchronized void run() {
		
		try {
			String name = Thread.currentThread().getName();
			System.out.println(name+" is in ICU");
			Thread.sleep(2000);
			System.out.println(name+" is getting Treatment");
			Thread.sleep(2000);
			System.out.println(name+" is getting Discharged");			
		}
		catch(Exception e){
			System.out.println("Exception Handled");
		}
	}
}