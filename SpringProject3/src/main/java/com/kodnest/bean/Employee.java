package com.kodnest.bean;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class Employee {
//	String Technologies;
//	String Project;
//	String Organization;

	ArrayList<String> Technologies;
	HashSet<String> Project;
	HashMap<Integer, String> Organization;
	
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employee(ArrayList<String> technologies, HashSet<String> project, HashMap<Integer, String> organization) {
		super();
		Technologies = technologies;
		Project = project;
		Organization = organization;
	}
	
	public ArrayList<String> getTechnologies() {
		return Technologies;
	}
	public void setTechnologies(ArrayList<String> technologies) {
		Technologies = technologies;
	}
	public HashSet<String> getProject() {
		return Project;
	}
	public void setProject(HashSet<String> project) {
		Project = project;
	}
	public HashMap<Integer, String> getOrganization() {
		return Organization;
	}
	public void setOrganization(HashMap<Integer, String> organization) {
		Organization = organization;
	}
	
	@Override
	public String toString() {
		return "Employee [Technologies=" + Technologies + ", Project=" + Project + ", Organization=" + Organization
				+ "]";
	}
}
