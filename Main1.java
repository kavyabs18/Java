package com.kodnest.thread;

public class Main1 {
	public static void main(String[] args) {
		Print_Alpha a = new Print_Alpha();
		Print_Num n = new Print_Num();
		
		Thread thread1 = new Thread(a);
		Thread thread2 = new Thread(n);
		thread1.start();
		thread1.setName("first-thread");
		thread2.start();
		thread2.setName("second-thread");
	}
}


class Print_Alpha implements Runnable{
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

class Print_Num implements Runnable{
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