package com.kodnest.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Product {
	@Id
	int P_Id;
	String P_Name;
	@ManyToOne
	Customer c;
	
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Product(int p_Id, String p_Name, Customer c) {
		super();
		P_Id = p_Id;
		P_Name = p_Name;
		this.c = c;
	}
	
	public int getP_Id() {
		return P_Id;
	}
	public void setP_Id(int p_Id) {
		P_Id = p_Id;
	}
	public String getP_Name() {
		return P_Name;
	}
	public void setP_Name(String p_Name) {
		P_Name = p_Name;
	}
	public Customer getC() {
		return c;
	}
	public void setC(Customer c) {
		this.c = c;
	}
	
}
