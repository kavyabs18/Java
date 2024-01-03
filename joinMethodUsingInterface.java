package com.kodnest.thread;

public class joinMethodUsingInterface {
	public static void main(String[] args) {
		System.out.println("main() start");
		join join = new join();
		Thread thread = new Thread(join);
		thread.start();

		try {
			thread.join(1000,999999);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("main() stop");
	}
}
class join implements Runnable{
	public void run() {
		for(int i=1; i<11; i++) {
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