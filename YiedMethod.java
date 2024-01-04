package com.kodnest.thread;

public class YiedMethod {
	public static void main(String[] args) {
		Sum s= new Sum();
		Thread t = new Thread(s);
		t.start();
		
		for(int i=0; i<11; i++) {
			System.out.println(i);
			Thread.currentThread().yield();
		}
	}
}

class Sum implements Runnable{
	public void run() {
		for(char i='a'; i<'l'; i++) {
			System.out.println(i);
		}
	}
}