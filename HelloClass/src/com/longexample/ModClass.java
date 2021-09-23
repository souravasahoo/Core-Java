package com.longexample;

public class ModClass {
	long a = 7736l;
	long b = 474l;

	public void mod() {
		long c = a % b;
		System.out.println("Mod Result : " + c);
	}

	public static void main(String[] args) {
		ModClass srv = new ModClass();
		srv.mod();
	}

}
