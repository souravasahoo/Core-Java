package com.longexample;

public class DivisionClass {
	long a = 756567l;
	long b = 6367l;

	public void div() {
		long c = a / b;
		System.out.println("Division Result : " + c);

	}

	public static void main(String[] args) {
		DivisionClass srv = new DivisionClass();
		srv.div();

	}

}
