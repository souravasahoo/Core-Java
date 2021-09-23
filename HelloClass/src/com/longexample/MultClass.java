package com.longexample;

public class MultClass {
	long a = 3673l;
	long b = 3536l;

	public void multi() {
		long c = a * b;
		System.out.println("Multiplication of TYwo Number :" + c);
	}

	public static void main(String[] args) {
		MultClass srv = new MultClass();
		srv.multi();
	}

}
