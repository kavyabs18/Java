package com.kodnest.entity;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
@Entity
public class Student {
	@Id
	int Id;
	String Name;
	@OneToOne
	Bike bike;
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(int id, String name, Bike bike) {
		super();
		Id = id;
		Name = name;
		this.bike = bike;
	}
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public Bike getBike() {
		return bike;
	}
	public void setBike(Bike bike) {
		this.bike = bike;
	}
	@Override
	public String toString() {
		return Id+" "+Name+" "+" "+bike.getName()+" "+bike.getPrice();
	}
}
