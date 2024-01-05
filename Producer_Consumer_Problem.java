package com.kodnest.thread;

public class Producer_Consumer_Problem {
	public static void main(String[] args) {
		Factory f = new Factory();
		Producer p = new Producer(f);
		Consumer c = new Consumer(f);
		Thread t1 = new Thread(p);
		Thread t2 = new Thread(c);
		t1.start();	
		t2.start();
	}
}

class Producer implements Runnable{
	Factory f;
	public Producer(Factory f) {
		this.f = f;
	}
	
	@Override
	public void run() {
		int i=0;
		while(true) {
			f.produce(i++);	
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

class Consumer implements Runnable{
	Factory f;
	public Consumer(Factory f) {
		this.f = f;
	}
	
	@Override
	public void run() {
		int i=0;
		while(true) {
			f.consume(i++);	
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

class Factory{
	int num;
	boolean flag = false;
	synchronized void produce(int num) {
		try {
			if(!flag) {
				this.num = num;
				System.out.println("Produced item : "+num);
				flag = true;
				notify();
			}
			else {
				wait();
			}			
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
	synchronized void consume(int num) {
		try {
			if(flag) {
				this.num = num;
				System.out.println("Consumed item : "+num);	
				flag = false;
				notify();
			}
			else {
				wait();
			}			
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
}