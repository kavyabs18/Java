package com.kodnest.thread;

public class Main {
	public static void main(String[] args) {
		printAlpha a = new printAlpha();
		printNum n = new printNum();
		
		a.start();
		a.setName("first-thread");
		n.start();
		n.setName("second-thread");
	}
}

class printAlpha extends Thread{
	public void run() {
		Thread currentThread = Thread.currentThread();
		System.out.println(currentThread);
		for(int i='a'; i<'l'; i++) {
			System.out.print((char)i+" ");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println();
	}
}

class printNum extends Thread{
	public void run() {
		Thread currentThread = Thread.currentThread();
		System.out.println(currentThread);
		for(int i=0; i<11; i++) {
			System.out.print(i+" ");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println();	
	}
}