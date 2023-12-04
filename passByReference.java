package com.kodnest.main;

class passByReference {
	public static void main(String[] args) {
		int x=10;
		modifyPrimitive(x);
		System.out.println("Primitive: "+x);
		
		StringBuilder sb = new StringBuilder("Hello");
		modifyObject(sb);
		System.out.println("Object: "+sb.toString());
	}

	public static void modifyPrimitive(int num) {
		num=20;
	}
	
	public static void modifyObject(StringBuilder str) {
		str.append("World");
	}

}
