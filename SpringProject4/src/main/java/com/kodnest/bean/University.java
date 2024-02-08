package com.kodnest.bean;

public class University {
	int Uid;
	String Uname;
	Trainer trainer;
	
	public University() {
		super();
		System.out.println("Constructor without parameter");
		// TODO Auto-generated constructor stub
	}
	public University(int uid, String uname, Trainer trainer) {
		super();
		System.out.println("Constructor with parameter");
		Uid = uid;
		Uname = uname;
		this.trainer = trainer;
	}

	@Override
	public String toString() {
		return "University [Uid=" + Uid + ", Uname=" + Uname + ", Trainer=" + trainer + "]";
	}

	public int getUid() {
		System.out.println("getter-Uid");
		return Uid;
	}
	public void setUid(int uid) {
		System.out.println("setter-Uid");
		Uid = uid;
	}
	public String getUname() {
		System.out.println("getter-Uname");
		return Uname;
	}
	public void setUname(String uname) {
		System.out.println("setter-Uname");
		Uname = uname;
	}
	public Trainer getTrainer() {
		System.out.println("getter-Trainer");
		return trainer;
	}
	public void setTrainer(Trainer trainer) {
		System.out.println("setter-Trainer");
		this.trainer = trainer;
	}
}
