package com.example.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Product {
	@Id
	long pid;
	String pname;
	String ptxno;
	String pdetails;
	boolean pstatus;
	
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Product(long pid, String pname, String ptxno, String pdetails, boolean pstatus) {
		super();
		this.pid = pid;
		this.pname = pname;
		this.ptxno = ptxno;
		this.pdetails = pdetails;
		this.pstatus = pstatus;
	}
	public long getPid() {
		return pid;
	}
	public void setPid(long pid) {
		this.pid = pid;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public String getPtxno() {
		return ptxno;
	}
	public void setPtxno(String ptxno) {
		this.ptxno = ptxno;
	}
	public String getPdetails() {
		return pdetails;
	}
	public void setPdetails(String pdetails) {
		this.pdetails = pdetails;
	}
	public boolean getPstatus() {
		return pstatus;
	}
	public void setPstatus(boolean pstatus) {
		this.pstatus = pstatus;
	}
	@Override
	public String toString() {
		return "Product [pid=" + pid + ", pname=" + pname + ", ptxno=" + ptxno + ", pdetails=" + pdetails + ", pstatus="
				+ pstatus + "]";
	}
}
