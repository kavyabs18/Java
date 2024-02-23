package com.kodnest.data_structures;

import java.util.Scanner;

public class DoublyLinkedList_App {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		DoublyLinkedList dl = new DoublyLinkedList();
		while(true) {
			System.out.println("Press:1 -------> Insert Front");
			System.out.println("Press:2 -------> Insert Rare");
			System.out.println("Press:3 -------> Delete Front");
			System.out.println("Press:4 -------> Delete Rare");
			System.out.println("Press:5 -------> Display Forward");
			System.out.println("Press:6 -------> Display Reverse");
			System.out.println("Enter your choice");
			int choice = scan.nextInt();
			switch(choice) {
			case 1: dl.insertfront();
					break;
					
			case 2: dl.insertrare();
					break;
					
			case 3: dl.deletefront();
					break;
					
			case 4: dl.deleterare();
					break;
					
			case 5: dl.displayforward();
					break;
					
			case 6: dl.displayreverse();
					break;
					
			default: System.exit(0);
			}
		}		
	}
}
class DoublyLinkedList{
	private Scanner scan = new Scanner(System.in);
	private Node first;
	class Node{
		Node prevlink;
		int data;
		Node nextlink;
	}
	public void insertfront() {
		Node newNode = new Node();
		System.out.println("Enter an Element");
		int elem=scan.nextInt();
		newNode.data=elem;
		newNode.prevlink=null;
		newNode.nextlink=null;
		if(first==null) {
			first=newNode;
		}
		else {
			newNode.nextlink=first;
			first.prevlink=newNode;
			first=newNode;
		}
	}
	public void insertrare() {
		Node temp;
		Node newNode = new Node();
		System.out.println("Enter an Element");
		int elem = scan.nextInt();
		newNode.data=elem;
		newNode.prevlink=null;
		newNode.nextlink=null;
		if(first==null) {
			first=newNode;
		}
		else {
			temp=first;
			while(temp.nextlink!=null) {
				temp=temp.nextlink;
			}
			temp.nextlink=newNode;
			newNode.prevlink=temp;
		}
	}
	public void deletefront() {
		if(first==null) {
			System.out.println("Deletion Not Possible");
		}
		else if(first.nextlink==null){
			System.out.println("Element deleted is "+first.data);
			first=null;
		}
		else {
			System.out.println("Element deleted is "+first.data);
			first=first.nextlink;
			first.prevlink=null;
		}
	}
	public void deleterare() {
		Node temp;
		if(first==null) {
			System.out.println("Deletion Not Possible");
		}
		else if(first.nextlink==null) {
			System.out.println("Element deleted is "+first.data);
			first=null;
		}
		else {
			temp=first;
			while(temp.nextlink.nextlink!=null) {
				temp=temp.nextlink;
			}
			System.out.println("Element deleted is "+temp.nextlink.data);
			temp.nextlink=null;
		}
	}
	public void displayforward() {
		if(first==null) {
			System.out.println("Display Not Possible");
		}
		else if(first.nextlink==null){
			System.out.println(first.data);
		}
		else {
			Node temp = first;
			while(temp!=null) {
				System.out.print(temp.data+" ");
				temp=temp.nextlink;
			}
			System.out.println();			
		}
	}
	public void displayreverse() {
		if(first==null) {
			System.out.println("Display Not Possible");
		}
		else if(first.nextlink==null) {
			System.out.println(first.data);;
		}
		else {
			Node temp = first;
			while(temp.nextlink!=null) {
				temp = temp.nextlink;
			}
			while(temp!=null) {
				System.out.print(temp.data+" ");
				temp = temp.prevlink;
			}
			System.out.println();
		}
	}
}