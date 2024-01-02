package com.kodnest.thread;

public class DaemonThread {
	public static void main(String[] args) {
		Thread.currentThread().setPriority(8);
		System.out.println(Thread.currentThread());
		
		Task1 task1 = new Task1("Typing");
		Task2 task2 = new Task2("Auto-Correction");
		Task3 task3 = new Task3("Auto-Suggestion");
		
		task1.start();
		
		task2.setDaemon(true);
		task3.setDaemon(true);
		
		task2.setPriority(1);
		task3.setPriority(1);
		task2.start();
		task3.start();
		
	}
}
class Task1 extends Thread{
	public void run() {
		System.out.println(Thread.currentThread());
		typing();
	}
	Task1(String name){
		super(name);
	}
	void typing() {
		for(int i=0; i<=10; i++) {
			System.out.println("Typing....");
			
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

class Task2 extends Thread{
	public void run() {
		System.out.println(Thread.currentThread());
		autoCorrection();
	}
	Task2(String name){
		super(name);
	}
	void autoCorrection() {
		for(; ;) {
			System.out.println("Auto-Correction");
			
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

class Task3 extends Thread{
	public void run() {
		System.out.println(Thread.currentThread());
		autoSuggestion();
	}
	Task3(String name){
		super(name);
	}
	void autoSuggestion() {
		for(; ;) {
			System.out.println("Auto-Suggestion");
			
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}