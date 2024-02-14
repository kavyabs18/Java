package com.kodnest.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;

@Entity
public class Products {
	int P_Id;
	String P_Name;
	@ManyToMany
	List<Customers> c;
	
	public Products() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Products(int p_Id, String p_Name, List<Customers> c) {
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
	public List<Customers> getC() {
		return c;
	}
	public void setC(List<Customers> c) {
		this.c = c;
	}
}
