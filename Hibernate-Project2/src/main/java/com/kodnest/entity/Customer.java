package com.kodnest.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Customer {
	@Id
	int C_Id;
	String C_Name;
	@OneToMany
	List<Product> p;

	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Customer(int c_Id, String c_Name, List<Product> p) {
		super();
		C_Id = c_Id;
		C_Name = c_Name;
		this.p = p;
	}
	
	public int getC_Id() {
		return C_Id;
	}
	public void setC_Id(int c_Id) {
		C_Id = c_Id;
	}
	public String getC_Name() {
		return C_Name;
	}
	public void setC_Name(String c_Name) {
		C_Name = c_Name;
	}
	public List<Product> getP() {
		return p;
	}
	public void setP(List<Product> p) {
		this.p = p;
	}
	
}
