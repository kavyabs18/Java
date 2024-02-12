package com.kodnest.entity;
import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
public class Bike {
	@Id
	private String Name;
	private int Price;
	public Bike(String name, int price) {
		super();
		Name = name;
		Price = price;
	}
	public Bike() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public int getPrice() {
		return Price;
	}
	public void setPrice(int price) {
		Price = price;
	}
	@Override
	public String toString() {
		return Name+" "+Price;
	}
	
}
