package com.longexample;

public class AdditionClass {
	long a = 56766;
	long b = 4546;

	public void add() {
		long c = a + b;
		System.out.println("Addition of Two Number : " + c);

	}

	public static void main(String[] args) {
		AdditionClass srv = new AdditionClass();
		srv.add();
	}

}
