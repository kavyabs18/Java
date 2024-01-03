package com.kodnest.thread;

public class joinThreadUingThreadClass {
	public static void main(String[] args) {
		System.out.println("main() start");
		printNumber printNum = new printNumber();
		Thread.currentThread().setPriority(8);
		System.out.println(Thread.currentThread());
//		printNum.setPriority(6);
		printNum.start();
		
		try {
			printNum.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("main() stop");
	}
}
class printNumber extends Thread{
	public void run() {
		Thread.currentThread().setPriority(6);
		System.out.println(Thread.currentThread());
		for(int i=0; i<11; i++) {
			System.out.print(i+" ");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}