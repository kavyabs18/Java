package com.kodnest.banking;

class SingleInheritance {
	public static void main(String[] args) {
		Child child = new Child();
		System.out.println(child.getPmoney());
		System.out.println(child.cmoney);
		child.setPmoney(500);
		
		Parent parent = new Parent();
		System.out.println(parent.getPmoney());
		parent.setPmoney(2000);
		System.out.println(parent.getPmoney());
	}
}
