package com.kodnest.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;

@Entity
public class Customers {
	int C_Id;
	String C_Name;
	@ManyToMany
	List<Products> p;
	
	public Customers() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Customers(int c_Id, String c_Name, List<Products> p) {
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

	public List<Products> getP() {
		return p;
	}

	public void setP(List<Products> p) {
		this.p = p;
	}
}
